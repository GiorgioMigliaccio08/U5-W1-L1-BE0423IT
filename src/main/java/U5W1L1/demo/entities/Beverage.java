package U5W1L1.demo.entities;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Drink extends Item {
    private String name;

    public Drink(String name, int calories, double price) {
        super(calories, price);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Drink(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Drink{" +
                "name='" + name + '\'' +
                ", calories=" + calories +
                ", price=" + price +
                '}';
    }
}