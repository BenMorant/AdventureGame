package model.entity.screens;

import model.entity.people.Hero;

import java.util.Arrays;

public abstract class MainScreen {

    protected Hero hero;
    protected String storyBlock;
    protected String mainImage;
    protected String[] choices;

    //  public MainScreen(Hero hero, String storyBlock, String mainImage, String[] choices) {
    // public MainScreen(Hero hero, String storyBlock, String mainImage, String choices) {
    public MainScreen() {
        //      this.hero = hero;
        //   this.storyBlock = storyBlock;
        this.mainImage = mainImage;
        this.choices = choices;
    }

    public String[] populateStringArray(int nbChoices, String choice1, String choice2, String choice3, String choice4) {
        choices = new String[nbChoices];
        choices[0] = choice1;
        choices[1] = choice2;
        choices[2] = choice3;
        choices[3] = choice4;
        return choices;
    }

    public void populateHeroAttributes(Hero hero) {
        hero.getHp();
        hero.getCurrentWeapon();
    }

    public Hero getHero() {
        return hero;
    }

    public void setHero(Hero hero) {
        this.hero = hero;
    }

    public String getStoryBlock() {
        return storyBlock;
    }

    public void setStoryBlock(String storyBlock) {
        this.storyBlock = storyBlock;
    }

    public String getMainImage() {
        return mainImage;
    }

    public void setMainImage(String mainImage) {
        this.mainImage = mainImage;
    }

    public String[] getChoices() {
        return choices;
    }

    public void setChoices(String[] choices) {
        this.choices = choices;
    }

    @Override
    public String toString() {
        return "MainScreen{" +
                "hero=" + hero +
                ", storyBlock='" + storyBlock + '\'' +
                ", mainImage='" + mainImage + '\'' +
                ", choices=" + Arrays.toString(choices) +
                '}';
    }
}