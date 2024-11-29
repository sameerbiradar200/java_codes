package org.example.problems;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MergeArrayLists {
    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(10, 20, 30);
        List<Integer> list2 = Arrays.asList(40, 50, 60);
        System.out.println("original list are \n"+list2+"\n"+list1+"\n");

        List<Integer> mergedList = Stream.of(list1,list2)
                .flatMap(List::stream)
                .collect(Collectors.toList());

        System.out.println("merged list is "+mergedList);
    }

}
