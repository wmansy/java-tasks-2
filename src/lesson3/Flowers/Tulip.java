package lesson3.Flowers;

public class Tulip extends Flower {

    public Tulip(int price) {
        super(price);
    }

    @Override
    public int getPrice() {
        return price * 12;
    }
}
