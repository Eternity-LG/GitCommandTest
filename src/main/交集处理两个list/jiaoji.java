package main.交集处理两个list;

import java.util.HashSet;

public class jiaoji {
    public static void main(String[] args) {
        HashSet<Object> set2 = new HashSet<>();
        set2.add("test");
        set2.add("test2");
        set2.add("test3");
        HashSet<Object> set1 = new HashSet<>();
        set1.add("test");
        set1.add("test2");
        boolean isTrue = set1.removeAll(set2);
        System.out.println(isTrue);
    }
}
