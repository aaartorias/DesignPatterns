package FactoryMethod;

public class PizzaTestDrive {
    public static void main(String[] args) {
        PizzaStore nyStore = new NyPizzaStore();
        PizzaStore chicagoStore = new ChicagoPizzaStore();
        nyStore.orderPizza("cheese");
        chicagoStore.orderPizza("clam");
//        PizzaStore pizzaStore = new PizzaStore(pizzaFactory);
//        pizzaStore.orderPizza("cheese");
//        pizzaStore.orderPizza("clam");
//        pizzaStore.orderPizza("veggie");
//        pizzaStore.orderPizza("none");
    }
}
