package java8.Streams;

import java.util.List;
import java.util.Scanner;

public class StreamsQ5 {
    public static void main(String[] args) {
        List<String> names = List.of("sameer", "rahee", "Biradar", "snehalta", "ram", "ramesh", "digu", "sam", "narsh", "red", "blue");
        System.out.println("\nOriginal List \n" + names);
        Scanner sc = new Scanner(System.in);

        System.out.println("\n\nfor exit type exit ");

        String input;


        do {
            System.out.println("Enter a character or 'exit' to quit: ");
            input = sc.nextLine().trim();

            if (input.equalsIgnoreCase("exit")) {
                break;
            }

            if (input.length() == 1) {
                System.out.println("\nYou entered: " + input);
                String finalInput = input;
                List<String> ans = names.stream()
                        .filter(n -> n.startsWith(finalInput))
                        .toList();

                System.out.println("\nlist of words starting with '" + finalInput + "' is " + "\n" + ans + "\nnumber of words is :" + (long) ans.size());
            }

            else if (input.length() > 1) {
                System.out.println("(warning) \nEnter only one character.");
            }

            else {
                System.out.println("(warning) \nNo input is provided.");
            }


        } while (true);

        sc.close();
        System.out.println("You have closed the program.");
    }

}

