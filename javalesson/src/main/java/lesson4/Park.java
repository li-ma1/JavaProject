package lesson4;

public class Park {          //внешний класс
    private String name;
    private Attractions[] attrArray;

    public class Attractions {                                       //внутрений класс
        private String type;
        private String time;
        private int cost;

        public Attractions(String type, String time, int cost) {          //конструктор внутреннего класса
            super();
            this.type = type;
            this.time = time;
            this.cost = cost;
        }
    }

    public Park(String name) {                            //конструктор внешнего класса
        super();
        this.name = name;
    }
// может, я как-то неправильно поняла, и аттракционы надо было тоже через консоль вводить, как с товарами
    public void setAttract() {                               //метод внешнего класса для ввода аттракционов
        attrArray = new Attractions[3];
        attrArray[0] = new Attractions("Ромашка", "с 08.00 до 20.00", 5);
        attrArray[1] = new Attractions("Солнышко", "с 10.00 до 20.00", 7);
        attrArray[2] = new Attractions("Супер 8", "с 12.00 до 24.00", 10);
    }

    public void printAttract() {                                               //метод для выведения всех аттракционов
        System.out.println("*** " + this.name + " ***");
        System.out.println("___________________________");
        for (int i = 0; i < this.attrArray.length; i++) {
            System.out.print(i + 1 + " ");
            System.out.print("Название: ");
            System.out.println(this.attrArray[i].type + " ");
            System.out.print("Время работы: ");
            System.out.println(this.attrArray[i].time + " ");
            System.out.print("Стоимость билета: ");
            System.out.println(this.attrArray[i].cost + " ");
            System.out.println("___________________________");
        }
    }
}





