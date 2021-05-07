package com.company;

import org.w3c.dom.ls.LSOutput;

import java.util.Optional;

public class Main {

    public static void main(String[] args) {
	Q1();
    }
    public static  void Q1()
    {
        String string = null;
        String name = "Max";
        Optional<String> optionalName = Optional.ofNullable(name);
        System.out.println(optionalName);
        if (optionalName.isPresent()) {
            System.out.println(optionalName.get());
        } else {
            System.out.println("Max");
        }

        System.out.println(optionalName.orElse("maxim"));
    }

}
