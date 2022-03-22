package lesson7;

import java.io.*;
// это второй способ, изменила лишь ввод данных, с помощью StringBuilder, и получился красивый csv файл
public class TestCSV {
    public static void main(String args[]){
        try (PrintWriter writer = new PrintWriter(new File("test.csv"))) {

            StringBuilder sb = new StringBuilder();
            sb.append("Value 1");
            sb.append(';');
            sb.append("Value 2");
            sb.append(';');
            sb.append("Value 3");
            sb.append('\n');

            sb.append("101");
            sb.append(';');
            sb.append("200");
            sb.append(';');
            sb.append("123");
            sb.append('\n');

            sb.append("300");
            sb.append(';');
            sb.append("400");
            sb.append(';');
            sb.append("500");
            sb.append('\n');

            writer.write(sb.toString());
            writer.close();
            System.out.println("Successfully");

        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
        try (BufferedReader reader = new BufferedReader(new
                FileReader("test.csv"));) {
            String str;
            while ((str = reader.readLine()) != null) {
                System.out.println(str);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
