package lesson3.Flowers;

public class Rose extends Flower {
    int price;

    public Rose(int price) {
        super(price);
    }

    @Override
    public int getPrice() {
        return price * 15;
    }
}
