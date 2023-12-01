package org.example.组合模式;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lst
 * @date 2023年11月28日 15:42
 */
class Menu extends MenuComponent {
    private List<MenuComponent> elementList;

    public Menu(String name) {
        this.name = name;
        this.elementList = new ArrayList<>();
    }

    public boolean addMenuElement(MenuComponent element) {
        return elementList.add(element);
    }

    public boolean removeMenuElement(MenuComponent element) {
        return elementList.remove(element);
    }

    public List<MenuComponent> getElement() {
        return elementList;
    }

}
