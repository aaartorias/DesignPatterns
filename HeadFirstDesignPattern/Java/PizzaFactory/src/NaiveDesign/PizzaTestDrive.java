package NaiveDesign;

public class PizzaTestDrive {
    public static void main(String[] args) {
        PizzaStore pizzaStore = new PizzaStore();
        pizzaStore.orderPizza("cheese");
        pizzaStore.orderPizza("clam");
        pizzaStore.orderPizza("greek");
        pizzaStore.orderPizza("none");
    }
}
