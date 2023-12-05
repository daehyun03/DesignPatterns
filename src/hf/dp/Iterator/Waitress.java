package hf.dp.Iterator;

import java.util.Iterator;

public class Waitress {
    Menu pancakeHouseMenu;
    Menu dinerMenu;

    Menu cafeMenu;

    Menu dessertMenu;

    public Waitress(Menu pancakeHouseMenu, Menu dinerMenu, Menu cafeMenu, Menu dessertMenu) {
        this.pancakeHouseMenu = pancakeHouseMenu;
        this.dinerMenu = dinerMenu;
        this.cafeMenu = cafeMenu;
        this.dessertMenu = dessertMenu;
    }

    public Waitress(Menu pancakeHouseMenu, Menu dinerMenu) {
        this.pancakeHouseMenu = pancakeHouseMenu;
        this.dinerMenu = dinerMenu;
    }
    public void printMenu() {
        Iterator<MenuItem> pancakeIterator = pancakeHouseMenu.createIterator();
        Iterator<MenuItem> dinerIterator = dinerMenu.createIterator();
        System.out.println("[MENU]\n----\nBREAKFAST");
        printMenu(pancakeIterator);
        System.out.println("\nLUNCH");
        printMenu(dinerIterator);
    }
    private void printMenu(Iterator<MenuItem> iterator) {
        while(iterator.hasNext()) {
            MenuItem menuItem = iterator.next();
            System.out.print(menuItem.getName() + ", ");
            System.out.print(menuItem.getPrice()+ " -- ");
            System.out.println(menuItem.getDescription());
        }
    }

    public void printVegetarianMenu() {
        Iterator<MenuItem> pancakeIterator = pancakeHouseMenu.createIterator();
        Iterator<MenuItem> dinerIterator = dinerMenu.createIterator();
        System.out.println("[MENU]\n-------------\nBREAKFAST");
        printVegetarianMenu(pancakeIterator);

        System.out.println("\nLUNCH");
        printVegetarianMenu(dinerIterator);
    }
    public void printVegetarianMenu(Iterator<MenuItem> iterator) {
        while(iterator.hasNext()) {
           MenuItem menuItem = iterator.next();
           if(menuItem.isVegetarian()) {
               System.out.print(menuItem.getName() + ", ");
               System.out.print(menuItem.getPrice()+ " -- ");
               System.out.println(menuItem.getDescription());
           }
        }
    }
}
