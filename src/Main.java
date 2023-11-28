/*import hf.dp.AbstractFactory.AbstractPizzaTestDrive;
import hf.dp.Command.TestDrive;
import hf.dp.Decorator.StarbuzzCoffee;
import hf.dp.FactoryMethod.PizzaTestDrive;
import hf.dp.Observer.WeatherStation;
import hf.dp.Singleton.ChocolateController;
import hf.dp.Strategy.MiniDuckSimulator;*/
import hf.dp.Adaptor.DuckTestDrive;
import hf.dp.Facade.HomeTheaterTestDrive;
import hf.dp.TemplateMethod.BeverageTestDrive;

public class Main {
    public static void main(String[] args) {
        MyHWInfo.printInfo();
        /*MiniDuckSimulator.run();
        WeatherStation.run();
        StarbuzzCoffee.run();
        PizzaTestDrive.run();
        AbstractPizzaTestDrive.run();
        ChocolateController.run();
        TestDrive.run();*/
        DuckTestDrive.run();
        //HomeTheaterTestDrive.run();
        //BeverageTestDrive.run();
    }
}