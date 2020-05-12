package model;

import java.util.ArrayList;
import java.util.List;

public class Model extends AbstractModel {

    private People people;
    private StoryBlock storyBlock;
    private String position;
    private List<String> choices = new ArrayList<>();

    public Model() {

    }

    public void townGate() {
        position = "townGate";
        people.startHp();
        storyBlock.setText("Bienvenue dans notre monde");
        choices.add("ohoho");
        choices.add("haha");
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public List<String> getChoices() {
        return choices;
    }

    public void setChoices(List<String> choices) {
        this.choices = choices;
    }

    public People getPeople() {
        return people;
    }

    public void setPeople(People people) {
        this.people = people;
    }

    public StoryBlock getStoryBlock() {
        return storyBlock;
    }

    public void setStoryBlock(StoryBlock storyBlock) {
        this.storyBlock = storyBlock;
    }
}
