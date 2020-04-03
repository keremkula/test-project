package com.tr.keromotti.newFeatures;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamApiTest
{

    public static void main(String[] args)
    {

        distinctTest();

    }

    private static void forEachTest()
    {
        List<String> stringList = Arrays.asList("A1", "A2", "A3", "A4", "A5", "B1", "B2", "B3", "C1", "X5", "Y", "Z", "D", "AB", "RT", "Q");

        stringList.stream().forEach(System.out::println);

        stringList.stream().forEach(name -> {
            System.out.print(name);
        });
    }

    private static void filterTest()
    {
        List<String> namesWith4Length = new ArrayList<>();
        List<String> names = Arrays.asList("Ali", "Veli", "Selami", "Cem", "Zeynel", "Can", "Hüseyin");

        Stream<String> stream = names.stream();
        Predicate<String> predicate = name -> name.length() > 4;
        stream.filter(predicate).forEach(System.out::println);

        // names.stream().filter(name -> name.length() >
        // 4).forEach(System.out::println);
        names.stream().filter(name -> name.length() > 4).forEach(namesWith4Length::add);

        namesWith4Length.stream().forEach(System.out::println);

    }

    public static void distinctTest()
    {
        IntStream stream = IntStream.of(1, 1, 2, 3, 5, 8, 13, 13, 8);
        stream.distinct().forEach(System.out::println);
    }

    public static void collectTest()
    {
        List<String> names = Arrays.asList("Ali", "Veli", "Selami", "Veli", "Selami", "Can", "Hüseyin");
        List<String> list = names.stream().collect(Collectors.toList());
        Set<String> set = names.stream().collect(Collectors.toSet());
        Long count = names.stream().collect(Collectors.counting());
        String collect = names.stream().collect(Collectors.joining(" - "));
        Map<Integer, List<String>> integerListMap = names.stream().collect(Collectors.groupingBy(name -> name.length()));
    }
    
    public static void mapTest()
    {
        List<String> names = Arrays.asList("Ali", "Veli", "Selami", "Cem");
        Stream<String> stream = names.stream();
        Stream<String> upperStream= stream.map(name -> name.toUpperCase());
        List<String> upperNames = upperStream.collect(Collectors.toList());
        
    }

}
