package lesson6;
// исключение, наследуемое от класса Exception, которое обязательно должны быть перехвачено программой (Checked)
public class MyArrayDataException extends Exception {
    int i;
    int j;

    //конструктор
    public MyArrayDataException(int i, int j) {
        this.i = i;
        this.j = j;
    }
}
