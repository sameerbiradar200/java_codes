package org.example.problems;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class KthSmallest {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,9,8,7,6,11);
        System.out.println(list+"\n");

        findKthNumber(list,22);


    }
    public static void findKthNumber(List<Integer> list,Integer k){
        if (k>list.size()){
            System.out.println("index is bigger than size of list");
        }

        Collections.sort(list);

        if (k<list.size()){
            Integer s = list.get(k-1);
            System.out.println("Kth smallest element: " + s);
        }


    }
}
