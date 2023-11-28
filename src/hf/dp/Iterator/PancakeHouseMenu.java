package hf.dp.Iterator;

import java.util.ArrayList;

public class PancakeHouseMenu {
    ArrayList<MenuItem> menuItems;
    public Iterator createIterator() {
        return new PancakeHouseMenuIterator(menuItems);
    }
}
