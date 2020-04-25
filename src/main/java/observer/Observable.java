package observer;

public interface Observable {
    void addObserver(Observer observer);

    void removeObserver();

    void notifyObserver(String string);

   // void notifyObserver(int number);
}
