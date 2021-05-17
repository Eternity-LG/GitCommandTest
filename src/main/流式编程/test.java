package main.流式编程;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class test {
    public static void main(String[] args) {
        allClubStu.add(computerClub);
        allClubStu.add(basketballClub);
        allClubStu.add(pingpongClub);


        //***************************** 常用的stream方法  *************************************
        Stream<Student> stream = basketballClub.stream();
        Stream<String> stream1 = Stream.of("sd", "sd", "sdfa");
        String[] aar = {"ss", "dd", "ff"};
        Stream<String> stream2 = Arrays.stream(aar);


        List<Student> collect = computerClub.stream().collect(Collectors.toList());
        Set<Student> collect1 = pingpongClub.stream().collect(Collectors.toSet());
        Map<String, String> collect4 = basketballClub.stream().collect(Collectors.toMap(Student::getID, Student::getName));
        Map<String, List<Student>> collect3 = basketballClub.stream().collect(Collectors.groupingBy(Student::getClasses));
        String collect2 = pingpongClub.stream().map(Student::getName).collect(Collectors.joining(",", "[", "]"));
        Map<String, List<Student>> map = Stream.of(basketballClub, pingpongClub, computerClub)
                .flatMap(ele -> ele.stream().filter(s -> s.getAge() < 17)).collect(Collectors.groupingBy(Student::getClasses));

        List<Integer> numbers1 = Arrays.asList(1, 2, 3);
        List<Integer> numbers2 = Arrays.asList(3, 4);
        // flatMap升维度
        List<int[]> pairs = numbers1.stream().flatMap(x -> numbers2.stream().map(y -> new int[] { x, y }))
                .collect(Collectors.toList());
        for (int[] pair : pairs) {
            System.out.println(Arrays.toString(pair));
        }

    }

    private static List<Student> computerClub = Arrays.asList(
            new Student("2015134001", "小明", 15, "1501"),
            new Student("2015134003", "小王", 14, "1503"),
            new Student("2015134006", "小张", 15, "1501"),
            new Student("2015134008", "小梁", 17, "1505")
    );
    //篮球俱乐部
    private static List<Student> basketballClub = Arrays.asList(
            new Student("2015134012", "小c", 13, "1503"),
            new Student("2015134013", "小s", 14, "1503"),
            new Student("2015134015", "小d", 15, "1504"),
            new Student("2015134018", "小y", 16, "1505")
    );
    //乒乓球俱乐部
    private static List<Student> pingpongClub = Arrays.asList(
            new Student("2015134022", "小u", 16, "1502"),
            new Student("2015134021", "小i", 14, "1502"),
            new Student("2015134026", "小m", 17, "1504"),
            new Student("2015134027", "小n", 16, "1504")
    );
    private static List<List<Student>> allClubStu = new ArrayList<>();

}
