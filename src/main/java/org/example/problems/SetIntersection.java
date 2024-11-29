package org.example.problems;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetIntersection {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>(Arrays.asList(10, 20, 30));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(20,10, 40, 50));
        Set<Integer> set3 = new HashSet<>(Arrays.asList(30, 10,60, 70));

        System.out.println("Set 1: " + set1);
        System.out.println("Set 2: " + set2);
        System.out.println("Set 3: " + set3);

        Set<Integer> intersection = findIntersection(set1, set2, set3);
        if (intersection != null) {
            System.out.println("Intersection: " + intersection);
        } else {
            System.out.println("No common elements found.");
        }
    }

    public static Set<Integer> findIntersection(Set<Integer>... sets) {
        if (sets.length == 0) {
            return new HashSet<>();
        }

        Set<Integer> intersection = new HashSet<>(sets[0]);
        for (int i = 1; i < sets.length; i++) {
            intersection.retainAll(sets[i]);
        }
        return intersection;
    }
}