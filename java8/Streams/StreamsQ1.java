package java8.Streams;
//Write a Java program to calculate the average of a list of integers using streams

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

public class StreamsQ1 {
    public static void main(String[] args) {
        List<Integer> a = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

//      double avg =a.stream().mapToDouble(Integer::doubleValue).average().orElse(0.0);
        double avg =a.stream()
                .mapToDouble(n->(double)n)
                .average()
                .getAsDouble();

        System.out.println(avg);

    }
}
