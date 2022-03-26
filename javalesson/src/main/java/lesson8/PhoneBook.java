package lesson8;

import java.util.HashMap;
import java.util.Map;

public class PhoneBook {
    //взяла класс HashMap, его метод put() используем для добавления пары ключ-значение, get() для получения
    //значения по ключу
    HashMap<Integer, String> phonebook = new HashMap<>();

    public void add(int number, String surname) {
        phonebook.put(number, surname);
    }

    public void get(String surname) {
        if (phonebook.containsValue(surname)) { //если честно, это сразу полностью списала с методички, c примера про страны и столицы
            for (Map.Entry<Integer, String> pb : phonebook.entrySet()) {
                if (pb.getValue().equals(surname)) {
                    System.out.println(pb.getValue() + ": " + pb.getKey());
                }
            }
        } else {
            System.out.println("Not on the list");
        }
    }
}
