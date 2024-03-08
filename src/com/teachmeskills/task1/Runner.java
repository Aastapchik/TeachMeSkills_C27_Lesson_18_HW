package com.teachmeskills.task1;

import java.util.ArrayList;
import java.util.List;

public class Runner {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < 100; i++) list.add(i);

        List<Integer> list1 = list.stream().distinct().toList(); //Удалили дубликаты.
        for (Integer integer : list1) System.out.print(integer + " ");
        System.out.println(" ");

        List<Integer> list2 = list.stream().filter(n -> list.get(n) % 2 == 0 && list.get(n) >=7 && list.get(n) <= 17).toList(); //Четные больше 7 и меньше 17
        for (Integer integer : list2) System.out.print(integer + " ");
        System.out.println(" ");

        List<Integer> list3 = list.stream().map(n -> 2*n).toList(); //Умножили каждый на 2
        for (Integer integer : list3) System.out.print(integer + " ");
        System.out.println(" ");

        List<Integer> list4 = list.stream().sorted().limit(4).toList(); //Отсортировали и вывели ппервых 4
        for (Integer integer : list4) System.out.print(integer + " ");
        System.out.println(" ");

        long listNum = list.size(); //Нашли количество элементов в стриме.
        System.out.println(listNum);

        double srAriph = (double) list.stream().reduce((x, y) -> x + y).get() /list.stream().count(); //Среднее арифметическое
        System.out.println(srAriph);
    }
}
