package algorithmicTechniques;

public class Item {
    private Double value;
    private Double weight;

    public Item(double value, double weight) {
        this.value = value;
        this.weight = weight;
    }

    public Double getValue() {
        return value;
    }

    public Double getWeight() {
        return weight;
    }
}
