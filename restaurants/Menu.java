package restaurants;

import java.awt.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Menu {

    private ArrayList<MenuItems> listOfDishes;
    private Date lastUpdated;

    public Menu() {
        this.listOfDishes = new ArrayList<>();
        this.lastUpdated = new Date(); // current date
    }

    public void add(MenuItems m){
        //add only if the list does not contain the item
        if(!listOfDishes.contains(m)) {
            listOfDishes.add(m);
            //update date every time to add or remove item
            this.lastUpdated = new Date();
        }
    }

    public void remove (MenuItem m){
        listOfDishes.remove(m);
        this.lastUpdated = new Date();
    }

    public Date getLastUpdated(){

        return lastUpdated;
    }

    @Override
    public String toString() {
        return "Menu{" +
                "listOfDishes=" + listOfDishes +
                ", lastUpdated=" + lastUpdated +
                '}';
    }
}