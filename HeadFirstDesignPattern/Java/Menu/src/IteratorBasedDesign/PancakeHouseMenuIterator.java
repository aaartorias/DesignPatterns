package IteratorBasedDesign;

import java.util.ArrayList;

public class PancakeHouseMenuIterator implements Iterator {
    private ArrayList<MenuItem> menuItems;
    int position;

    public PancakeHouseMenuIterator(ArrayList<MenuItem> menuItem) {
        menuItems = new ArrayList<MenuItem>();
        this.menuItems = menuItem;
        position = 0;
    }

    @Override
    public boolean hasNext() {
        if (menuItems.size() <= position)
            return false;
        return true;
    }

    @Override
    public MenuItem next() {
        MenuItem menuItem = null;
        try {
            menuItem = menuItems.get(position);
            position = position + 1;
        } catch (Exception e) {
            System.out.println(" PancakgeMenu Error: next out of bounds :" + e.toString());
        }
        return menuItem;
    }
}
