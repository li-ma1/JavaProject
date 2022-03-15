package lesson4;

import java.util.Scanner;

public class PlateForCat {
    //характеристика
    private int food;

    //конструктор
    public PlateForCat(int food) {
        this.food = food;
        info();
    }

    //геттер
    public int getFood() {
        return food;
    }

    //метод для уменьшения еды в тарелке
    public boolean decreaseFood(int n) {
        if (n > food) {
            return false;
        } else {
            food -= n;
            return true;
        }
    }
    //метод для добавления еды, для красоты ввод через сканнер в консоль
    public void increaseFood() {
        this.food = new Scanner(System.in).nextInt();
        System.out.println("В миску добавили " + this.food + " грамм корма");
    }

    //метод для проверки еды в миске
    public boolean checkFood(int n) {
        return (food - n) >= 0;
    }

    //метод для печати
    public void info() {
        System.out.println("В миске " + food + " гр еды");
    }
}
