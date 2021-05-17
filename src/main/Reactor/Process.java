package main.Reactor;

import java.nio.ByteBuffer;
import java.nio.channels.SelectionKey;
import java.nio.channels.SocketChannel;
import java.util.concurrent.Callable;

/**
 * @author ：liugeng
 * @date ：Created in 2021/4/8 17:46
 */
public class Process implements Callable {
    SelectionKey key;

    public Process(SelectionKey key) {
        this.key = key;
    }

    @Override
    public Object call() throws Exception {
        ByteBuffer byteBuffer = ByteBuffer.allocate(20);
        SocketChannel channel = (SocketChannel) key.channel();
        int read = channel.read(byteBuffer);
        if (read < 0) {
            key.cancel();
            channel.close();
            System.out.println("Received invalide data, close the connection");
            return null;
        } else if (read == 0) {
            return null;
        }else{
            System.out.println("Received message" + new String(byteBuffer.array()));
            System.out.println("current thread" + Thread.currentThread().toString());
        }
        return null;
    }
}
