package LearnCollections.LinkedList;

import java.util.Collections;
import java.util.LinkedList;
import java.util.StringJoiner;

public class LinkedList2 {
    public static void main(String[] args) {
        LinkedList<Integer> i =new LinkedList<>();
        Collections.addAll(i,1,2,3,4,5,6,7,8,9);
        StringJoiner joiner = new StringJoiner(", ");

        for (Integer a :i){
            joiner.add(a.toString());
        }

        System.out.println(joiner);


    }
}
