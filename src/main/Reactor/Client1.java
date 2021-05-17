package main.Reactor;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SocketChannel;
import java.util.Date;

public class Client1 {

    public static void main(String[] args) throws IOException, InterruptedException {
        SocketChannel socketChannel;
        socketChannel = SocketChannel.open();
        //socketChannel.configureBlocking(false);
        socketChannel.connect(new InetSocketAddress("localhost", 1234));
        Date now = new Date();
        String str = "sadjfhlkjadshfjasld;kfj;asljdf;ajdfl;saj;lfk";
        byte[] requst = str.getBytes();
        ByteBuffer buffer = ByteBuffer.allocate(requst.length);
        buffer.put(requst);
        buffer.flip();
        try {
            while (buffer.hasRemaining()) {
                socketChannel.write(buffer);
            }
        }catch (IOException e) {
            e.printStackTrace();
        }
        socketChannel.close();
    }
}