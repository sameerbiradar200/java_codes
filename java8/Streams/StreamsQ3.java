package java8.Streams;
//Write a Java program to calculate the sum of all even, odd numbers in a list using streams.

import java.util.Arrays;
import java.util.List;

public class StreamsQ3 {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

        System.out.println();

        nums.stream()
                .filter(n -> n % 2 == 1)
                .forEach(n -> System.out.print(n + " "));

        System.out.println();

        double avgOdd = nums.stream()
                .filter(n -> n % 2 == 1)
                .mapToDouble(n -> (double) n)
                .average()
                .orElseThrow();

        double avgEven = nums.stream()
                .filter(n -> n % 2 == 0)
                .mapToDouble(n -> (double) n)
                .average()
                .orElseThrow();


        System.out.println("odd Avg is :- " + avgOdd+"\n");

        nums.stream()
                .filter(n -> n % 2 == 0)
                .forEach(n -> System.out.print(n + " "));

        System.out.println();

        System.out.println("Even Avg is :- " + avgEven);


    }
}
