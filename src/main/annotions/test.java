package main.annotions;

import java.lang.annotation.*;


/**
 * @author ：liugeng
 * @date ：Created in 2021/4/6 15:51
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(value = ElementType.METHOD)
public @interface test {
}


class top {
    public static void main(String[] args) {
        System.out.println("test");
    }
}
