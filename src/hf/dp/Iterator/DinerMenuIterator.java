package hf.dp.Iterator;


public class DinerMenuIterator implements MyIterator {
    MenuItem[] items;
    int position = 0;
    public DinerMenuIterator(MenuItem[] items) {
        this.items = items;
    }

    @Override
    public MenuItem next() {
        MenuItem menuItem = items[position];
        position++;
        return menuItem;
    }
    @Override
    public boolean hasNext() {
        return position < items.length && items[position] != null;
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException("Can't delete menu items.");
    }
}
