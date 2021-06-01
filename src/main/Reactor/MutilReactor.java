package main.Reactor;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author ：liugeng
 * @date ：Created in 2021/4/8 17:24
 */
public class MutilReactor {
    public static ExecutorService service = Executors.newFixedThreadPool(100);

    public static void main(String[] args) throws IOException {
        Selector selector = Selector.open();
        ServerSocketChannel socketChannel = ServerSocketChannel.open();
        socketChannel.configureBlocking(false);
        socketChannel.bind(new InetSocketAddress(1234));
        socketChannel.register(selector, SelectionKey.OP_ACCEPT);
        int count = Runtime.getRuntime().availableProcessors();
        while (true) {
            if (selector.selectNow() > 0) {
                Set<SelectionKey> sets = selector.selectedKeys();
                Iterator<SelectionKey> keys = sets.iterator();
                while (keys.hasNext()) {
                    SelectionKey key = keys.next();
                    keys.remove();
                    if (key.isAcceptable()) {
                        ServerSocketChannel serverSocketChannel = (ServerSocketChannel) key.channel();
                        SocketChannel channel = serverSocketChannel.accept();
                        channel.configureBlocking(false);
                        System.out.println("accept from " + channel.socket().getInetAddress().toString());
                        channel.register(selector, SelectionKey.OP_READ);
                    } else if (key.isValid() && key.isReadable()) {
                        service.submit(new Process(key));
                    }
                }
            }
        }
    }
}

class Processor implements Callable {
    SelectionKey key;

    public Processor(SelectionKey key) {
        this.key = key;
    }

    @Override
    public Object call() throws Exception {
        ByteBuffer buffer = ByteBuffer.allocate(1024);
        SocketChannel socketChannel = (SocketChannel) key.channel();
        int count = socketChannel.read(buffer);
        if (count < 0) {
            key.cancel();
            socketChannel.close();

            System.out.println("Received invalide data, close the connection");
            return null;
        } else if (count == 0) {
            return null;
        }
        System.out.println("Received message" + new String(buffer.array()));
        System.out.println("current thread" + Thread.currentThread().toString());
        return null;
    }
}

