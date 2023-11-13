package hf.dp.AbstractFactory;

import hf.dp.AbstractFactory.Ingredients.Cheese.Cheese;
import hf.dp.AbstractFactory.Ingredients.Cheese.MozzarellaCheese;
import hf.dp.AbstractFactory.Ingredients.Clams.Clams;
import hf.dp.AbstractFactory.Ingredients.Clams.FrozenClams;
import hf.dp.AbstractFactory.Ingredients.Dough.Dough;
import hf.dp.AbstractFactory.Ingredients.Dough.ThickCrustDough;
import hf.dp.AbstractFactory.Ingredients.Pepperoni.Pepperoni;
import hf.dp.AbstractFactory.Ingredients.Pepperoni.SlicedPepperoni;
import hf.dp.AbstractFactory.Ingredients.Sauce.PlumTomatoSauce;
import hf.dp.AbstractFactory.Ingredients.Sauce.Sauce;
import hf.dp.AbstractFactory.Ingredients.Veggies.*;

public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory {
    @Override
    public Dough createDough() {
        return new ThickCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new PlumTomatoSauce();
    }

    @Override
    public Cheese createCheese() {
        return new MozzarellaCheese();
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
        return new FrozenClams();
    }
}
