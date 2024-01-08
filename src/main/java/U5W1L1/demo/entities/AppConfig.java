package U5W1L1.demo.entities;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.awt.*;
import java.util.Arrays;
import java.util.List;

@Configuration
public class AppConfig {

    // Bean per una pizza Margherita
    @Bean
    public Pizza margherita() {
        return new Pizza("Pizza Margherita", 4.99, 1104);
    }

    // Bean per una pizza Hawaiian
    @Bean
    public Pizza hawaiianPizza() {
        Topping ham = new Topping("Ham", 0.99, 35);
        Topping pineapple = new Topping("Pineapple", 0.69, 22);

        Pizza hawaiian = new Pizza("Hawaiian Pizza", 6.49, 1024);
        hawaiian.addTopping(ham);
        hawaiian.addTopping(pineapple);

        return hawaiian;
    }

    // Bean per un topping Cheese
    @Bean
    public Topping cheese() {
        return new Topping("Cheese", 0.69, 24);
    }

    // Bean per un topping Salami
    @Bean
    public Topping salami() {
        return new Topping("Salami", 0.79, 86);
    }

    // Bean per una bevanda Lemonade
    @Bean
    public Beverage lemonade() {
        return new Beverage("Lemonade", 1.29, 128, 0.331);
    }

    // Bean per una bevanda Water
    @Bean
    public Beverage water() {
        return new Beverage("Water", 0.69, 0, 0.5);
    }

    // Bean per una bevanda Wine
    @Bean
    public Beverage wine() {
        return new Beverage("Wine", 7.49, 607, 0.751);
    }

    // Bean per il menù
    @Bean
    public Menu menu() {
        List<Ingredient> menuItems = Arrays.asList(
                margherita(),
                hawaiianPizza(),
                cheese(),
                salami(),
                lemonade(),
                water(),
                wine()
        );

        return new Menu(menuItems.toString());
    }
}