package ui.menu;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MenuItem{
    private final String text;
    private final Menu subMenu;
    private final String instructions;

    }

    public MenuItem(String text, String instructions, Menu subMenu){
        this.text = text;
        this.instructions = instructions;
        this.subMenu = subMenu;
    }

    public void PrintMenu(){
        System.out.println(menuItemText);
        for(MenuItem item : subItems){
            System.out.println(item);
        }
    }

    @Override
    public String toString() {
        return this.text;
    }
}