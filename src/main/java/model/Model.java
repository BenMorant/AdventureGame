package model;


import observer.Observable;
import observer.Observer;

import java.util.ArrayList;

public class Model implements Observable {

    private People hero = new People(13, "couteau");
    private People goblin = new People(20, "baton");
    private boolean hasSilverRing = false;

    private String position;

    private ArrayList<Observer> observers = new ArrayList<>();

    public Model() {
        this.position = null;

    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }


    @Override
    public void addObserver(Observer observer) {
        this.observers.add(observer);
    }

    @Override
    public void notifyHero(People newValue) {
        for (Observer observer : observers) {
            observer.updateHero(hero);
        }
    }
}
