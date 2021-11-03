package IteratorBasedDesign;

public class DinerMenuIterator implements Iterator {
    private MenuItem[] menuItems;
    private int position;

    public DinerMenuIterator(MenuItem[] menuItems) {
        this.menuItems = menuItems;
        position = 0;
    }

    @Override
    public boolean hasNext() {
        if (menuItems.length <=  position
                || menuItems[position]  == null)
            return false;
        return true;
    }

    @Override
    public MenuItem next() {
        try {
            MenuItem menuItem = menuItems[position];
            position = position + 1;
            return menuItem;
        } catch (Exception e) {
            System.out.println("out of bound: " + e.toString() );
        }
        //TODO: use null pattern
        return null;
    }
}
