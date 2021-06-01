package main.callback;

import java.util.concurrent.Callable;

/**
 * @author ：liugeng
 * @date ：Created in 2021/4/8 11:29
 */
public class Woman {

    public void wc(Callable callable) {
        try {
            System.out.println("我得5s");
            Thread.sleep(5000);
            callable.call();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
