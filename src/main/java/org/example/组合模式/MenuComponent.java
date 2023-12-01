package org.example.组合模式;

import java.util.List;

abstract class MenuComponent {//构成层叠菜单的元素
    protected String name;

    public void printName() {
        System.out.println(name);
    }

    public abstract boolean addMenuElement(MenuComponent element);

    public abstract boolean removeMenuElement(MenuComponent element);

    public abstract List<MenuComponent> getElement();

}





