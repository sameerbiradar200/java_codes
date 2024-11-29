package org.example;

import org.example.problems.Emp;

import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        List<Emp> list =new ArrayList<>();
        list.add(new Emp("sam","biradar","ram","male",22,1_000,"science"));
        list.add(new Emp("ovi","moghe","r","female",21,20_000,"marathi"));
        list.add(new Emp("sai","jadhav","a","female",32,30_000,"math"));
        list.add(new Emp("rahee","biradar","m","female",42,99_000,"computer"));
        list.add(new Emp("ramesh","biradar","d","male",42,88_000,"english"));
        list.add(new Emp("naresh","petker","o","male",33,77_000,"science"));
        list.add(new Emp("om","injantker","j","male",28,33_000,"science"));
        list.add(new Emp("jack","holand","new","male",29,15_000,"english"));
        list.add(new Emp("tom","cruse","b","male",18,10_000,"math"));

        System.out.println("");
        System.out.println("--------------------------------------------------------------------------------");
        System.out.println("");

        System.out.println("all list :-");
        System.out.println(list);

        System.out.println("");
        System.out.println("--------------------------------------------------------------------------------");
        System.out.println("");

        System.out.println("for max sal : - ");
        List<Emp> max = list.stream().sorted(Comparator.comparing(Emp::getSal).reversed()).limit(1).collect(Collectors.toList());
        System.out.println(max.toString());

        System.out.println("");
        System.out.println("--------------------------------------------------------------------------------");
        System.out.println("");

        System.out.println("for total sal all department");

        double sum =list.stream().mapToDouble(a-> a.getSal()).sum();
        System.out.println(sum);

        System.out.println("");
        System.out.println("--------------------------------------------------------------------------------");
        System.out.println("");

        System.out.println("total sal of department ");


        Map<String,Integer> dep_total = list.stream().collect(Collectors.groupingBy((Emp::getDepartment),Collectors.summingInt(Emp::getSal)));
        System.out.println(dep_total);

        System.out.println("");
        System.out.println("--------------------------------------------------------------------------------");
        System.out.println("");

        System.out.println("youngest of each department ");

        Map<String, Optional<Emp>> min_age_all_dep = list.stream().collect(Collectors.groupingBy((Emp::getDepartment),Collectors.minBy(Comparator.comparing(Emp::getAge))));
        System.out.println();
        min_age_all_dep.forEach((d,e)-> System.out.println("department "+d+"  emp is "+e.get().getFirstName()+" "+e.get().getLastName()+" and age is "+e.get().getAge()));
//        System.out.println(min_age_all_dep.toString());

        System.out.println("");
        System.out.println("--------------------------------------------------------------------------------");
        System.out.println("");

        System.out.println("avg sal of department");
        Map<String, Double> avg_sal_of_dep = list.stream().collect(Collectors.groupingBy((Emp::getDepartment),Collectors.averagingInt(Emp::getSal)));
        System.out.println(avg_sal_of_dep);








    }
}