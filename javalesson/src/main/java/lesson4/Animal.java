package lesson4;

public class Animal {
    String name;
    String type;
    static int count;
    int run;
    int swims;

    public Animal() {
        count++;
    }

    public void swim(int l) {
        if (type == "cat") {
            System.out.println("Коты не умеют плавать");
        }
        else
        if (type == "dog" && swims >= l) {
            System.out.println(this.name + " проплыл " + l + "м.");
        } else {
            System.out.println(this.name + " не плыл, слишком длинная дистанция");
        }
    }

    public void run(int d) {
        if (run >= d) {
            System.out.println(this.name + " пробежал " + d + "м.");
        } else {
            System.out.println(this.name + " не бежал, слишком длинная дистанция");
        }
    }
}



