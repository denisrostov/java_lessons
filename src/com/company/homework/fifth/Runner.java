package com.company.homework.fifth;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Runner {
    public static void main(String[] args) {
        ex2();

        Warehouse warehouse = new Warehouse();
        warehouse.addItems(Arrays.asList(new Item("item1"), new Item("item2"), new Item("item3")));
        warehouse.addItems(Arrays.asList(new Item("item4"), new Item("item5")));

        System.out.println("Четные вещи: " + warehouse.getEvenItems().toString());

        warehouse.getItemByIndex(1);

        System.out.println("Оставшиеся вещи: " + warehouse.getEvenItems().toString());

        System.out.println("Все кроме последней");
        warehouse.removeAllButLast();

        System.out.println("Конечные вещи: " + warehouse.getEvenItems().toString());
    }

    public static void ex2() {
        List<Integer> list1 = Arrays.asList(5, 2, 4);
        List<Integer> list2 = Arrays.asList(7, 10);

        List<Integer> finalList = new ArrayList<>();
        finalList.addAll(list1);
        finalList.addAll(list2);

        finalList.remove(2);

        int index = finalList.indexOf(10);
        System.out.println("Index of 10: " + index);
    }
    public static void ex3() {

        
        

    }
}
