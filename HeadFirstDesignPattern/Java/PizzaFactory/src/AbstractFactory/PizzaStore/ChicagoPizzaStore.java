package AbstractFactory.PizzaStore;


import AbstractFactory.IngredientFactory.ChicagoPizzaIngredientFactory;
import AbstractFactory.IngredientFactory.PizzaIngredientFactory;
import AbstractFactory.Pizzas.*;

public class ChicagoPizzaStore extends PizzaStore {
    @Override
    public Pizza createPizza(String type) {
        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory = new ChicagoPizzaIngredientFactory();
        if (type.equals("cheese")) {
            pizza = new CheesePizza(ingredientFactory);
            pizza.setName("Chicago style Cheese Pizza");
        } else if (type.equals("greek")) {
            pizza = new GreekPizza(ingredientFactory);
            pizza.setName("Chicago style Greek Pizza");
        } else if (type.equals("pepperoni")) {
            pizza = new PepperoniPizza(ingredientFactory);
            pizza.setName("Chicago style Pepperoni Pizza");
        } else if (type.equals("clam")) {
            pizza = new ClamPizza(ingredientFactory);
            pizza.setName("Chicago style Clam Pizza");
        } else if (type.equals("veggie")) {
            pizza = new VeggiePizza(ingredientFactory);
            pizza.setName("Chicago style Veggie Pizza ");
        }
        return pizza;
    }
}
