package ArrayP;

import java.util.Arrays;
import java.util.Scanner;

public class FindNum {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        boolean found = false;
        System.out.println(Arrays.toString(arr));
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an number to check !: ");
        int num = sc.nextInt();

        for (int j : arr) {
            if (num == j) {
                found = true;

                break;
            }

        }
        if (found) {
            System.out.println("The number you entered is  in the array");
        }
        else
            System.out.println("The number you entered is not in the array");

    }
}
