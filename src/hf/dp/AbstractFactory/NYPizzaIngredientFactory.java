package hf.dp.AbstractFactory;

import hf.dp.AbstractFactory.Ingredients.Cheese.Cheese;
import hf.dp.AbstractFactory.Ingredients.Cheese.ReggianoCheese;
import hf.dp.AbstractFactory.Ingredients.Clams.Clams;
import hf.dp.AbstractFactory.Ingredients.Clams.FreshClams;
import hf.dp.AbstractFactory.Ingredients.Dough.Dough;
import hf.dp.AbstractFactory.Ingredients.Dough.ThinCrustDough;
import hf.dp.AbstractFactory.Ingredients.Pepperoni.Pepperoni;
import hf.dp.AbstractFactory.Ingredients.Pepperoni.SlicedPepperoni;
import hf.dp.AbstractFactory.Ingredients.Sauce.MarinaraSauce;
import hf.dp.AbstractFactory.Ingredients.Sauce.Sauce;
import hf.dp.AbstractFactory.Ingredients.Veggies.*;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory {
    @Override
    public Dough createDough() {
        return new ThinCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new MarinaraSauce();
    }

    @Override
    public Cheese createCheese() {
        return new ReggianoCheese();
    }

    @Override
    public Veggies[] createVeggies() {
        Veggies veggies[] = {new Garlic(), new Onion(), new Mushroom(),
                new RedPepper() };
        return veggies;
    }

    @Override
    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    @Override
    public Clams createClam() {
        return new FreshClams();
    }

}
