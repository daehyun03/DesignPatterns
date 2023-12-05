package hf.dp.Iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class DessertMenu implements Menu {

    List<MenuItem> menuItems;

    public DessertMenu() {
        menuItems = new ArrayList<>();

        addItem("Apple Pie", "Apple pie with a flakey crust, topped with vanilla icecream", true, 1.59);
        addItem("Cheesecake", "Creamy New York cheesecake, with a chocolate graham crust", true, 1.99);
        addItem("Sorbet", "A scoop of raspberry and a scoop of lime", true, 1.89);

    }

    public void addItem(String name, String description, boolean vegetarian, double price) {
        menuItems.add(new MenuItem(name, description, vegetarian, price));
    }

    public Iterator createIterator() {
        return menuItems.iterator();
    }

}
