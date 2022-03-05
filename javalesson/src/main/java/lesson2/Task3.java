package lesson2;

public class Task3 {
    public static void main(String[] args) {
        boolean result = positiveOrNegative(0);
        System.out.println(result);
    }

    public static boolean positiveOrNegative(int a) {
        if (a < 0) {
            return true;
        }
        return false;
    }
}
