package lesson3.Car;

public class Lorry extends Car {
    int tonnage;

    public Lorry(String brand, String aClass, int weight, Engine engine, int tonnage) {
        super(brand, aClass, weight, engine);
        this.tonnage = tonnage;
    }

    @Override
    public void start() {
        System.out.println("Грузовик поехал");
    }

    @Override
    public void stop() {
        System.out.println("Грузовик остановился");
    }

    @Override
    public void printInfo() {
        System.out
                .print("Марка грузовика: " + brand + "\nКласс: " + aClass + "\nВес: " + weight + "\nМощность двигателя"
                        + engine.power + "\nПроизводитель двигателя" + engine.maker + "\nГрузоподъемность: " + tonnage);
    }
}
