package model;

import observer.Observable;
import observer.Observer;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractModel implements Observable {
    private ArrayList<Observer> observers = new ArrayList<>();


    public void addObserver(Observer observer) {
        this.observers.add(observer);
    }

//    public void notifyObserver(String string) {
//        for (Observer observer : observers) {
//          observer.update(string);
//        }
//}

    public void notifyObserver(People people) {
        for (Observer observer : observers) {
            observer.update(people);
        }
    }

    public void notifyObserver(String newString) {
        for (Observer observer : observers) {
            observer.update(newString);
        }
    }

    public void notifyObserver(List<String> newStrings) {
        for (Observer observer : observers) {
            observer.update(newStrings);
        }

    }
}
