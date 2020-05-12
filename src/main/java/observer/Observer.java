package observer;

public interface Observer {
   void updatePeopleHp(String newValue);

   void updateStoryBlock(String storyBlock);

   void updateChoices(String choice1, String choice2, String choice3, String choice4);
}
