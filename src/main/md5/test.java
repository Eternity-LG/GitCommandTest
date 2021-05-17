package main.md5;

import java.io.File;

/**
 * @author ：liugeng
 * @date ：Created in 2021/4/9 16:18
 */
public class test {
    public static void main(String[] args) {
        File file = new File("D:\\CompanyApplication\\Postmanfiles\\123.txt.gz");
        String s = MD5Util.md5(file);
        System.out.println(s);
    }
}
