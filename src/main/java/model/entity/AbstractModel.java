package model.entity;

import observer.Observable;
import observer.Observer;

import java.util.ArrayList;

public abstract class AbstractModel implements Observable {

    private ArrayList<Observer> listObservers = new ArrayList<Observer>();

    public void addObserver(Observer observer) {
        this.listObservers.add(observer);
    }

    public void notifyObserver(String string) {
        for (Observer observer : listObservers) {
            observer.update(string);
        }
    }

    public void notifyObserver(int number) {
        for (Observer observer : listObservers) {
            observer.update(number);
        }
    }

    public void removeObserver() {
        listObservers = new ArrayList<Observer>();
    }
}
