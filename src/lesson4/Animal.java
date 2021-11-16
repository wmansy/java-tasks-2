package lesson4;

public class Animal {
    private boolean vegetarian;
    private String eats;
    private int noOflegs;

    Animal(boolean vegetarian, String eats, int noOflegs) {
        this.setVegetarian(vegetarian);
        this.setEats(eats);
        this.setNoOflegs(noOflegs);
    }

    public int getNoOflegs() {
        return noOflegs;
    }

    public void setNoOflegs(int noOflegs) {
        this.noOflegs = noOflegs;
    }

    public String getEats() {
        return eats;
    }

    public void setEats(String eats) {
        this.eats = eats;
    }

    public boolean isVegetarian() {
        return vegetarian;
    }

    public void setVegetarian(boolean vegetarian) {
        this.vegetarian = vegetarian;
    }
}

class Cat extends Animal {
    private String color;

    public Cat(boolean vegatarian, String eats, int noOflegs, String color) {
        super(vegatarian, eats, noOflegs);
        this.setColor(color);
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
