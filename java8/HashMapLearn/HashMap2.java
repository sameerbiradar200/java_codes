package HashMapLearn;
import java.util.*;
public class HashMap2 {
    public static void main(String[] args){

        HashMap<Integer,String> hash2= new HashMap<>();

        hash2.put(1,"Red");
        hash2.put(2,"Green");
        hash2.put(3,"Black");
        hash2.put(4,"White");
        hash2.put(5,"Blue");


        Set<Integer> key = hash2.keySet();

        System.out.println("Key set values are: " + key);

        System.out.println("values : "+hash2.values());
    }
}