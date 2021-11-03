package IteratorBasedDesign;

import java.util.ArrayList;

public class Waitress {
    PancakeHouseMenu pancakeHouseMenu;
    DinerMenu dinerMenu;

    public Waitress(PancakeHouseMenu pancakeHouseMenu, DinerMenu dinerMenu) {
        this.pancakeHouseMenu = pancakeHouseMenu;
        this.dinerMenu = dinerMenu;
    }

    public void printMenu() {
        Iterator pancakeIterator = pancakeHouseMenu.createIterator();
        Iterator dinerMenuIterator = dinerMenu.createIterator();
        // Print Pancake menu
        System.out.println("Pancake Menu");
        printMenu(pancakeIterator);
        // Print Diner menu
        System.out.println("Diner Menu");
        printMenu(dinerMenuIterator);
    }

    private void printMenu(Iterator iterator) {
        while (iterator.hasNext()) {
            MenuItem menuItem = iterator.next();
            printMenuInfo(menuItem);
        }

    }

    private void printMenuInfo(MenuItem menuItem) {
        System.out.println(menuItem.getName() + " " + menuItem.getDescription() + " "
                + menuItem.getPrice());
    }

    public void printBreakfastMenu() {
        Iterator pancakeIterator = pancakeHouseMenu.createIterator();
        // Print Pancake menu
        System.out.println("Breakfast Menu");
        printMenu(pancakeIterator);
    }

    public void printVegetarianMenu() {
        Iterator pancakeIterator = pancakeHouseMenu.createIterator();
        Iterator dinerMenuIterator = dinerMenu.createIterator();
        // Print Pancake menu
        System.out.println("Pancake Menu");
        printVegetarianMenu(pancakeIterator);
        // Print Diner menu
        System.out.println("Diner Menu");
        printVegetarianMenu(dinerMenuIterator);

    }

    private void printVegetarianMenu(Iterator iterator) {
        while (iterator.hasNext()) {
            MenuItem menuItem = (MenuItem) iterator.next();
            if (menuItem.isVegetarian()) {
                printMenuInfo(menuItem);
            }
        }
    }

    public void printDinerMenu() {
        Iterator dinerMenuIterator = dinerMenu.createIterator();
        // Print Diner menu
        System.out.println("Diner Menu");
        printMenu(dinerMenuIterator);
    }

    public boolean isItemVegetarian(String name) {
        Iterator pancakeIterator = pancakeHouseMenu.createIterator();
        Iterator dinerMenuIterator = dinerMenu.createIterator();
        return isItemVegetarian(pancakeIterator) || isItemVegetarian(dinerMenuIterator);
    }

    private boolean isItemVegetarian(Iterator iterator) {
        while (iterator.hasNext()) {
            MenuItem menuItem = iterator.next();
            if (menuItem.isVegetarian()) return true;
        }
        return false;
    }
}
