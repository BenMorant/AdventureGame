package model.entity.screens;

import model.entity.AbstractModel;

public class Screen extends AbstractModel {

    private TitleScreen titleScreen;
    private MainScreen mainScreen;

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
