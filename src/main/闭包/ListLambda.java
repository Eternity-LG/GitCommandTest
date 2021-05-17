package main.�հ�;

import java.util.ArrayList;
import java.util.Collections;

public class ListLambda {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list,1,2,3,4,5,6);

        list.forEach(System.out::println);
        list.forEach(element->{
            System.out.println(element);
        });
        ArrayList<Item> items = new ArrayList<>();
        items.add(new Item(11, "С��ˢ", 12.05 ));
        items.add(new Item(5, "�ձ���Ͱ��", 999.05 ));
        items.add(new Item(7, "�����յ�", 888.88 ));
        items.add(new Item(17, "����", 2.00 ));
        items.add(new Item(9, "����", 4200.00 ));

        items.removeIf(ele-> ele.getId()==7);
        items.forEach(ele->{
            System.out.println(ele.toString());
        });
    }
}
