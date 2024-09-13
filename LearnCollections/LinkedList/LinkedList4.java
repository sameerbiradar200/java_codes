package LearnCollections.LinkedList;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedList4 {
    public static void main(String[] args) {
        LinkedList<String> s =new LinkedList<>();
        s.add("sameer");
        s.add("rahee");
        s.add("ram");
        s.add("sam");
        s.add("om");

        System.out.println("original list : \n"+s);

        System.out.println("descending list : ");

        Iterator<String> it = s.descendingIterator();
        while (it.hasNext()){
            System.out.print(it.next()+" ");
        }
    }
}
