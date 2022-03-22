package lesson7;

import java.io.*;
import java.util.Arrays;
// этот метод я взяла из методички и записала так, как нужно было по условию, через  String[] header, int[][] data,
// но этип способом получается корявый csv файл - записи не в ячейках, а массивом
public class LoadAndReadCSV {
    public static void main(String[] args) {
        try (BufferedWriter writer = new BufferedWriter(new
                FileWriter("demo.csv"))) {
            String[] header = "Value 1, Value 2, Value 3".split(";");
            int[][] data = {{100, 200, 123}, {300, 400, 500}};
            writer.write(Arrays.toString(header)); //что-то вот здесь я не так делаю, наверное
            writer.write(Arrays.deepToString(data));
            writer.close();
            System.out.println("Successfully");
        } catch (IOException e) {
            e.printStackTrace();
        }
        try (BufferedReader reader = new BufferedReader(new
                FileReader("demo.csv"));) {
            String str;
            while ((str = reader.readLine()) != null) {
                System.out.println(str);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

