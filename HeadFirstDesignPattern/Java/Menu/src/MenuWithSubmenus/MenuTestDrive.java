package MenuWithSubmenus;

public class MenuTestDrive {
    public static void main(String[] args) {
        MenuComponent pancakeHouseMenu = new Menu("PANCAKE HOUSE MENU", "breakfast");
        MenuComponent dinerMenu = new Menu("DINER MENU", "Lunch");
        MenuComponent cafeMenu = new Menu("CAFE MENU", "Dinner");
        MenuComponent dessertMenu = new Menu("DESSERT MENU", "Dessert of course!");
        MenuComponent allMenus = new Menu("ALL MENUS", "All menus combined");

        allMenus.add(pancakeHouseMenu);
        allMenus.add(dinerMenu);
        allMenus.add(cafeMenu);

        dinerMenu.add(new MenuItem("Vegetarian BLT",
                "(Fakin’) Bacon with lettuce & tomato on whole wheat",
                true, 2.99 ));
        dinerMenu.add(new MenuItem("BLT",
                "Bacon with lettuce & tomato on whole wheat",
                false, 2.99));
        dinerMenu.add(new MenuItem("Soup of the day",
                "Soup of the day, with a side of potato salad",
                false, 3.29));
        dinerMenu.add(new MenuItem("Hotdog",
                "A hot dog, with sauerkraut, relish, onions, topped with cheese",
                false, 3.05));

        dinerMenu.add(dessertMenu);

        pancakeHouseMenu.add(new MenuItem("K&B’s Pancake Breakfast",
                "Pancakes with scrambled eggs",
                true, 2.99));
        pancakeHouseMenu.add(new MenuItem("Regular Pancake Breakfast",
                "Pancakes with fried eggs,sausage",
                false,2.99));
        pancakeHouseMenu.add(new MenuItem("Blueberry Pancakes",
                "Pancakes made with fresh blueberries",
                true, 2.99));
        pancakeHouseMenu.add(new MenuItem("Waffles",
                "Waffles with your choice of blueberries or strawberries",
                true, 2.99));

        cafeMenu.add(new MenuItem("Veggie burger and Air Fries",
                "Veggie burger on a whole wheat bun, lettuce, tomato, and fries",
                true, 3.99));
        cafeMenu.add(new MenuItem("Soup of the day",
                "A cup of the soup of the day, with a side salad",
                false, 3.69));
        cafeMenu.add(new MenuItem("Burrito",
                "A large burrito, with whole pinto beans, salsa, guacamole",
                true, 4.29));

        dessertMenu.add(new MenuItem("Apple Pie",
                "Apple pie with flaky crust, topped with vanilla ice-cream",
                true, 1.59));
        dessertMenu.add(new MenuItem("Cheese cake",
                "Creamy New York cheesecake, with a chocolate graham crust",
                true, 1.99));
        dessertMenu.add(new MenuItem("Sorbet",
                "A scoop of raspberry and a scoop of lime",
                true, 1.89));

        Waitress waitress = new Waitress(allMenus);


//        waitress.printVegetarianMenu();
//        System.out.println("----------------------------------");
//        waitress.printDinerMenu();
//        System.out.println("----------------------------------");
//        waitress.printBreakfastMenu();
        System.out.println("----------------------------------");
        waitress.printMenu();
    }
}
