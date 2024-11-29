package org.example.problems;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class MaxElement {
    public static void main(String[] args) {

        //java 9 method List.of()
//        List<Integer>list=new ArrayList<>(List.of(1,2,3,4));
//
//
//
//        int Max =list.stream()
//                .max(Integer::compareTo)
//                .orElseThrow(()->new IllegalArgumentException("list is empty"));
//
//        System.out.println(Max);

        List<Integer> list = new ArrayList<>(List.of(10, 50, 30));

        int Max= Collections.max(list);
        System.out.println(Max);



    }
}
