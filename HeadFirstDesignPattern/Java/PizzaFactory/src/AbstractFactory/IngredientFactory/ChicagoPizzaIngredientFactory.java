package AbstractFactory.IngredientFactory;

import AbstractFactory.Ingredients.Cheese.ICheese;
import AbstractFactory.Ingredients.Cheese.MozzarellaCheese;
import AbstractFactory.Ingredients.Clams.FrozenClams;
import AbstractFactory.Ingredients.Clams.IClams;
import AbstractFactory.Ingredients.Dough.IDough;
import AbstractFactory.Ingredients.Dough.ThickCrustDough;
import AbstractFactory.Ingredients.Pepperoni.IPepperoni;
import AbstractFactory.Ingredients.Pepperoni.SlicedPepperoni;
import AbstractFactory.Ingredients.Sauce.ISauce;
import AbstractFactory.Ingredients.Sauce.PlumTomatoSauce;
import AbstractFactory.Ingredients.Veggies.BlackOlives;
import AbstractFactory.Ingredients.Veggies.EggPlant;
import AbstractFactory.Ingredients.Veggies.IVeggies;
import AbstractFactory.Ingredients.Veggies.Spinach;

public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory {
    @Override
    public IDough createDough() {
        return new ThickCrustDough();
    }

    @Override
    public ISauce createSauce() {
        return new PlumTomatoSauce();
    }

    @Override
    public ICheese createCheese() {
        return new MozzarellaCheese();
    }

    @Override
    public IVeggies[] createVeggies() {
        IVeggies veggies[] = {new EggPlant(), new Spinach(), new BlackOlives()};
        return veggies;
    }

    @Override
    public IPepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    @Override
    public IClams createClam() {
        return new FrozenClams();
    }
}
