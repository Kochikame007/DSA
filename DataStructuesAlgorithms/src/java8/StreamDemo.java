package java8;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamDemo {

    public static void main(String[] args) {
//        List<Integer> list = Arrays.asList(10,15,8,49,25,98,32);


//        list.stream().filter(x -> x%2==0).forEach(System.out::println);

//        List<Integer> myList = Arrays.asList(10,15,8,49,25,98,32);
//        myList.stream()
//                .map(s->s+"").filter(x ->x.startsWith("1")).forEach(System.out::println);

//        List<Integer> myList = Arrays.asList(10,15,8,49,25,98,98,32,15);
//        Set<Integer> s = new HashSet<Integer>();
//        myList.stream().filter(x -> !s.add(x)).forEach(System.out::println);

//        List<Integer> myList = Arrays.asList(10,15,8,49,25,98,98,32,15);
//      Double sum =  myList.stream().mapToDouble(Integer :: doubleValue).average().orElse(0.0);
//      System.out.println(sum);

//        myList.stream().findFirst()
//                .ifPresent(System.out::println);

//        long co = myList.stream().count();
//        System.out.println(co);

        String input = "Java articles are Awesome";
//        Character c = input.chars()
//                .mapToObj(s ->Character.toLowerCase(Character.valueOf((char)s)))
//                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
//                .entrySet()
//                .stream()
//                .filter(entry ->entry.getValue() ==1)
//                .map(entry -> entry.getKey())
//                .findFirst()
//                .get();
//        System.out.println(c);
//        List < String > colors = Arrays.asList("RED", "grEEn", "white", "Orange", "pink");
//       List<String> upper =  colors.stream().map(String::toUpperCase).collect(Collectors.toList());
//
//        List < Integer > numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
//       int a = numbers.stream().filter(x -> x%2==0).mapToInt(Integer::intValue).sum();
//        System.out.println(a);

        List < Integer > nums = Arrays.asList(10, 23, 22, 23, 24, 24, 33, 15, 26, 15);
        List<Integer> dis = nums.stream().distinct().collect(Collectors.toList());
        System.out.println(dis);

        List<Integer> myList = Arrays.asList(10,15,8,49,25,98,98,32,15);
        myList.stream().sorted().forEach(System.out::println);
        myList.stream().sorted(Collections.reverseOrder()).forEach(System.out::println);
    }

//    void duplicates(List<Integer> myList){
//        Map<Integer, Integer> map = myList.stream()
//                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
//                .entrySet()
//                .stream()
//                .filter(entry->entry.getValue()>2)
//                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
//    }

}
