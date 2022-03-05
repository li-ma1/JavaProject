package lesson2;

public class Task8 {
    public static void main(String[] args) {
        int[][] arr = new int[7][7];
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                if (i == j || i+j+1 == arr.length) {
                    arr[i][j] = 1;
                } else arr[i][j] = 0;
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
