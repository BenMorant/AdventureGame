package app.Observer;

import model.People;

public interface Observer {

    void updatePeople(People people);

    void updateMainText(String newStoryBlock);

    void updateChoices(String newChoice1, String newChoice2, String newChoice3, String newChoice4);
}
