package NaiveDesign;

public class Tea extends CaffeineBeverage{
    @Override
    public void prepareRecipe() {
        boilWater();
        steepTeaBag();
        pourInCup();
        addLemon();
    }

    private void steepTeaBag() {
        System.out.println("Steeping the tea!!!");
    }

    private void addLemon() {
        System.out.println("Adding Lemon!!!");
    }
}
