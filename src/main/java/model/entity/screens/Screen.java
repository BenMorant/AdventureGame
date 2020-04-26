package model.entity.screens;

import observer.Observable;
import observer.Observer;

import java.util.ArrayList;

public class Screen implements Observable {

    private TitleScreen titleScreen;
    private MainScreen mainScreen;
    private final ArrayList<Observer> listObserver = new ArrayList<Observer>();

    public Screen() {
        addAllScreens();
    }

    public void addAllScreens() {
        titleScreen = new TitleScreen();
        mainScreen = new MainScreen();


    }

    public TitleScreen getTitleScreen() {
        return titleScreen;
    }

    public void setTitleScreen(TitleScreen titleScreen) {
        this.titleScreen = titleScreen;
    }

    public MainScreen getMainScreen() {
        return mainScreen;
    }

    public void setMainScreen(MainScreen mainScreen) {
        this.mainScreen = mainScreen;
    }

    @Override
    public void addObserver(Observer observer) {
        this.listObserver.add(observer);
    }

    @Override
    public void notifyObserver(String string) {
        for (Observer observer : listObserver)
            observer.update(string);

    }

//
//    String property = "initial";
//    // contain a support object instead of extending the support class
//    PropertyChangeSupport propertyChangeSupport = new PropertyChangeSupport(this);
//
//    public void addObserver(PropertyChangeListener propertyChangeListener) {
//        propertyChangeSupport.addPropertyChangeListener("theProperty", propertyChangeListener);
//    }
//
//    public void setProperty(String val) {
//        String old = property;
//        property = val;
//        propertyChangeSupport.firePropertyChange("theProperty", old, val);
//    }
//
//    public String toString() {
//        return "The subject object";
//    }

}
