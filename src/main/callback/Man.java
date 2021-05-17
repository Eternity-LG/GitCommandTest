package main.callback;

import java.util.concurrent.Callable;

/**
 * @author ：liugeng
 * @date ：Created in 2021/4/8 11:29
 */
public class Man implements Callable {
    Woman woman;
    public Man(Woman woman) {
        this.woman = woman;
    }

    public void waits() throws InterruptedException {
        System.out.println("等你一起");
        new Thread(new Runnable() {
            @Override
            public void run() {
                woman.wc(Man.this);
            }
        }).start();
        System.out.println("等你3秒");
        Thread.sleep(3000);
        System.out.println("到点了，我先走了");
    }

    @Override
    public Object call() throws Exception {
        System.out.println("好吧");
        return "";
    }

    public static void main(String[] args) throws InterruptedException {
        Woman woman = new Woman();
        Man man = new Man(woman);
        man.waits();
    }
}
