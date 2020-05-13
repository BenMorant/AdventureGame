package observer;

import model.People;

import java.util.List;

public interface Observable {
    void addObserver(Observer observer);

    void notifyObserver(String newValue);

    void notifyObserver(People newValue);

    void notifyObserver(List<String> newValues);

//    void notifyPeopleAttributes(People people);
//
//    void notifyStoryBlock(String storyBlock);
//
//    void notifyChoices(String choice1, String choice2, String choice3, String choice4);
}
