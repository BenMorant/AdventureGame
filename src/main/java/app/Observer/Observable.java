package app.Observer;

import model.People;

public interface Observable {

    void addObserver(Observer obs);

    void notifyObserver(String str);

    void notifyObservers(int number);

    void notifyObservers(People people);

}
