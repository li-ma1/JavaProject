package lesson4;
//пс.комменты пишу больше для себя, чтобы четко понимать, что и зачем у меня идет :)
//сканер для красоты, чтобы вводить товары в консоль
import java.util.Scanner;

public class Payment {            //внешний класс и
    private String name;
    private Product[] prodArray;
    private int cost;

    public class Product {                                       //внутрений класс
        private String type;
        private int costProduct;

        public Product(String type, int costProduct) {          //конструктор внутреннего класса
            super();
            this.type = type;
            this.costProduct = costProduct;
        }
    }

    public Payment(String name) {                            //конструктор внешнего класса
        super();
        this.name = name;
    }

    public void setPayment() {                               //метод внешнего класса для ввода товара и счета общей суммы
        this.cost = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите количество товаров, которое хотите приобрести: ");
        int i = sc.nextInt();
        prodArray = new Product[i];
        for (i = 0; i < prodArray.length; i++) {
            System.out.println("Товар " + (i + 1) + ": ");
            System.out.print("Тип товара: ");
            String type = sc.next();
            System.out.print("Цена: ");
            int costProduct = sc.nextInt();
            System.out.println("___________________________");
            prodArray[i] = new Product(type, costProduct);
            this.cost = this.cost + prodArray[i].costProduct;
        }
    }

    public void print() {                                               //метод для распечатывания итога
        System.out.println(" " + this.name);
        System.out.println("___________________________");
        for (int i = 0; i < this.prodArray.length; i++) {
            System.out.print(i + 1 + " ");
            System.out.print(this.prodArray[i].type + " ");
            System.out.println(this.prodArray[i].costProduct + " ");
        }
        System.out.println("___________________________");
        System.out.print("Общая стоимость: ");
        System.out.print(this.cost);
    }
}
