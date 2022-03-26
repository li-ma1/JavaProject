package lesson8;

import java.util.*;

public class ArrayUniqueAndCount {
    public static void main(String[] args) {
        //взяла класс ArrayList для ввода массива, по примеру из методички
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Ann");
        arrayList.add("Bob");
        arrayList.add("Ann");
        arrayList.add("Jon");
        arrayList.add("Tom");
        arrayList.add("Tom");
        arrayList.add("Ann");
        arrayList.add("Kate");
        arrayList.add("Linda");
        arrayList.add("Bob");
        arrayList.add("Jon");
        arrayList.add("Linda");
        arrayList.add("Kate");
        System.out.println("Initial Array:\n" + arrayList);
        // взяла класс HashSet для вывода уникальных элементов массива, тоже по примеру из методички
        Set<String> uniqueArray = new HashSet<>(arrayList);
        System.out.println("Unique name:\n" + uniqueArray);
        // а здесь взяла класс HashMap и метод put, чтобы при совпадении ключей считал количество этих совпадений
        HashMap <String, Integer> count = new HashMap<>();
        for (String s : arrayList) {
            count.put(s, count.getOrDefault(s, 0) + 1);
        }
        System.out.println("Unique name + count:\n" + count.entrySet());
    }
}
