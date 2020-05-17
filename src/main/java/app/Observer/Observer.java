package app.Observer;

import model.People;

public interface Observer {
    void update(String str);

    void update(int number);

    void update(People people);

    void updateMainText(String newMainText);

    void updateChoices(String newChoice1, String newChoice2, String newChoice3, String newChoice4);
}
