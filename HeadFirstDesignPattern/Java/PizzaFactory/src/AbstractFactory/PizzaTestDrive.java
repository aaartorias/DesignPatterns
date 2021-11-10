package AbstractFactory;

public class PizzaTestDrive {
    public static void main(String[] args) {
        PizzaStore nyStore = new NyPizzaStore();
        PizzaStore chicagoStore = new ChicagoPizzaStore();
        nyStore.orderPizza("cheese");
        chicagoStore.orderPizza("clam");
    }
}
