package lesson4;

public class Dog extends Animal {
    static int count;

    public Dog(String name, String type, int run, int swims) {
        this.name = name;
        this.type = type;
        this.run = run;
        this.swims = swims;
        count++;
    }

    public void dogInfo() {
        System.out.println("Собака имя: " + name);
    }
}
