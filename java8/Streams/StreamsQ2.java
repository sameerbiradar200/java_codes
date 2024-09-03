package java8.Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsQ2 {
    public static void main(String[] args) {
        List<String> name = Arrays.asList("PinK","rED","BLacK","oM","RahEE","SaMeER");

        System.out.println("\nOriginal case String = "+name);

        List<String> upperCase = name.stream()
                .map(String::toUpperCase)
                .toList();

        System.out.println("\nUpper case String = "+upperCase);

        List<String> lowerCase = name.stream()
                .map(String::toLowerCase)
                .toList();

        System.out.println("\nLower case String = "+lowerCase);

        List<String> capitalizedWords = lowerCase.stream()
                .map(w->w.substring(0,1).toUpperCase()+w.substring(1))
                .toList();

        System.out.println("\nFirst Capitalize case String = "+capitalizedWords);


    }
}
