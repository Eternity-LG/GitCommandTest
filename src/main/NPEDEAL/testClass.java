package main.NPEDEAL;


import main.zool.Cat;

import java.util.HashMap;

public class testClass implements Next {

    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.birth();
        String s = ObjectNullUtil.fixNull(() -> {
            HashMap<Object, Object> map = new HashMap<>();
            //这块会导致空指针

            if (map.get("dsd") == null) {
                System.out.println("test");
            }
            return (String) map.get("string");
        }, e -> {
            e.printStackTrace();
            System.out.println(e.getMessage());
            return "error";
        });

    }

    @Override
    public void ssr() {

    }

    @Override
    public void sout() {

    }
}

