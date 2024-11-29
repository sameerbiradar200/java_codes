package org.example.problems;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class SecondLargest {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(List.of(10, 20, 30));
        String s ="error";


//        int secondLargest =list.stream()
//                .sorted((a,b)->b-a)
//                .skip(1)
//                .findFirst()
//                .orElseThrow(null);
//
//        System.out.println(secondLargest);

        Optional<Integer> secondLargest= list.stream()
                .sorted(Integer::compare)
                .skip(1)
                .limit(1)
                .findAny();

        if (secondLargest.isPresent()) {
            System.out.println("Second largest element: " + secondLargest.get());
        } else {
            System.out.println("No second largest element found.");
        }
    }
}
