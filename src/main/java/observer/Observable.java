package observer;

import model.People;

public interface Observable {
    void addObserver(Observer observer);

    //void notifyObserver(String newValue);
    void notifyPeopleAttributes(People people);

    void notifyStoryBlock(String storyBlock);

    void notifyChoices(String choice1, String choice2, String choice3, String choice4);
}
