package org.example.problems;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class SortArrayList {
    public static void main(String[] args) {
//        ArrayList<String>list =new ArrayList<>();
//        list.add("apple");
//        list.add("banana");
//        list.add("akash");
//        list.add("sameer");
//        System.out.println("before short");
//        System.out.println(list);
//        System.out.println("after short");
//        Collections.sort(list);
//        System.out.println(list);

        //with java 8 method

        List<String> list = new ArrayList<>(List.of("sameer","zzz","apple","banana","rahee","aaa"));

        System.out.println("before shorted \n"+list);

        List<String>sortedList=list.stream()
                .sorted()
                .collect(Collectors.toList());

        System.out.println("after sorted \n"+sortedList);
    }
}
