package U5W1L1.demo.entities;

public class Menu {

    private final String menuItems;


    public Menu(String menuItems) {
        this.menuItems = menuItems;
    }


    public String getMenuItems() {
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
