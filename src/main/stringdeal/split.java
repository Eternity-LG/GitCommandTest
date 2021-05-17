package main.stringdeal;


//当字符串为null运行时会报NPE
public class split {
    public static void main(String[] args) {
        String a = null;
        a.split(",");
        System.out.println("nihao ");
    }
}
