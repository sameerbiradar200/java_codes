package org.example.problems;

import java.util.ArrayList;
import java.util.Collections;

public class ShuffleArrayList {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("A");
        list.add("sameer");
        list.add("om");
        list.add("B");
        list.add("C");

        System.out.println("original List: " + list);

        Collections.shuffle(list);
        System.out.println("Shuffled List: " + list);
    }
}
