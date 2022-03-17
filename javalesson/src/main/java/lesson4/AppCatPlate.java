package lesson4;

public class AppCatPlate {
    public static void main(String[] args) {
        CatForPlate[] cat = new CatForPlate[3];
        cat[0] = new CatForPlate("Барсик", 5);
        cat[1] = new CatForPlate("Васька", 10);
        cat[2] = new CatForPlate("Мурзик", 4);
        PlateForCat plate = new PlateForCat(0);

        for (int i = 0; i < cat.length; i++) {
            if (cat[i].itFullness() == false) {
                //если в миске не хватает еды, чтобы накормить кота, пишем об этом и добавляем в консоль еду
                if (!plate.checkFood(cat[i].getAppetite())) {
                    System.out.println("Корма не хватает");
                    System.out.println("Добавьте в миску корм в граммах: ");
                    plate.increaseFood();
                }
                // иначе кот ест, если еды хватает - выводим, что сыт, не хватает - что не стал есть
                cat[i].eat(plate);
                if (cat[i].itFullness() == true) {
                    System.out.println("Кот " + cat[i].getName() +
                            " с аппетитом " + cat[i].getAppetite() + " поел и стал сыт");
                } else {
                    System.out.println("Кот " + cat[i].getName() +
                            " с аппетитом " + cat[i].getAppetite() + " не стал есть, так как ему мало еды");
                }
            }
            System.out.println("В миске осталось " + plate.getFood() + " граммов корма.\n");
        }
    }
}
