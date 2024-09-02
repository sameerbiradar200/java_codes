package java8.LambdaExpressions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class L3 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12);
        System.out.println("\nOriginal Nums");
        numbers.forEach(n-> System.out.print(n+" "));

        List<Integer> evenNumbers = new ArrayList<>();
        List<Integer> oddNumbers = new ArrayList<>();

        Consumer<Integer> addEvenNumbers = n->{
            if (n%2 ==0 ){
                evenNumbers.add(n);
            }
        };

        Consumer<Integer> addOddNumbers = n->{
            if (n%2 !=0 ){
                oddNumbers.add(n);
            }
        };

        numbers.forEach(addOddNumbers);
        numbers.forEach(addEvenNumbers);

        System.out.println("\nEven Numbers");
        evenNumbers.forEach(n-> System.out.print(n+" "));

        System.out.println("\nOdd Numbers");
        oddNumbers.forEach(n-> System.out.print(n+" "));


    }
}
