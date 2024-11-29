package org.example.problems;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class listDuplicateElement {
    public static void main(String[] args) {
        List<Integer> list =List.of(1,2,3,4,5,6,7,8,9,11,1,2,3,4,11);

        System.out.println(); System.out.println(); System.out.println("-------------------------------------------------------------------------");
        System.out.println("original list");
        System.out.println();
        System.out.println(list);

        System.out.println();
        System.out.println("-------------------------------------------------------------------------");
        System.out.println();

        System.out.println("remove duplicate way 1");
        System.out.println();
        Set<Integer> set = new HashSet<>(list);
        System.out.println(set);

        System.out.println();
        System.out.println("-------------------------------------------------------------------------");
        System.out.println();

        System.out.println("remove duplicate way 2");
        System.out.println();
        List<Integer> list1 =list.stream().distinct().collect(Collectors.toList());
        System.out.println(list1);

        System.out.println();
        System.out.println("-------------------------------------------------------------------------");
        System.out.println();


        System.out.println("remove duplicate way 3");
        System.out.println();
        Set<Integer> list2 =list.stream().collect(Collectors.toSet());
        System.out.println(list2);

        System.out.println();
        System.out.println("-------------------------------------------------------------------------");
        System.out.println();








    }
}
