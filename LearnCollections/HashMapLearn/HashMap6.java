package LearnCollections.HashMapLearn;
import java.util.*;

public class HashMap6 {

    public static void main(String[] args){
        HashMap<Integer,String> hash_map= new HashMap<>();
        hash_map.put(1, "Red");
        hash_map.put(2, "Green");
        hash_map.put(3, "Black");
        hash_map.put(4, "White");
        hash_map.put(5, "Blue");

        System.out.println("Size of the hash map: "+hash_map.size());
    }
}
