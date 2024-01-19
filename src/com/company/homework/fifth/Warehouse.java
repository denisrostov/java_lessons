package com.company.homework.fifth;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Warehouse {
    private List<Item> items = new ArrayList<>();

    public void addItems(List<Item> newItems) {
        items.addAll(newItems);
    }

    public List<Item> getEvenItems() {
        List<Item> evenItems = new ArrayList<>();
        for (int i = 0; i < items.size(); i++) {
            if (i % 2 == 0) {
                evenItems.add(items.get(i));
            }
        }
        return evenItems;
    }

    public Item getItemByIndex(int index) {
        return items.remove(index);
    }

    public void removeAllButLast() {
        items = new ArrayList<>(Collections.singletonList(items.get(items.size() - 1)));
    }
}
