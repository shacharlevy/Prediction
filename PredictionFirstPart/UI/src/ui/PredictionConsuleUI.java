package ui;

import java.util.ArrayList;
import java.util.List;

import ui.menu.Menu;
import ui.menu.MenuItem;

public class PredictionConsuleUI {

    private final Menu mainMenu;
    private String currentLoadedPathString;
    public PredictionConsuleUI(){
        this.currentLoadedPathString = "no path loaded";
        List<MenuItem> menuItems = new ArrayList<>();
        menuItems.add(new MenuItem ("Load System info from XML", null, "Please enter the full path to the XML file:"));
        menuItems.add(new MenuItem ("Show Simulation info", null, null));
        menuItems.add(new MenuItem ("Activate Simulation", null, null));
        menuItems.add(new MenuItem ("Show Full Past Simulation info", null, null));
        menuItems.add(new MenuItem ("Exit", null, null));
        mainMenu = new Menu(menuItems);
    }

    public void Run(){
        system.out.println(mainMenu.toString());

    }


}