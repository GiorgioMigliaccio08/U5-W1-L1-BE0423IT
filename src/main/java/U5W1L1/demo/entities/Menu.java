package U5W1L1.demo.entities;

import java.util.List;

public class Menu {

    private List<Ingredient> menuItems;


    public Menu(String menuItems) {
        this.menuItems = menuItems;
    }


    public List<Ingredient> getMenuItems() {
        return menuItems;
    }


    @Override
    public String toString() {
        StringBuilder menuDescription = new StringBuilder("Menu:\n");

        for (Ingredient menuItem : menuItems) {
            menuDescription.append(menuItem.toString()).append("\n");
        }

        return menuDescription.toString();
    }
}
