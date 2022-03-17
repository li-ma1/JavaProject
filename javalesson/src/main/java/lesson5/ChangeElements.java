package lesson5;

public class ChangeElements {
    public static void main(String[] args) {
        String[] str = new String[4];
        str[0] = "Friday ";
        str[1] = "good ";
        str[2] = "is a ";
        str[3] = "day";

        for (int i = 0; i < str.length; i++)
            System.out.print(str[i]);
        System.out.println();
        String g = str[2];
        str[2] = str[1];
        str[1] = g;

        for (int i = 0; i < str.length; i++) {
            System.out.print(str[i]);
        }
    }
}

