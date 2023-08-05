package ui.menu;

import java.util.ArrayList;
import java.util.List;

public class Menu {
    private final String menuTitle = "Prediction System";
    private final String menuSubTitle = "Please choose an option:";
    private List<MenuItem> menuItems;
    public Menu(List<MenuItem> menuItems){
        this.menuItems = menuItems;
    }

    @override
    public String toString(){
        result = menuTitle + "\n" + menuSubTitle + "\n";
        for(int i = 0; i < menuItems.size(); i++){
            result += (i + 1) + ". " + menuItems.get(i).toString() + "\n";
        }
        return result;
    }
}