package model;

import observer.Observable;
import observer.Observer;

import java.util.ArrayList;

public abstract class AbstractModel implements Observable {
    private ArrayList<Observer> observers = new ArrayList<>();


    public void addObserver(Observer observer) {
        this.observers.add(observer);
    }


    public void notifyHero(People hero) {
        for (Observer observer : observers) {
            observer.updateHero(hero);
        }
    }
}
