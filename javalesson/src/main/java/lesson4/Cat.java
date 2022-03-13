package lesson4;

public class Cat extends Animal {
    static int count;

    public Cat(String name, String type, int run, int swims) {
        this.name = name;
        this.type = type;
        this.run = run;
        this.swims = swims;
        count++;
    }

    public void catInfo() {
        System.out.println("Кот имя: " + name);
    }
}
