package org.example.problems;

import java.util.LinkedList;
import java.util.List;

public class LinkedListEquality {
    public static void main(String[] args) {
        LinkedList<Integer> list1 = new LinkedList<>(List.of(1, 2, 3));
        LinkedList<Integer> list2 = new LinkedList<>(List.of(1, 2, 3));

        boolean areEqual = list1.equals(list2);
        System.out.println("Are LinkedLists equal? " + areEqual);
    }
}
