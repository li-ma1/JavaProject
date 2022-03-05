package lesson2;

public class Task9 {
    public static void main(String[] args) {
        printArrayConsole(newMassive(5, 9));
    }

    public static int[] newMassive(int len, int initialValue) {
        int[] arr = new int[len];
        for (len = 0; len < arr.length; len++) {
            arr[len] = initialValue;
        }
        return arr;
    }

    public static void printArrayConsole(int[] inputArray) {
        for (int i = 0; i < inputArray.length; i++) {
            System.out.print(inputArray[i] + " ");
        }
        System.out.println();
    }
}


