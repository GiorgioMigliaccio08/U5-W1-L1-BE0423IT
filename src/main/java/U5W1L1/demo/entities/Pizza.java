package U5W1L1.demo.entities;

import java.util.ArrayList;
import java.util.List;

public class Pizza extends Ingredient {

    private List<Topping> toppings;

    // Costruttore per una pizza base
    public Pizza(String name, double price, int calories) {
        super(name, price, calories);
        this.toppings = new ArrayList<>();
    }

    // Aggiungi un topping alla pizza
    public void addTopping(Topping topping) {
        toppings.add(topping);
    }

    // Metodo toString per una rappresentazione testuale della pizza
    @Override
    public String toString() {
        StringBuilder pizzaDescription = new StringBuilder(super.toString() + " - Toppings: ");
        if (toppings.isEmpty()) {
            pizzaDescription.append("None");
        } else {
            for (Topping topping : toppings) {
                pizzaDescription.append(topping.getName()).append(", ");
            }
            // Rimuovi l'ultima virgola e spazio
            pizzaDescription.delete(pizzaDescription.length() - 2, pizzaDescription.length());
        }
        return pizzaDescription.toString();
    }
}
