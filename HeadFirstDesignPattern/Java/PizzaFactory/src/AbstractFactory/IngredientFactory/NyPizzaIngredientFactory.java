package AbstractFactory.IngredientFactory;

import AbstractFactory.Ingredients.Cheese.ICheese;
import AbstractFactory.Ingredients.Cheese.ReggianoCheese;
import AbstractFactory.Ingredients.Clams.FreshClams;
import AbstractFactory.Ingredients.Clams.IClams;
import AbstractFactory.Ingredients.Dough.IDough;
import AbstractFactory.Ingredients.Dough.ThinCrustDough;
import AbstractFactory.Ingredients.Pepperoni.IPepperoni;
import AbstractFactory.Ingredients.Pepperoni.SlicedPepperoni;
import AbstractFactory.Ingredients.Sauce.ISauce;
import AbstractFactory.Ingredients.Sauce.MarinaraSauce;
import AbstractFactory.Ingredients.Veggies.*;

public class NyPizzaIngredientFactory implements PizzaIngredientFactory {
    @Override
    public IDough createDough() {
        return new ThinCrustDough();
    }

    @Override
    public ISauce createSauce() {
        return new MarinaraSauce();
    }

    @Override
    public ICheese createCheese() {
        return new ReggianoCheese();
    }

    @Override
    public IVeggies[] createVeggies() {
        IVeggies veggies[] = {new Garlic(), new Onion(), new Mushroom(), new RedPepper()};
        return veggies;
    }

    @Override
    public IPepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    @Override
    public IClams createClam() {
        return new FreshClams();
    }
}
