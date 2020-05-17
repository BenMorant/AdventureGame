package model;

public class MainScene {

    private People player;
    private String storyBlock;
    private String choice;

    public MainScene(People player) {
        this.player = player;
        townGate();

    }


    public void townGate() {

        storyBlock = "Yoooooo";
        choice = "tu veux quoi ?";
    }

    public void talkGuard() {
        storyBlock = "Je parle au garde";
        choice = "et maintenant ?";
    }

    public People getPlayer() {
        return player;
    }

    public void setPlayer(People player) {
        this.player = player;
    }

    public String getStoryBlock() {
        return storyBlock;
    }

    public void setStoryBlock(String storyBlock) {
        this.storyBlock = storyBlock;
    }

    public String getChoice() {
        return choice;
    }

    public void setChoice(String choice) {
        this.choice = choice;
    }
}
