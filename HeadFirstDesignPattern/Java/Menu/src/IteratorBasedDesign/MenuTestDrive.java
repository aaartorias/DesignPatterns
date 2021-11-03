package IteratorBasedDesign;

public class MenuTestDrive {
    public static void main(String[] args) {
        PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
        DinerMenu dinerMenu = new DinerMenu();
        Waitress waitress = new Waitress(pancakeHouseMenu,dinerMenu);
        waitress.printVegetarianMenu();
        System.out.println("----------------------------------");
        waitress.printDinerMenu();
        System.out.println("----------------------------------");
        waitress.printBreakfastMenu();
        System.out.println("----------------------------------");
        waitress.printMenu();
    }
}
