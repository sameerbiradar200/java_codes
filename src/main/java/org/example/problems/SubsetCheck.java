package org.example.problems;

import java.util.HashSet;
import java.util.Set;

public class SubsetCheck {
    public static void main(String[] args) {

        HashSet<Integer> setA = new HashSet<>();
        HashSet<Integer> setb = new HashSet<>();

        setA.add(1);
        setA.add(2);
        setA.add(3);
        setA.add(4);

        setb.add(1);
        setb.add(2);

        System.out.println("Set A: " + setA);
        System.out.println("Set B: " + setb);

        if (isSubset(setA, setb)) {
            System.out.println("Set A is a subset of Set B");
        } else {
            System.out.println("Set A is not a subset of Set B");
        }

        if (isSubset(setb, setA)) {
            System.out.println("Set A is a subset of Set B");
        } else {
            System.out.println("Set A is not a subset of Set B");
        }

    }

    public static boolean isSubset(HashSet<Integer> setA, HashSet<Integer> setB) {
        for (Integer i : setA) {
            if (!setB.contains(i)) {
                return false;
            }

        }
        return true;
    }


}
