package lesson2;

public class Task10 {
    public static void main(String[] args) {
        modifyArray(new int[]{3, 6, 7, 4, 3, 9, 5}, 3);
    }

    public static void modifyArray(int[] arr, int n) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();

        if (n > 0) {
            for (int i = 0; i < n; i++) {
                // двигаемся вправо
                int mr = arr[arr.length - 1];
                for (int j = arr.length - 1; j > 0; j--) {
                    arr[j] = arr[j - 1];
                }
                arr[0] = mr;
            }
        } else if (n < 0) {
            for (int i = 0; i < n * (-1); i++) {
                // двигаемся влево
                int mr = arr[0];
                for (int j = 0; j < arr.length - 1; j++) {
                    arr[j] = arr[j + 1];
                }
                arr[arr.length - 1] = mr;
            }
        }

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}















