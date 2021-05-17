package main.NPEDEAL;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class listNullTest {
    public static void main(String[] args) {
        ArrayList<Map> strings = new ArrayList<>();
        HashMap<String, Object> map = new HashMap<>();
        String test = (String) map.get("test");
        test.split(",");
        System.out.println(map.toString());

    }
}

