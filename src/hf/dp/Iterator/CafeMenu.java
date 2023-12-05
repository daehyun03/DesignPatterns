package hf.dp.Iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CafeMenu implements Menu {

    List<MenuItem> menuItems;

    public CafeMenu() {
        menuItems = new ArrayList<>();

        addItem("Veggie Burger and Air Fries", "Veggie burger on a whole wheat bun, lettuce, tomato, and fries", true, 3.99);
        addItem("Soup of the day", "A cup of the soup of the day, with a side salad", false, 3.69);
        addItem("Burrito", "A large burrito, with whole pinto beans, salsa, guacamole", true, 4.29);

    }

    public void addItem(String name, String description, boolean vegetarian, double price) {
        menuItems.add(new MenuItem(name, description, vegetarian, price));
    }

    public Iterator createIterator() {
        return menuItems.iterator();
    }

}
