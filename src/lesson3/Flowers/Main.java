package lesson3.Flowers;

public class Main {
    public static void main(String[] msi) {
        int price = 100;

        Flower rose = new Rose(price);
        Flower tulip = new Tulip(price);
        Flower carnation = new Carnation(price);
        Flower[] bouquet1 = { rose, tulip, carnation };
        Flower[] bouquet2 = { tulip, tulip, carnation };
        Flower[] bouquet3 = { rose, rose, rose };

        System.out.println(bouquet1.length + bouquet2.length + bouquet3.length);
    }
}
