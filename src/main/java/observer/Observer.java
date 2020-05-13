package observer;

import model.People;

import java.util.List;

public interface Observer {
   //   void updatePeopleAttributes(People peopleToUpdate);
//
//   void updateStoryBlock(String storyBlock);
//
//   void updateChoices(String choice1, String choice2, String choice3, String choice4);
   void update(People people);

   void update(String string);

   void update(List<String> strings);
}
