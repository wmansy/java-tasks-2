package lesson3.Flowers;

public class Carnation extends Flower {

    public Carnation(int price) {
        super(price);
    }

    @Override
    public int getPrice() {
        return price;
    }
}
