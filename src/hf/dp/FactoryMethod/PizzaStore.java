package hf.dp.FactoryMethod;

public abstract class PizzaStore {
    public Pizza orderPizza(String type) {
        Pizza pizza = createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        return pizza;
    }

    protected abstract Pizza createPizza(String type);
}
