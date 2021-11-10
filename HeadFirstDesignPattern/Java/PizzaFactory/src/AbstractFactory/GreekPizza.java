package AbstractFactory;

public class GreekPizza extends Pizza {
    private PizzaIngredientFactory ingredientFactory;

    public GreekPizza(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    @Override
    void prepare() {
        System.out.println("Preparing " + getName());
        setCheese(ingredientFactory.createCheese());
        setDough(ingredientFactory.createDough());
        setSauce(ingredientFactory.createSauce());
        setVeggies(ingredientFactory.createVeggies());
    }
}