package observer;

public interface Observable {

    void addObserver(Observer observer);


    void notifyObserver(String string);

}
