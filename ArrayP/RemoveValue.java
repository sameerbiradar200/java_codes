package ArrayP;

import java.util.Arrays;
import java.util.Scanner;



public class RemoveValue {
    public static void main(String[] args) {
       // Write a Java program to remove a specific element from an array.
        int[] Arr = {1,2,3,4,5,6,7,8,9};
        int l = Arr.length;
        System.out.println(l);
        System.out.println("given arr is : \n " + Arrays.toString(Arr));

        Scanner sc = new Scanner(System.in);
        System.out.println("give any one value to remove from given array : ");

        int value = sc.nextInt();
        System.out.println("removing value from given array is :  " + value);

        for (int i = 0; i < Arr.length; i++) {
            if (Arr[i] == value) {
                int temp = Arr[i];
                Arr[i] = Arr[l-1];
                Arr[l-1] = temp;

                Arr = Arrays.copyOf(Arr, Arr.length - 1);

            }
        }

        System.out.println(Arrays.toString(Arr));


    }
}
