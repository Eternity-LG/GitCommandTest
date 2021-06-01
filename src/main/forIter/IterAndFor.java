package main.forIter;

import java.util.*;

/**
 * @author ：liugeng
 * @date ：Created in 2021/4/7 11:13
 */
public class IterAndFor {

    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("1", "11");
        map.put("2", "11");
        map.put("3", "11");
        map.put("4", "11");
        map.put("5", "11");
        map.put("6", "11");
        ArrayList<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");
        list.add("8");
        list.add("4");
        list.add("2");
        list.add("6");
        list.set(2, "44");
        System.out.println("nihao ");
        System.out.println(Arrays.toString(list.toArray()));
//        fors(list);
//        foreachs(list);
//        iterators(list);
//        listIterators(list);
//        mapIterator(map);
    }

    private static void mapIterator(HashMap<String, String> map) {
        for (String s : map.keySet()) {
            if (s.equals("1")) {
                map.put("22", "erwer");
                map.remove("1");
            }

        }
    }

    private static void listIterators(ArrayList<String> list) {
        //ListIterator
        ListIterator<String> it = list.listIterator();
        System.out.println("由前向后遍历：");
        while (it.hasNext()) {
            String str = it.next();
            it.set("test");
            System.out.print(str + " ");
        }
        System.out.println("由后向前遍历：");            //如果想输出有后向前必须先进行有钱向后
        while (it.hasPrevious()) {
            String str = it.previous();
            System.out.print(str + " ");
        }

    }


    private static void iterators(ArrayList<String> list) {
        //Iterator
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            String val = iterator.next();
            if (val.equals("2")) {
                iterator.remove(); //报错
                //list.remove(val);   //报错
            }
        }
        System.out.println(list.toString());
//        while (iterator.hasNext()) {
//            String str = iterator.next();
//            System.out.print(str + "  ");
//            if ("8".equals(str)) {
//                iterator.remove();
//            }
//        }
    }

    private static void foreachs(ArrayList<String> list) {
        // foreach
        for (String item : list) {
            if ("8".equals(item)) {
                list.remove(item);
            }
            System.out.print(item + "  ");
        }
    }

    private static void fors(ArrayList<String> list) {
        //for循环
        for (int i = 0; i < list.size(); i++) {
            if ("4".equals(list.get(i))) {
                list.remove(list.get(i));
            }
            System.out.print(list.get(i) + "  ");
        }
    }
}