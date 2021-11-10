package AbstractFactory;

import Pizza.PepperoniPizza;

public interface PizzaIngredientFactory {
    IDough createDough();
    Isauce createSauce();
    ICheese createCheese();
    IVeggies[] createVeggies();
    IPepperoni createPepperoni();
    IClams createClam();
}
