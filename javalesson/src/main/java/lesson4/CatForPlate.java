package lesson4;

public class CatForPlate {
    //характеристика класса
    private String name;
    private int appetite;
    private boolean fullness;

    // конструктор
    public CatForPlate(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.fullness = false;
    }

    //геттеры
    public String getName() {
        return name;
    }

    public int getAppetite() {
        return appetite;
    }

    public boolean itFullness() {
        return fullness;
    }

    //метод, где кот ест, сытость его становится true
    public void eat(PlateForCat p) {
        if (this.fullness) {
            return;
        }
        if (p.decreaseFood(this.appetite)) {
            this.fullness = true;
        }
    }
}


