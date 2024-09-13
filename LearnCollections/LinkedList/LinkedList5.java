package LearnCollections.LinkedList;

import java.util.LinkedList;

public class LinkedList5 {
    public static void main(String[] args) {
        LinkedList<String> s =new LinkedList<>();
        s.add("one");
        s.add("two");
        s.add("three");

        System.out.println("\nOriginal Linked-list");

        System.out.println(s);

        System.out.println("\nafter adding addFirst and addLast");

        s.addFirst("sameer");
        s.addLast("rahhe");

        System.out.println(s);

        System.out.println("\nrandom index Adding element ");
        s.add(3,"om");
        System.out.println(s);

    }
}
