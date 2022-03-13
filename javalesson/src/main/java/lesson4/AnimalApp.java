package lesson4;

public class AnimalApp {
    public static void main(String[] args) {
        Cat cat = new Cat("Барсик", "cat", 200, 0);
        cat.catInfo();
        cat.swim(10);
        cat.run(100);
        Dog dog = new Dog("Тузик", "dog",500, 10);
        dog.dogInfo();
        dog.swim(20);
        dog.run(300);
        Dog dog1 = new Dog("Шарик","dog", 500, 10);
        dog1.dogInfo();
        dog1.swim(4);
        dog1.run(600);
        System.out.println("________________________________________");
        System.out.println("Всего котов создано: " + Cat.count);
        System.out.println("Всего собак создано: " + Dog.count);
        System.out.println("Всего животных создано: " + Animal.count);
    }
}

