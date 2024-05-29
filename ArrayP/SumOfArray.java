package ArrayP;

import java.util.Arrays;

public class SumOfArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        int sum = 0;
        System.out.println("Original array is : " + Arrays.toString(arr));
        for(int i : arr ){
            sum += i;
            System.out.println("adding sum with "+ i+" is "+ sum );
        }

    }
}
