package AbstractFactory;

public class PepperoniPizza  extends Pizza {
    private PizzaIngredientFactory ingredientFactory;
    public PepperoniPizza(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    @Override
    void prepare() {
        System.out.println("Preparing " + getName());
        setCheese(ingredientFactory.createCheese());
        setDough(ingredientFactory.createDough());
        setSauce(ingredientFactory.createSauce());
        setPepperoni(ingredientFactory.createPepperoni());
    }
}

