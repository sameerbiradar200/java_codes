package LearnCollections.LinkedList;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedList3 {
    public static void main(String[] args) {
        LinkedList<String> s =new LinkedList<>();
        s.add("sameer");
        s.add("O");
        s.add("A");
        s.add("B");
        s.add("C");
        s.add("D");


        s.stream().skip(1).forEach(n-> System.out.print(n+"  "));

        System.out.println();

        ListIterator<String> listIterator = s.listIterator(2);

        while (listIterator.hasNext()) {
            System.out.println(listIterator.next());
        }

    }
}
