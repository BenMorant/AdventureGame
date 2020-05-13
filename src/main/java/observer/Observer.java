package observer;

import model.People;

public interface Observer {
   void updatePeopleAttributes(People peopleToUpdate);

   void updateStoryBlock(String storyBlock);

   void updateChoices(String choice1, String choice2, String choice3, String choice4);
}
