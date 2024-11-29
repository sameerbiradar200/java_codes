package org.example.problems;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FrequencyCount {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(List.of(10, 20, 10));

        System.out.println(list);

        frequency(list);
    }

    public static void frequency(List<Integer>list){
        Map<Integer,Long> frequency =list.stream()
                .collect(Collectors.groupingBy(e->e,Collectors.counting()));

        System.out.println("frequency "+frequency);
    }
}
