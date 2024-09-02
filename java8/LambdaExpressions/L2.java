package java8.LambdaExpressions;


import java.util.Arrays;
import java.util.List;

public class L2 {
    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("sam", "ram", "om", "Red");

        System.out.println("original string");

        for (String a : stringList) {
            System.out.println(a);
        }

        System.out.println();

        stringList.replaceAll(a -> a.toUpperCase());
        System.out.println("uppercase string");
        for (String a : stringList) {
            System.out.println(a);
        }

        System.out.println();

        stringList.replaceAll(a -> a.toLowerCase());
        System.out.println("LowerCase string");
        for (String a : stringList) {
            System.out.println(a);
        }

    }
}
