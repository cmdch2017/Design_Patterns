package org.example.备忘录模式;

import java.util.ArrayList;
import java.util.List;

class CareTaker {
    private List<Memento> mementoList=new ArrayList<>();

    public void add(Memento state) {
        mementoList.add(state);
    }

    public Memento get(int index) {
        return mementoList.get(index);
    }

}
