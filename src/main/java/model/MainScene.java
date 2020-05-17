package model;

public class MainScene {

    private People player;
    private String storyBlock;
    private String choice1;
    private String choice2;
    private String choice3;
    private String choice4;

    public MainScene(People player) {
        this.player = player;
        townGate();

    }


    public void townGate() {

        storyBlock = "Yoooooo";
        choice1 = "tu veux quoi ?";
        choice2 = "bim";
    }

    public void talkGuard() {
        storyBlock = "Je parle au garde";
        choice1 = "et maintenant ?";
    }

    public void attackGuard() {
        storyBlock = "J'attaque le garde";
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

    public String getChoice1() {
        return choice1;
    }

    public void setChoice1(String choice1) {
        this.choice1 = choice1;
    }

    public String getChoice2() {
        return choice2;
    }

    public void setChoice2(String choice2) {
        this.choice2 = choice2;
    }

    public String getChoice3() {
        return choice3;
    }

    public void setChoice3(String choice3) {
        this.choice3 = choice3;
    }

    public String getChoice4() {
        return choice4;
    }

    public void setChoice4(String choice4) {
        this.choice4 = choice4;
    }
}
