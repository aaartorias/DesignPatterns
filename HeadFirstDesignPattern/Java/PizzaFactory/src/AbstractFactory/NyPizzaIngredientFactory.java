package AbstractFactory;

public class NyPizzaIngredientFactory implements PizzaIngredientFactory {
    @Override
    public IDough createDough() {
        return new ThinCrustDough();
    }

    @Override
    public Isauce createSauce() {
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
