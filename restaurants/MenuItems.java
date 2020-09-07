package restaurants;

import java.util.Objects;

public class MenuItems {
    private String name;
    private double price;
    private String description;
    private String category;
    private boolean isNew;
    private boolean isVegan;

    public MenuItems (String name, double price, String description, String category, boolean isNew, boolean isVegan){
        this.name = name;
        this.price = price;
        this.description = description;
        this.category = category;
        this.isNew = true;
        this.isVegan = isVegan;
    }

    public boolean isNew() {
        return isNew;
    }

    public void setNew(boolean aNew){

        isNew = aNew;
    }

    public boolean isVegan(){

        return isVegan;
    }

    public void setVegan(boolean vegan){

        isVegan = vegan;
    }

    @Override
    public String toString() {
        return "MenuItems{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", description='" + description + '\'' +
                ", category='" + category + '\'' +
                ", isNew=" + isNew +
                ", isVegan=" + isVegan +
                '}' + "\n";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MenuItems menuItems = (MenuItems) o;
        return isVegan == menuItems.isVegan &&
                name.equals(menuItems.name) &&
                description.equals(menuItems.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, description, isVegan);
    }
}


