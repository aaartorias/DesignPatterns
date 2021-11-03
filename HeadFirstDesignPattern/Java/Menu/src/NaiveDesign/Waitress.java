package NaiveDesign;

import java.util.ArrayList;

public class Waitress {
    PancakeHouseMenu pancakeHouseMenu;
    DinerMenu dinerMenu;

    public Waitress(PancakeHouseMenu pancakeHouseMenu, DinerMenu dinerMenu) {
        this.pancakeHouseMenu = pancakeHouseMenu;
        this.dinerMenu = dinerMenu;
    }

    public void printMenu() {
        ArrayList<MenuItem> pancakeHouseMenuItems = pancakeHouseMenu.getMenuItems();
        MenuItem[] dinerMenuItems = dinerMenu.getMenuItems();
        for (MenuItem menuItem: pancakeHouseMenuItems) {
            System.out.println("Pancake House Menu: "+ menuItem.getName() +
                    " " + menuItem.getDescription() + " " + menuItem.getPrice());
        }
        for (int i = 0; i < dinerMenu.getNumberOfItems(); i++) {
            MenuItem menuItem = dinerMenuItems[i];
            System.out.println("Pancake House Menu: " + menuItem.getName() +
                    " " + menuItem.getDescription() + " " + menuItem.getPrice());
        }
    }

    public void printBreakfastMenu() {
        ArrayList<MenuItem> pancakeHouseMenuItems = pancakeHouseMenu.getMenuItems();
        for (MenuItem menuItem: pancakeHouseMenuItems) {
            System.out.println("Pancake House Menu: "+ menuItem.getName() +
                    " " + menuItem.getDescription() + " " + menuItem.getPrice());
        }
    }

    public void printVegetarianMenu() {
        ArrayList<MenuItem> pancakeHouseMenuItems = pancakeHouseMenu.getMenuItems();
        MenuItem[] dinerMenuItems = dinerMenu.getMenuItems();
        for (MenuItem menuItem: pancakeHouseMenuItems) {
            if (menuItem.isVegetarian()) {
                System.out.println("Breakfast Menu: " + menuItem.getName() +
                        " " + menuItem.getDescription() + " " + menuItem.getPrice());
            }
        }
        for (int i = 0; i < dinerMenu.getNumberOfItems(); i++) {
            MenuItem menuItem = dinerMenuItems[i];
            if (menuItem.isVegetarian()) {
                System.out.println("Pancake House Menu: " + menuItem.getName() +
                        " " + menuItem.getDescription() + " " + menuItem.getPrice());
            }
        }
    }

    public void printDinerMenu() {
        MenuItem[] dinerMenuItems = dinerMenu.getMenuItems();
        for (int i = 0; i < dinerMenu.getNumberOfItems(); i++) {
            MenuItem menuItem = dinerMenuItems[i];
            System.out.println("Pancake House Menu: " + menuItem.getName() +
                    " " + menuItem.getDescription() + " " + menuItem.getPrice());
        }
    }

    public boolean isItemVegetarian(String name) {
        ArrayList<MenuItem> pancakeHouseMenuItems = pancakeHouseMenu.getMenuItems();
        MenuItem[] dinerMenuItems = dinerMenu.getMenuItems();
        for (MenuItem menuItem: pancakeHouseMenuItems) {
            if (menuItem.getName() == name) return true;
        }
        for (MenuItem menuItem: dinerMenuItems) {
            if (menuItem.getName() == name) return true;
        }
        return false;
    }
}
