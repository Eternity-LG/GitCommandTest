package main.hashmap;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * @author £∫liugeng
 * @date £∫Created in 2021/4/20 10:01
 */
public class MapTest {
    public static void main(String[] args) {
        HashMap<String, Object> stringObjectHashMap = new HashMap<>();
        ArrayList<HashMap<String, Object>> list = new ArrayList<>();
        list.add(new HashMap<String, Object>());
        stringObjectHashMap.put("a", "");
        stringObjectHashMap.put("b", "123");
        HashMap<String, Object> stringObjectHashMap1 = new HashMap<>();

        stringObjectHashMap1.put("b", list);
        stringObjectHashMap.putAll(stringObjectHashMap1);
        System.out.println(stringObjectHashMap);
        System.out.println("¡Ùœ¬¿¥");
    }
}
