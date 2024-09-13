package LearnCollections.LinkedList;

import java.util.LinkedList;

public class LinkedList1 {
    public static void main(String[] args) {
        LinkedList<String> s = new LinkedList<>();
        s.add("sameer");
        s.add("rahee");
        s.add("ram");
        s.add("sam");
        s.add("om");

        s.add(2,"hari");

        System.out.println(s);

        System.out.println("at 0 index value is "+s.get(0));

        System.out.println("after clear method");

        s.clear();
        System.out.println(s);
    }
}
