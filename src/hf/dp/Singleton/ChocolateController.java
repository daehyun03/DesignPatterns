package hf.dp.Singleton;

public class ChocolateController {
    public static void run() {
        ChocolateBoiler boiler = ChocolateBoiler.getInstance();
        //will return the existing instance
        ChocolateBoiler boiler2 = ChocolateBoiler.getInstance();

        boiler.fill();
        boiler2.reportBoilerState();
        boiler.boil();
        boiler2.reportBoilerState();
        boiler.drain();
        boiler2.reportBoilerState();
    }
}
