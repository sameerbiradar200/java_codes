package ArrayP;

import java.util.Arrays;

public class sorting {
    public static void main(String[] args) {
        int[] a = { 1, 2, 3, 4, 55, 6, 7, 8, 9, 10 };
        String[] b = { "A", "B", "z", "D", "E", "F" };

        System.out.println("original a : "+ Arrays.toString(a));       //print original array


        Arrays.sort(a);                                                //  sorting array like 1 to 10 small to bigger numbers
        System.out.println("sorted a : "+ Arrays.toString(a));         // printing last result

        System.out.println("original b : "+ Arrays.toString(b));       //printing original array of string

        Arrays.sort(b);                                                // shorting array  a to z  or A to Z like that
        System.out.println("sorted b : "+ Arrays.toString(b));         //and print result
    }
}
