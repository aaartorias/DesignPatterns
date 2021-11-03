package TemplateMethodBasedDesign;

public abstract class CaffeineBeverage {

    public void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        addCondiments();
    }

    private void boilWater() {
        System.out.println("Boiling Water!!!");
    }

    public abstract void brew();

    private void pourInCup() {
        System.out.println("Pouring the beverage into cup");
    }

    public abstract void addCondiments();

}
