package hf.dp.Iterator;

public class MenuTestDrive {
    public static void run() {
        PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
        DinerMenu dinerMenu = new DinerMenu();
        DessertMenu dessertMenu = new DessertMenu();
        CafeMenu cafeMenu = new CafeMenu();

        Waitress waitress = new Waitress(pancakeHouseMenu, dinerMenu, dessertMenu, cafeMenu);

        System.out.println("[All Menus]");
        waitress.printMenu();
        System.out.println("[Vegetarian Menu]");
        waitress.printVegetarianMenu();
    }
}
