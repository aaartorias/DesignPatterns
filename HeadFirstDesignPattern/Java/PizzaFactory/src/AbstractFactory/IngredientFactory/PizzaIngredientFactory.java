package AbstractFactory.IngredientFactory;

import AbstractFactory.Ingredients.Cheese.ICheese;
import AbstractFactory.Ingredients.Clams.IClams;
import AbstractFactory.Ingredients.Dough.IDough;
import AbstractFactory.Ingredients.Pepperoni.IPepperoni;
import AbstractFactory.Ingredients.Sauce.ISauce;
import AbstractFactory.Ingredients.Veggies.IVeggies;

public interface PizzaIngredientFactory {
    IDough createDough();
    ISauce createSauce();
    ICheese createCheese();
    IVeggies[] createVeggies();
    IPepperoni createPepperoni();
    IClams createClam();
}
