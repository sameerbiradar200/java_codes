package java8.Streams;

import java.util.Comparator;
import java.util.List;

public class OddAndEven {
    public static void main(String[] args) {
        List<Integer> a = List.of(1,2,3,4,5,6,7,8,9);
        List<Integer> odd = a.stream().filter(e->e%2!=0).toList();
        List<Integer> even = a.stream().filter(e->e%2==0).toList();
        System.out.println("original = "+a);
        System.out.println("even     = "+even);
        System.out.println("odd      = "+odd);

        System.out.println("\nmap api in Stream");
        List<Integer> Square = even.stream().map(aa->aa*2).toList();
        System.out.println("Square of even = "+Square);


        System.out.println("number of element in original list is "+a.stream().count());

        System.out.println("\nin shorted");
        List<Integer> shorted =a.stream().sorted((x,y)->x.compareTo(y)).toList();
        /*for reverse sorted*/
        /*List<Integer> shorted =a.stream().sorted((x,y)->-x.compareTo(y)).toList();*/
        System.out.println(shorted);


        System.out.println("\ncomparator in shorted");
        List<Integer> Cshorted =a.stream().sorted(Comparator.reverseOrder()).toList();
        System.out.println(Cshorted);


    }
}
