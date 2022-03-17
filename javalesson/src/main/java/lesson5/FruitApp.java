package lesson5;
//отмучалась, чтобы упаковать инфу в метод, но постоянно получалась ерунда, в плане if/else выдавал неверное сравнение,
//поэтому оставила корявый вариант, с кучей дублей, но выводит верно
public class FruitApp {
    public static void main(String[] args) {
        Apple apple = new Apple();
        Orange orange = new Orange();
        Box<Apple> box1 = new Box<Apple>(apple, apple, apple, apple, apple, apple);
        Box<Orange> box2 = new Box<Orange>(orange, orange, orange);
        Box<Orange> box3 = new Box<Orange>(orange);
        Float orangeWeigth = box2.getWeight();
        Float appleWeigth = box1.getWeight();
        Float orange2Weight = box3.getWeight();

        System.out.println("Вес коробки с яблоками " + box1.getWeight());
        System.out.println("Вес первой коробки с апельсинами " + box2.getWeight());
        System.out.println("Вес второй коробки с апельсинами " + box3.getWeight());
        if (box1.compare(box2) == true) {
            System.out.println("Вес первой коробки с апельсинами и коробки с яблоками одинаковый");
        } else {
            System.out.println("Вес первой коробки с апельсинами и коробки с яблоками разный");
        }
        if (box1.compare(box3) == true) {
            System.out.println("Вес второй коробки с апельсинами и коробки с яблоками одинаковый");
        } else {
            System.out.println("Вес второй коробки с апельсинами и коробки с яблоками разный");
        }

        box2.transfer(box3);

        System.out.println("Пересыпали апельсины из первой коробки во вторую");
        System.out.println("Вес коробки с яблоками " + box1.getWeight());
        System.out.println("Вес первой коробки с апельсинами " + box2.getWeight());
        System.out.println("Вес второй коробки с апельсинами " + box3.getWeight());
        if (box1.compare(box2) == true) {
            System.out.println("Вес первой коробки с апельсинами и коробки с яблоками одинаковый");
        } else {
            System.out.println("Вес первой коробки с апельсинами и коробки с яблоками разный");
        }
        if (box1.compare(box3) == true) {
            System.out.println("Вес второй коробки с апельсинами и коробки с яблоками одинаковый");
        } else {
            System.out.println("Вес второй коробки с апельсинами и коробки с яблоками разный");
        }

        box2.add(orange);

        System.out.println("Добавили фрукты в коробки");
        System.out.println("Вес коробки с яблоками " + box1.getWeight());
        System.out.println("Вес первой коробки с апельсинами " + box2.getWeight());
        System.out.println("Вес второй коробки с апельсинами " + box3.getWeight());
        if (box1.compare(box2) == true) {
            System.out.println("Вес первой коробки с апельсинами и коробки с яблоками одинаковый");
        } else {
            System.out.println("Вес первой коробки с апельсинами и коробки с яблоками разный");
        }
        if (box1.compare(box3) == true) {
            System.out.println("Вес второй коробки с апельсинами и коробки с яблоками одинаковый");
        } else {
            System.out.println("Вес второй коробки с апельсинами и коробки с яблоками разный");
        }
    }
}
