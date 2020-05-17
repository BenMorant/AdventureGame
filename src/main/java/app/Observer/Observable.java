package app.Observer;

import model.People;

public interface Observable {

    void addObserver(Observer obs);

    void notifyObservers(People people);

    void notifyObservers(String storyBlock);

    void notifyObservers(String choice1, String choice2, String choice3, String choice4);

}
