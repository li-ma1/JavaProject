package lesson2;
//задача про високосный год, она без номера
public class Task4_1 {
    public static void main(String[] args) {
        boolean result = leapYear(2022);
        System.out.println(result);
    }

    public static boolean leapYear(int y) {
        int x = y % 4, w = y % 100, z = y % 400;
        if (x == 0 || w == 0 || z == 0) {
            return true;
        }
        return false;
    }
}
