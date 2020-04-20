package model.entity.screens;

import java.util.ArrayList;
import java.util.List;

public class MainScreen {

    //   private Hero hero;
    private String mainText;
    private List<String> choices = new ArrayList<>();
    // private String mainImage;

    //  public MainScreen(Hero hero, String mainText, String choice1, String choice2, String choice3, String choice4, String mainImage) {
    public MainScreen(String mainText, String choice1, String choice2, String choice3, String choice4) {
        // this.hero = hero;
        this.mainText = mainText;
        addChoices(choice1, choice2, choice3, choice4);
        //    this.mainImage = mainImage;
    }

    public void addChoices(String choice1, String choice2, String choice3, String choice4) {
        choices.add(choice1);
        choices.add(choice2);
        choices.add(choice3);
        choices.add(choice4);

    }

//    public Hero getHero() {
//        return hero;
//    }
//
//    public void setHero(Hero hero) {
//        this.hero = hero;
//    }

    public String getMainText() {
        return mainText;
    }

    public void setMainText(String mainText) {
        this.mainText = mainText;
    }

    public List<String> getChoices() {
        return choices;
    }

    public void setChoices(List<String> choices) {
        this.choices = choices;
    }

//    public String getMainImage() {
//        return mainImage;
//    }
//
//    public void setMainImage(String mainImage) {
//        this.mainImage = mainImage;
//    }
}
