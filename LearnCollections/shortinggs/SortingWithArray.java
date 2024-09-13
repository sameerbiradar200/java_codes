package LearnCollections.shortinggs;


import java.util.*;

public class SortingWithArray {
    public static void main(String[] args) {
        Map<String,String> c =new HashMap<>();
        c.put("in","india");
        c.put("us","USA");
        c.put("uk","united kingdom");
        c.put("fe","france");
        c.put("se","shreelanka");

        ArrayList<String> key =new ArrayList<>(c.keySet());
        ArrayList<String> values =new ArrayList<>(c.values());

        System.out.println(key);
        System.out.println(values);
        System.out.println(c);

        Set<Map.Entry<String,String>> ent =c.entrySet();
        for (Map.Entry<String,String> entry:ent){
            System.out.println(entry.getKey()+", "+entry.getValue());
        }


    }
}
