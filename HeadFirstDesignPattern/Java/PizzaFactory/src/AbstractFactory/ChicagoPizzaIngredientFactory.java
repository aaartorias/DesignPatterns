package AbstractFactory;

public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory {
    @Override
    public IDough createDough() {
        return new ThickCrustDough();
    }

    @Override
    public Isauce createSauce() {
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
