package AbstractFactory.Pizzas;

import AbstractFactory.IngredientFactory.PizzaIngredientFactory;

public class VeggiePizza extends Pizza {
    private PizzaIngredientFactory ingredientFactory;
    public VeggiePizza(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    @Override
    public void prepare() {
        System.out.println("Preparing " + getName());
        setCheese(ingredientFactory.createCheese());
        setDough(ingredientFactory.createDough());
        setSauce(ingredientFactory.createSauce());
        setVeggies(ingredientFactory.createVeggies());
    }
}
