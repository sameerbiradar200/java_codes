package org.example.problems;

import java.util.ArrayList;

public class ArrayListIntersection {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        list1.add(1); list1.add(2); list1.add(3);
        list2.add(2); list2.add(3); list2.add(4);

        list1.retainAll(list2);
        System.out.println("Intersection: " + list1);


    }
}
