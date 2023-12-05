/*import hf.dp.AbstractFactory.AbstractPizzaTestDrive;
import hf.dp.Command.TestDrive;
import hf.dp.Decorator.StarbuzzCoffee;
import hf.dp.FactoryMethod.PizzaTestDrive;
import hf.dp.Observer.WeatherStation;
import hf.dp.Singleton.ChocolateController;
import hf.dp.Strategy.MiniDuckSimulator;
import hf.dp.Adaptor.DuckTestDrive;
import hf.dp.Facade.HomeTheaterTestDrive;
import hf.dp.TemplateMethod.BeverageTestDrive;*/

import hf.dp.Iterator.MenuTestDrive;

public class Main {
    public static void main(String[] args) {
        MyHWInfo.printInfo();

        //Strategy
        /*MiniDuckSimulator.run();

        //Observer
        WeatherStation.run();

        //Decorator
        StarbuzzCoffee.run();

        //Factory Method
        PizzaTestDrive.run();

        //Abstract Factory
        AbstractPizzaTestDrive.run();

        //Singleton
        ChocolateController.run();

        //Command
        TestDrive.run();

        //Adaptor
        DuckTestDrive.run();

        //Facade
        HomeTheaterTestDrive.run();

        //Template Method
        BeverageTestDrive.run();*/

        //Iterator
        MenuTestDrive.run();
    }
}