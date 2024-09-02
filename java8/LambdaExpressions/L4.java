package java8.LambdaExpressions;

import java.util.Arrays;
import java.util.List;

public class L4 {
    public static void main(String[] args) {
        List<String> abcd = Arrays.asList("z","d","r","q","b","g","f","c","v","a");
        System.out.println("\nOriginal abcd List");
        abcd.forEach(a-> System.out.print(a+","));

        abcd.sort((a,b)->a.compareToIgnoreCase(b));


        System.out.println("\n\nmodified abcd List");
        abcd.forEach(a-> System.out.print(a+","));


    }
}
