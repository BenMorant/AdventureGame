package app.Observer;

import model.People;

public interface Observer {
    void update(String str);

    void update(int number);

    void update(People people);

}
