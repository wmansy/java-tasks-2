package lesson2.Animal;

public class Horse extends Animal {
    String name;
    public Horse(String name, String food, String location) {
        super(food, location);
        this.name = name;
    }

    @Override
    public void makeNoise() {
        System.out.println("just noise");
    }

    @Override
    public void eat() {
        System.out.println("Horse eat");
    }
}