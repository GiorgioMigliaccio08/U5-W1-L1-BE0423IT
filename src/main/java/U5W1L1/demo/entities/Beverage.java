package U5W1L1.demo.entities;

public class Beverage extends Ingredient {

    private double volume;


    public Beverage(String name, double price, int calories, double volume) {
        super(name, price, calories);
        this.volume = volume;
    }


    public double getVolume() {
        return volume;
    }


    @Override
    public String toString() {
        return super.toString() + " - Volume: " + volume + "l";
    }
}