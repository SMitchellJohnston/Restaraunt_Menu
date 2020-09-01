package restaraunt;

import java.util.ArrayList;
import java.util.Date;

public class Menu {
    private ArrayList<MenuItem> listOfDishes;
    private Date lastUpdated;

    public Menu() {
        this.listOfDishes = new ArrayList<>();
        this.lastUpdated = new Date();
    }

    public String getLastUpdated() {
        return "Menu was last updated: " + this.lastUpdated;
    }
}