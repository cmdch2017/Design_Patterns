package org.example.组合模式;

import java.util.List;

/**
 * @author lst
 * @date 2023年11月28日 15:44
 */
class MenuItem extends MenuComponent {

    public MenuItem(String name) {
        this.name = name;
    }

    public boolean addMenuElement(MenuComponent element) {
        return false;
    }

    public boolean removeMenuElement(MenuComponent element) {
        return false;
    }

    public List<MenuComponent> getElement() {
        return null;
    }
}
