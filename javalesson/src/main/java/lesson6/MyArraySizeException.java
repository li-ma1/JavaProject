package lesson6;
// исключение, наследуемое от класса Exception, которое обязательно должны быть перехвачено программой (Checked)
public class MyArraySizeException extends Exception {
    String str;

    // конструктор
    public MyArraySizeException() {
        this.str = str;
    }
}
