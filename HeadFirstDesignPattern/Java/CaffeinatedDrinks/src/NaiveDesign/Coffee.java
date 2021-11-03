package NaiveDesign;

public class Coffee extends CaffeineBeverage{
    @Override
    public void prepareRecipe() {
        boilWater();
        brewCoffeeGrinds();
        pourInCup();
        addMilkAndSugar();
    }

    private void brewCoffeeGrinds() {
        System.out.println("Dripping coffee through filter!!!");
    }

    private void addMilkAndSugar() {
        System.out.println("Adding milk and sugar!!!");
    }

}
