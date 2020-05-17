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

        storyBlock = "Vous êtes aux portes de la Cité. \n Un garde se tient debout devant vous. \n Que voulez vous faire ? \n \n \n ";
        choice1 = "Parler au garde";
        choice2 = "Attaquer le garde";
        choice3 = "Partir de là ?";
        choice4 = "";
    }

    public void talkGuard() {

        storyBlock = "Garde : Bonjour, étranger. Je ne vous ai jamais vu avant. \n Désolé mais je ne peux pas laisser entrer un étranger dans notre Cité.";
        choice1 = "Parler au garde";
        choice2 = "Attaquer le garde";
        choice3 = "partir";
        choice4 = "";

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
