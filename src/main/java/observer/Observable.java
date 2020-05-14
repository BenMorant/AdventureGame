package observer;

import model.People;

public interface Observable {
    void addObserver(Observer observer);



    void notifyHero(People newValue);

}
