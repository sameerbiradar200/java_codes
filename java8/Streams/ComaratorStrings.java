package java8.Streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ComaratorStrings {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("aa","AAa","a","AAAAA","AAAAAAAAA","AAAA","AAAAAA");
        System.out.println("\n\nbefore shorted :");
        names.forEach(n-> System.out.print("\n"+n));

        Comparator<String> c=   (a,b)->{
            int l1 =a.length();
            int l2 =b.length();
            if (l1<l2)return -1;
            else if (l1>l2)return 1;
            else return 0;

        };

        System.out.println("\n\nafter shorted :");

        List<String> sorted = names.stream()
                .sorted(c)
                .toList();

        sorted.forEach(n-> System.out.print("\n"+n));
    }
}
