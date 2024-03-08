package com.teachmeskills.task2;

import java.util.ArrayList;
import java.util.List;

public class Runner {

    public static void main(String[] args) {

        List<String> name = new ArrayList<>();
        name.add("Artyom");
        name.add("Artem");
        name.add("alina");
        name.add("Ruslan");
        name.add("Alex");
        name.add("Nastya");
        name.add("Daniil");

       List<String> nameSort = name.stream().filter(s -> s.charAt(0) == 'A' || s.charAt(0) == 'a').sorted().toList();
        System.out.println(nameSort.get(0));

    }
}
