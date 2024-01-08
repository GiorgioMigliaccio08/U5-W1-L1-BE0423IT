package U5W1L1.demo.entities;

public abstract class Ingredient {

    private String name;
    private double price;
    private int calories;


    public Ingredient(String name, double price, int calories) {
        this.name = name;
        this.price = price;
        this.calories = calories;
    }


    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getCalories() {
        return calories;
    }


    @Override
    public String toString() {
        return name + " - Price: " + price + " - Calories: " + calories;
    }
}
