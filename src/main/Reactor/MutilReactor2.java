package main.Reactor;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.SocketChannel;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author ：liugeng
 * @date ：Created in 2021/4/9 9:37
 */
public class MutilReactor2 {
    public static void main(String[] args) {

    }

}

class FollowReactor {
    private Selector selector;
    private ExecutorService service = Executors.newFixedThreadPool(4);

    public FollowReactor(Selector selector) throws IOException {
        selector = Selector.open();
        select();
    }

    public void wake() {
    }

    private void select() {
        service.submit(() -> {
            while (true) {
                if (selector.select(500) <= 0) {
                    continue;
                }
                Set<SelectionKey> keys = selector.selectedKeys();
                Iterator<SelectionKey> iterator = keys.iterator();
                while (iterator.hasNext()) {
                    SelectionKey key = iterator.next();
                    iterator.remove();
                    if (key.isReadable()) {
                        ByteBuffer buffer = ByteBuffer.allocate(1024);
                        SocketChannel channel = (SocketChannel) key.channel();
                        int count = channel.read(buffer);
                        if (count < 0) {
                            channel.close();
                            key.cancel();
                            System.out.println(channel + "->red end !");
                            continue;
                        } else if (count == 0) {
                            System.out.println(channel + ",size is 0 !");
                            continue;
                        } else {
                            System.out.println(channel + ",message is :" + new String(buffer.array()));

                        }
                    }
                }
            }
        });
    }

}
