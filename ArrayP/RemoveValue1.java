package ArrayP;

import java.util.Arrays;
import java.util.Scanner;

public class RemoveValue1 {
    public static void main(String[] args) {
        int[] Arr ={1,2,3,4,5};
        System.out.println("given Array is  : "+ Arrays.toString(Arr));
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number you want to remove");
        int n = sc.nextInt();
        String Else = "we have not found the number in given array";
        for (int i : Arr){
            if(i == n){
                System.out.println("we have found the number in given array we will delete that value for next Array");
            }
        }
        int[] newArray = new int[Arr.length - 1];
        int index =0;
        for (int i : Arr){
            if(i != n){
                newArray[index++] = i;
            }
        }

        System.out.println("new array is  : "+ Arrays.toString(newArray));
    }
}
