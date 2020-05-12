package model;

import observer.Observable;
import observer.Observer;

import java.util.ArrayList;

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

    public void notifyPeopleHp(String newValue) {
        for (Observer observer : observers) {
            observer.updatePeopleHp(newValue);
        }
    }

    public void notifyStoryBlock(String newStoryBlock) {
        for (Observer observer : observers) {
            observer.updateStoryBlock(newStoryBlock);
        }
    }

    public void notifyChoices(String newChoice1, String newChoice2, String newChoice3, String newChoice4) {
        for (Observer observer : observers) {
            observer.updateChoices(newChoice1, newChoice2, newChoice3, newChoice4);
        }

    }
}
