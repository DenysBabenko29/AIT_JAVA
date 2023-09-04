package ait.todo_appl.model;

import java.util.Arrays;

public enum Menu {
    LIST(1), ADD(2), GET(3), REMOVE(4), EXIT(5);

    private final int menuItem;

    Menu(int menuItem) {
        this.menuItem = menuItem;
    }

    public int getMenuItem() {
        return menuItem;
    }

    public static void printMenu(){
        Menu[] menu = Menu.values();
        Arrays.stream(menu).forEach(x -> System.out.print(x.menuItem + " - " + x + "|"));
    }
}
