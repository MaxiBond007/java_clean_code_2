package com.company;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Q5 {
    public static void main(String[] args)
    {List<String>  names =
            List.of("Max", "Charles", "Constance" , "Max", "Axel", "Marc", "Sabri","Sabri");

        List<String> collect = names.stream()
                .distinct()
                .collect(Collectors.toList());
        System.out.println( collect);

        List<String> collect2 = names.stream()
                .distinct()
                .filter(name -> name.startsWith("M"))
                .collect(Collectors.toList());
        System.out.println( collect2);

        Long collect3 = names.stream()
                .distinct()
                .filter(name -> name.startsWith("M"))
                .count();
        System.out.println( collect3);

        List<Integer> collect4 = names.stream()
                .filter(name -> name.startsWith("M"))
                .distinct()
                .map((String name) -> name.length())
                .collect(Collectors.toList());
        System.out.println( collect4);

        Integer collect5 = names.stream()
                .filter(name -> name.startsWith("M"))
                .distinct()
                .mapToInt((String name) -> name.length())
                .sum();
        System.out.println( collect5);
    }
}
