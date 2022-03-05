package lesson2;

public class Task4 {
    public static void main(String[] args) {
        print("Hello", 3);
    }

    public static void print(String word, int n) {
        int i = 0;
        for (i = 0; i < n; i++) {
            System.out.println(word);
        }
    }
}
