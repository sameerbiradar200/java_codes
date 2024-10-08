package learnArray;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ArrayFive {
    /*Java Program to Find Common Elements Between Two Arrays*/

    private static void FindCommonElemet(String[] arr1, String[] arr2) {
        Set<String> set = new HashSet<>();
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i].equals(arr2[j])) {

                    set.add(arr1[i]);
                    break;
                }
            }
        }
        for (String i : set) {
            System.out.print(i + ",");
        }
        System.out.println();
    }


    public static void main(String[] args) {

        String[] arr1 = {"Article", "in", "Geeks", "for", "Geeks"};

        String[] arr2 = {"Geeks", "for", "Geeks"};

        System.out.println("Array 1: "+ Arrays.toString(arr1));

        System.out.println("Array 2: "+ Arrays.toString(arr2));
        System.out.println();

        System.out.print("Common Elements: ");

        FindCommonElemet(arr1, arr2);
    }


}
