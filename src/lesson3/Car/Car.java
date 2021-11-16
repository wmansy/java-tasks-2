package lesson3.Car;

public abstract class Car {
    String brand;
    String aClass;
    int weight;
    Engine engine;

    public Car(String brand, String aClass, int weight, Engine engine) {
        this.brand = brand;
        this.aClass = aClass;
        this.weight = weight;
        this.engine = engine;
    }

    public abstract void start();

    public abstract void stop();

    public abstract void printInfo();

    public void turnRight() {
        System.out.println("Поворот направо");
    }

    public void turnLeft() {
        System.out.println("Поворот налево");
    }
}
