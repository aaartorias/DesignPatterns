package NaiveDesign;

public class CaffeineBeveragePreparationEmulator {
    public static void main(String[] args) {
        Tea tea = new Tea();
        tea.prepareRecipe();
        Coffee coffee = new Coffee();
        coffee.prepareRecipe();
    }
}
