package lesson2;

public class Task1 {
    public static void main(String[] args) {
        boolean result = withinTenAndTwenty(12, 8);
        System.out.println(result);
    }

    public static boolean withinTenAndTwenty(int a, int b) {
        int sum = a + b;
        if (sum >= 10 && sum <= 20) {
            return true;
        }
        return false;
    }
}


