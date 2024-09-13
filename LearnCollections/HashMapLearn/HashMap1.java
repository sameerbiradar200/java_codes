package LearnCollections.HashMapLearn;
import java.util.*;

public class HashMap1 {
    public static void main(String[] args){

        HashMap<Integer,String> h= new HashMap<>();
        h.put(1,"sameer");
        h.put(2,"ram");
        h.put(3,"rahee");
        h.put(4,"ramesh");
        h.put(5,"snehalata");

        System.out.println("Collection view is: "+ h.values());
    }
}
