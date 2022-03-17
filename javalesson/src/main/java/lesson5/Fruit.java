package lesson5;

public class Fruit {
    private float weight;

    public Fruit(float weight) {
        this.weight = weight;
    }
    //метод, который используется в таком же методе, но в классе Box, для расчета веса коробки
    public float getWeight() {
        return weight;
    }
}
