package model.entity.screens;

import model.entity.people.Hero;

import java.util.ArrayList;
import java.util.List;

public class MainScreen {

    private Hero hero;
    private String mainText;
    private List<String> choices = new ArrayList<>();
    private String mainImage;

    public MainScreen(Hero hero, String mainText, List<String> choices, String mainImage) {
        this.hero = hero;
        this.mainText = mainText;
        this.choices = choices;
        this.mainImage = mainImage;
    }

    public Hero getHero() {
        return hero;
    }

    public void setHero(Hero hero) {
        this.hero = hero;
    }

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

    public String getMainImage() {
        return mainImage;
    }

    public void setMainImage(String mainImage) {
        this.mainImage = mainImage;
    }
}
