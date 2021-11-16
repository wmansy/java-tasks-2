package lesson3.Car;

public class SportCar extends Car {
    int maxSpeed;

    public SportCar(String brand, String aClass, int weight, Engine engine, int maxSpeed) {
        super(brand, aClass, weight, engine);
        this.maxSpeed = maxSpeed;
    }

    @Override
    public void start() {
        System.out.println("Спорткар поехал");
    }

    @Override
    public void stop() {
        System.out.println("Спорткар остановился");
    }

    @Override
    public void printInfo() {
        System.out.print("Марка спорткара: " + brand + "\nКласс: " + aClass + "\nВес: " + weight
                + "\nМощность двигателя" + engine.power + "\nПроизводитель двигателя" + engine.maker
                + "\nМаксимальная скорость: " + maxSpeed);
    }
}
