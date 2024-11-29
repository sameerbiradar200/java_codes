package org.example.problems;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicates {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(List.of("sameer","rahee","om","ram","sameer","rahee","om"));

        System.out.println("before Removeing Duplicates\n "+list);

        List<String> RemoveDuplicatesList = list.stream()
                .distinct()
                .collect(Collectors.toList());

        System.out.println("after removing duplicate\n "+RemoveDuplicatesList);
    }
}
