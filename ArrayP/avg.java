package ArrayP;

import java.util.Arrays;

public class avg {
    public static void main(String[] args) {
        System.out.print("given array is : ");
        int[] a = {1,2,3,4,5,6,7,8,9,10};
        int sum = 0;
        for (int j : a) {
            sum += j;
        }
        double avg = (double) sum / a.length;
        System.out.println(Arrays.toString(a));
        System.out.println("Array length is : "+a.length);
        System.out.println("sum of Array is : "+sum);
        System.out.println("Average of array is : "+avg);
    }
}
