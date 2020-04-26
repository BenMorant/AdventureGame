package model;

import observer.Observable;
import observer.Observer;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractModel implements Observable {

    private List<Observer> observers = new ArrayList<>();

    @Override
    public void addObserver(Observer observer) {
        this.observers.add(observer);

    }

    @Override
    public void notifyObserver(String string) {
        for(Observer observer : observers)
        observer.update(string);

    }
}
