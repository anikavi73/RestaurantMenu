package restaurants;

public class Restaurant {
    public static void main (String[] args){
        Menu myMenu = new Menu();
        MenuItems firstItem = new MenuItems("Fries", 1.69, "Curly Fries", "Appetizer", true, true );
        MenuItems secondItem = new MenuItems("Sweet Potato Fries", 2.69, "Sweet Potato Fries", "Appetizer", true, true );
        MenuItems thirdItem = new MenuItems("Pasta", 8.99, "Alfredo Pasta", "entree", true, true );
        myMenu.add(firstItem);
        myMenu.add(secondItem);
        myMenu.add(thirdItem);

        System.out.println(myMenu);

    }

}
