package U5W1L1.demo.entities;

import java.util.List;

public class PizzaCombination extends Pizza {


    public PizzaCombination(String name, double basePrice, int baseCalories, List<Topping> toppings) {
        super(name, basePrice, baseCalories);
        this.getToppings().addAll(toppings);
    }

    private <E> List getToppings() {
        return null;
    }


}
