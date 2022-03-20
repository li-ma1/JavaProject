package lesson6;

public class MainApp {
    public static void main(String[] args) {
        String[][] arr = new String[][]{{"1", "2", "3", "4"}, {"2", "2", "2", "3"}, {"1", "2", "2", "2"},
                {"2", "2", "2", "2"}};
        try {
            try {   // выполняем метод, если ничего не валится, печатаем результат метода - сумму всех элементов массива
                int result = method(arr);
                System.out.println(result);
            } catch (MyArraySizeException e) { // если упало первое исключение, печатаем эту фразу
                System.out.println("Размер массива неверный!");
            }
        } catch (MyArrayDataException e) { // если упало второе исключение, печатаем эту фразу
            System.out.println("Неправильное значение массива!");
            System.out.println("Ошибка в ячейке: [" + e.i + "," + e.j + "]");
        }
    }
    public static int method(String[][] arr) throws MyArraySizeException, MyArrayDataException {
        int count = 0;
        for (int i = 0; i < arr.length; i++) { //если длина массива не 4, выполняем первое исключение
            if (arr[i].length != 4) {
                throw new MyArraySizeException();
            }
            for (int j = 0; j < arr[i].length; j++) {
                try {
                    count = count + Integer.parseInt(arr[i][j]); //преобразуем в integer каждую ячейку и считаем их сумму
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException(i, j); //если не преобразовался элемент бросаем второе исключение
                }
            }
        }
        return count; //если двух исключений нет, то возвращаем сумму всех элементов
    }
}

