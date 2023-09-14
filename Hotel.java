class Hotel {

    String menuItems[] = new String[10];
    int index;

    // Method to add a menu item and its price to the arrays
    public boolean addMenuItem(String menuItem) {
        boolean isAdded = false;
        if (menuItem != null) {
            menuItems[index] = menuItem;
            index++;
            isAdded = true;
        }
        return isAdded;
    }

    public void displayMenu() {
        System.out.println("Hotel Menu:");
        for (int index = 0; index < menuItems.length; index++) {
            System.out.println(menuItems[index] + " is added Successfully");
        }
    }


}