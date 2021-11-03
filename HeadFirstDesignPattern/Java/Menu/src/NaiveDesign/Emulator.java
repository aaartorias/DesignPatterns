package NaiveDesign;

public class Emulator {
    public static void main(String[] args) {
        PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
        DinerMenu dinerMenu = new DinerMenu();
        Waitress waitress = new Waitress(pancakeHouseMenu,dinerMenu);
        System.out.println("Vegetarian Menu");
        waitress.printVegetarianMenu();
        System.out.println("----------------------------------");
        System.out.println("Diner Menu");
        waitress.printDinerMenu();
        System.out.println("----------------------------------");
        System.out.println("Breakfast Menu");
        waitress.printBreakfastMenu();
        System.out.println("----------------------------------");
        System.out.println("Complete Menu");
        waitress.printMenu();
    }
}
