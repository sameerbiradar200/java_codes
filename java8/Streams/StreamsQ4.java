package java8.Streams;
//Write a Java program to remove all duplicate elements from a list using streams.

import java.util.Arrays;
import java.util.List;

public class StreamsQ4 {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1, 9, 9, 1, 2, 5, 2, 2, 4, 4, 4, 5, 3, 5, 9, 6, 6, 7, 8, 8);

        System.out.println("\nOriginal List");
        System.out.println(nums);

        System.out.println("\nafter sorted and removing duplicate ");

        List<Integer> a = nums.stream()
                .sorted()
                .distinct()
                .toList();

        System.out.println(a);
    }
}
