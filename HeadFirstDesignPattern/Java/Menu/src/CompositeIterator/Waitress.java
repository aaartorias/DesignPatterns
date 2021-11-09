package CompositeIterator;

import java.util.Iterator;

public class Waitress {
    MenuComponent allMenus;

    public Waitress(MenuComponent allMenus) {
        this.allMenus = allMenus;
    }

    public void printMenu() {
        allMenus.print();
    }

    private void printMenu(Iterator iterator) {
        while (iterator.hasNext()) {
            //MenuItem menuItem = iterator.next();
            //printMenuInfo(menuItem);
        }

    }

    private void printMenuInfo(MenuItem menuItem) {
        System.out.println(menuItem.getName() + " " + menuItem.getDescription() + " "
                + menuItem.getPrice());
    }

    public void printBreakfastMenu() {
        // Print Pancake menu
        System.out.println("Breakfast Menu");
//        printMenu(pancakeIterator);
    }

    public void printVegetarianMenu() {
        Iterator<MenuComponent> iterator = allMenus.createIterator();
        System.out.println("\n Vegetarian Menu\n---------");
        while(iterator.hasNext()) {
            MenuComponent menuComponent = iterator.next();
            try {
                if (menuComponent.isVegetarian()) {
                    menuComponent.print();
                }
            } catch (UnsupportedOperationException e) {
                System.out.println("Nothing here!!");
            }
        }

    }

    private void printVegetarianMenu(Iterator iterator) {
//        while (iterator.hasNext()) {
//            MenuItem menuItem = (MenuItem) iterator.next();
//            if (menuItem.isVegetarian()) {
//                printMenuInfo(menuItem);
//            }
//        }
    }

    public void printDinerMenu() {
//        Iterator dinerMenuIterator = menu.createIterator();
//        // Print Diner menu
//        System.out.println("Diner Menu");
//        printMenu(dinerMenuIterator);
    }

//    public boolean isItemVegetarian(String name) {
//        Iterator pancakeIterator = pancakeHouseMenu.createIterator();
//        Iterator dinerMenuIterator = menu.createIterator();
//        return isItemVegetarian(pancakeIterator) || isItemVegetarian(dinerMenuIterator);
//    }

//    private boolean isItemVegetarian(Iterator iterator) {
//        while (iterator.hasNext()) {
//            MenuItem menuItem = iterator.next();
//            if (menuItem.isVegetarian()) return true;
//        }
//        return false;
//    }
}
