package org.example.Tdit;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class  data{


    private String name ;
    private int id;
    private String address;
    private double salary;

    public data(String name, int id, double salary, String address) {
        this.name = name;
        this.id = id;
        this.salary = salary;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }



}

public class StreamToMap {
    public static void main(String[] args) {
        List<data> a =new ArrayList<>();
        a.add(new data("sameer",22,10_000,"pune"));
        a.add(new data("rahee",2,15_000,"panel"));
        a.add(new data("ramesh",12,20_000,"goa"));
        a.add(new data("ram",32,25_000,"udgir"));
        a.add(new data("snehalata",42,30_000,"thane"));

        Map<Integer,Double> map = a.stream().collect(Collectors.toMap(data::getId, data::getSalary));

        System.out.println(map);


    }
}
