package learnArray;
import java.util.Arrays;
/*Remove duplicates from Sorted Array*/
public class ArrayFour {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 1, 2, 4, 5, 3};
        System.out.println("Original Array: " + Arrays.toString(array));

        int[] result = removeDuplicates(array);
        System.out.println("Array after removing duplicates: " + Arrays.toString(result));
    }

    public static int[] removeDuplicates(int[] array) {
        int n = array.length;

        Arrays.sort(array);

        int[] temp = new int[n];
        int j = 0;

        for (int i = 0; i < n - 1; i++) {
            if (array[i] != array[i + 1]) {
                temp[j++] = array[i];
            }
        }

        temp[j++] = array[n - 1];


        int[] result = new int[j];
        for (int i = 0; i < j; i++) {
            result[i] = temp[i];
        }

        return result;
    }


}
