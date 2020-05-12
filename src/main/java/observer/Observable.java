package observer;

public interface Observable {
    void addObserver(Observer observer);

    //void notifyObserver(String newValue);
    void notifyPeopleHp(String newValue);

    void notifyStoryBlock(String storyBlock);

    void notifyChoices(String choice1, String choice2, String choice3, String choice4);
}
