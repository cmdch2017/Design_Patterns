package org.example.组合模式;

import java.util.List;

/**
 * @author lst
 * @date 2023年11月28日 15:45
 */
class CompositeTest {
    public static void main(String[] args) {
        MenuComponent mainMenu = new Menu("Insert");
        MenuComponent subMenu = new Menu("Chart");
        MenuComponent element = new MenuItem("On This Sheet");
        mainMenu.addMenuElement(subMenu);
        subMenu.addMenuElement(element);
        printMenus(mainMenu);
    }

    private static void printMenus(MenuComponent ifile) {
        ifile.printName();
        List<MenuComponent> children = ifile.getElement();

        if (children == null) {
            return;
        }
        for (MenuComponent element : children) {
            printMenus(element);
        }
    }
}
