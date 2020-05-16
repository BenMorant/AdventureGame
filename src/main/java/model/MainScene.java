package model;

public class MainScene extends Scene {

    private People player;
    private String storyBlock;
    private String choice;

    public MainScene(People player) {
        super(player);

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
