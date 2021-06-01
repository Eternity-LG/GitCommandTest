package main.enu;

/**
 * @author ：liugeng
 * @date ：Created in 2021/4/6 10:53
 */
public class Digits {
    enum NUMBER {
        CHARACTER, NUMERAL, FIGURE
    }

    public static void main(String[] args) {
        NUMBER[] number = new NUMBER[]{NUMBER.CHARACTER, NUMBER.NUMERAL, NUMBER.FIGURE};
        for (int i = 0; i < number.length; i++) {
            System.out.println("day[" + i + "].ordinal():" + number[i].ordinal());
            System.out.println(number[i].toString());
        }
        System.out.println("-------------------------------------");
        //通过compareTo方法比较,实际上其内部是通过ordinal()值比较的
        System.out.println("number[0].compareTo(number[1]):" + number[0].compareTo(number[1]));
        System.out.println("number[0].compareTo(number[1]):" + number[0].compareTo(number[2]));
        //获取该枚举对象的Class对象引用,当然也可以通过getClass方法
        Class<NUMBER> clazz = number[0].getDeclaringClass();
        System.out.println("clazz:" + clazz);
        System.out.println("-------------------------------------");
        //name
        System.out.println("days[0].name():" + number[0].name());
        System.out.println("days[1].name():" + number[1].name());
        System.out.println("days[2].name():" + number[2].name());

        System.out.println("-------------------------------------");

        System.out.println("days[0].toString():" + number[0].toString());
        System.out.println("days[1].toString():" + number[1].toString());
        System.out.println("days[2].toString():" + number[2].toString());

        System.out.println("-------------------------------------");

        NUMBER n1 = NUMBER.valueOf(number[0].name());
        //
        NUMBER figure = NUMBER.FIGURE;
        NUMBER[] values = figure.values();
        NUMBER.values();
        System.out.println(n1);
        Enum N3 = Enum.valueOf(NUMBER.class, number[0].name());
        System.out.println(N3);
    }
}
