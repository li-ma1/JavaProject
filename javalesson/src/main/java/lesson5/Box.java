package lesson5;

import java.util.ArrayList;
import java.util.Arrays;

public class Box<T extends Fruit> {
    private ArrayList<T> items;

    public Box(T... items) {
        this.items = new ArrayList<T>(Arrays.asList(items));
    }

    public ArrayList<T> getItems() {
        return new ArrayList<T>(items);
    }

    // метод, который считает вес коробки
    public float getWeight() {
        if (items.size() == 0) return 0;
        float weight = 0;
        for (T item : items) weight += item.getWeight();
        return weight;
    }

    // метод, который сравнивает коробки и возвращает true/false
    public boolean compare(Box box) {
        return this.getWeight() == box.getWeight();
    }

    //метод, который пересыпает из коробки в коробку, ссыпать разные типы фруктов не даст
    public void transfer(Box<? super T> box) {
        box.items.addAll(this.items);
        items.clear();
    }

    // метод для добавления фрукта в коробку
    public void add(T fruit) {
        items.add(fruit);
    }
}


