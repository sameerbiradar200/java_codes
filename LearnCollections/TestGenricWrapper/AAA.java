package LearnCollections.TestGenricWrapper;

import java.util.ArrayList;
import java.util.Scanner;

public class AAA {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter a number (or type 'stop' to finish): ");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("stop")) {
                break;
            }

            try {
                int number = Integer.parseInt(input);
                numbers.add(number);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid number or type 'stop' to finish.");
            }
        }

        scanner.close();
        System.out.println("Numbers entered: " + numbers);
    }
}