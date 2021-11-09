package SimpleFactory;

public class PizzaTestDrive {
    public static void main(String[] args) {
        SimplePizzaFactory pizzaFactory = new SimplePizzaFactory();
        PizzaStore pizzaStore = new PizzaStore(pizzaFactory);
        pizzaStore.orderPizza("cheese");
        pizzaStore.orderPizza("clam");
        pizzaStore.orderPizza("veggie");
        pizzaStore.orderPizza("none");
    }
}
