package hf.dp.AbstractFactory;

import hf.dp.AbstractFactory.Ingredients.Cheese.Cheese;
import hf.dp.AbstractFactory.Ingredients.Clams.Clams;
import hf.dp.AbstractFactory.Ingredients.Dough.Dough;
import hf.dp.AbstractFactory.Ingredients.Pepperoni.Pepperoni;
import hf.dp.AbstractFactory.Ingredients.Sauce.Sauce;
import hf.dp.AbstractFactory.Ingredients.Veggies.Veggies;

public interface PizzaIngredientFactory {
    public Dough createDough();
    public Sauce createSauce();
    public Cheese createCheese();
    public Veggies[] createVeggies();
    public Pepperoni createPepperoni();
    public Clams createClam();
}
