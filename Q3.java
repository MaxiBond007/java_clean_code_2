package com.company;

import java.util.List;

public class Q3 {
    public static void main(String[] args) {
        List<String> games = List.of("Minecraft","WarriorZ","CandyCrush");
        System.out.println( secondString(games));
        List<Integer> grades = List.of(15,18,17);
        System.out.println(secondInteger(grades));
        System.out.println(second(games));
        Integer secondGrade = second(grades);
        System.out.println(second(grades));
    }
    public static String secondString (List<String> list) {
        if (list == null  || list.size() < 2 ) {
            throw  new IllegalArgumentException();
        }
        return list.get(1);
    }
    public static Integer secondInteger (List<Integer> list) {
        if (list == null  || list.size() < 2 ) {
            throw  new IllegalArgumentException();
        }
        return list.get(1);
    }

    public static <T> T second (List<T> list) {
        if (list == null  || list.size() < 2 ) {
            throw  new IllegalArgumentException();
        }
        return list.get(1);
    }

}
