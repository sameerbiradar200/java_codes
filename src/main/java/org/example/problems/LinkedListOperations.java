package org.example.problems;

import java.util.LinkedList;

public class LinkedListOperations {
    public static void main(String[] args) {
        LinkedList<String> list =new LinkedList<>();
        list.add("one");
        list.add("two");
        list.add("three");

        System.out.println(list);

        list.remove("one");
        System.out.println(list);

        for (String s:list){
            System.out.println(s);
        }

        list.removeIf(e -> e.equals("Two"));

        list.forEach(System.out::println);


        addElements(list);
        System.out.println(list);
        System.out.println();

        removeElement(list,"Date");
        System.out.println(list);

        iterateOverList(list);


    }

    public static void addElements(LinkedList<String> list) {
        list.add("Banana");
        list.add("Cherry");
        list.add("Date");
        list.add("Elderberry");
    }

    public static void removeElement(LinkedList<String> list, String element) {
        if (list.contains(element)) {
            list.remove(element);
            System.out.println("Removed '" + element + "' from the list.");
        } else {
            System.out.println("'" + element + "' is not in the list.");
        }
    }

    public static void iterateOverList(LinkedList<String> list) {
        System.out.println("list contains :\n");
        for (String element : list) {
            System.out.println(element);
        }
    }
}
