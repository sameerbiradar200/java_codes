package java8.Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Streams1 {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(4, 9, 1, 3, 6, 8);

        nums.stream()
                .filter(n->n%2==1)
                .sorted()
                .map(n->n*2)
                .forEach(System.out::println);

//        Stream<Integer> o = nums.stream();
//        o.forEach(n -> System.out.print(n + " "));
//        System.out.println();
//        Stream<Integer> data = nums.stream();
//        data.map(n -> n * 2).forEach(n -> System.out.print(n + " "));


//        Stream<Integer> s =data.sorted();
//        s.forEach(System.out::println);


    }
}
