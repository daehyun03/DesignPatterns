package hf.dp.Iterator;

public class DinerMenu {
    MenuItem[] menuItems;
    public Iterator createIterator() {
        return new DinerMenuIterator(menuItems);
    }
}
