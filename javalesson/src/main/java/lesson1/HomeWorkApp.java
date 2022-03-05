package lesson1;

public class HomeWorkApp {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
    }

   public static void compareNumbers() {
        int a = -9, b = 6;
        if (a>=b) {
            System.out.println("a >= b");
        }
        else {
            System.out.println("a < b");
        }
    }

   public static void printColor() {
       int value = 501;
       if (value <=0) {
           System.out.println("Красный");
       }
       if (value >0 && value <=100){
           System.out.println("Желтый");
       }
       if (value > 100) {
           System.out.println("Зеленый");
       }
   }

   public static void checkSumSign() {
        int a = -10, b = 20, c = a+b;
        if (c>=0) {
            System.out.println("Сумма положительная");
        }
        else {
            System.out.println("Сумма отрицательная");
        }
    }

    public static void printThreeWords() {
            System.out.println("Orange\nBanana\nApple");
    }
}



