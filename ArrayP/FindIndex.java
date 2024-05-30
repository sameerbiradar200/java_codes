package ArrayP;

import java.util.Arrays;
import java.util.Scanner;


// Write a Java program to find the index of an array element.


public class FindIndex {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        System.out.println("given array is : "+ Arrays.toString(arr));

        Scanner sc = new Scanner(System.in);
        System.out.println("enter value to find index : ");
        int v = sc.nextInt();
        int Index = arr.length+1;
        for (int i : arr){
            if(v == i){
                Index = i-1;
            }

        }

        if(Index <= arr.length){
            System.out.println("index found : "+Index);
        }
        else System.out.println("index not found");
    }
}
