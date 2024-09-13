package LearnCollections.HashMapLearn;
import java.util.HashMap;
import java.util.Scanner;

public class HashMap3 {
    public static void main(String[] args) {
        HashMap<String, Integer> hash_map = new HashMap<>();
        hash_map.put("rahee", 1);
        hash_map.put("ram", 2);
        hash_map.put("sam", 3);
        hash_map.put("sameer", 4);
        hash_map.put("om", 5);

        System.out.println("The Original map: " + hash_map);
        do {
            try {
                System.out.println("Enter name to check (or type 'exit' to quit): ");
                Scanner sc = new Scanner(System.in);
                String s = sc.nextLine();

                if (s.equalsIgnoreCase("exit")) {
                    System.out.println("Exiting the program. Goodbye!");
                    break;
                }

                if (hash_map.containsKey(s)) {
                    System.out.println("yes! - " + hash_map.get(s));
                } else {
                    System.out.println("no!");
                }
            } catch (Exception e) {
                System.out.println(e);
            }

        } while (true);


    }
}

