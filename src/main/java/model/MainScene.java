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
        storyBlock = "Hey ! Ne soyez pas stupide ! \n Le garde vous attaque à son tour et vous frappe fort. \n Vous recevez 3 points de dommage.";
        choice1 = ">";
        choice2 = "";
        choice3 = "";
        choice4 = "";
    }

    public void crossRoad() {
        storyBlock = "Vous êtes à un carrefour. \n Si vous allez au Sud, vous retournez aux portes de la Cité";
        choice1 = "aller au Nord";
        choice2 = "allez à l'Est";
        choice3 = "aller à l'Ouest";
        choice4 = "aller au Sud";
    }

    public void north() {
        storyBlock = "Il y a une rivière. \n Vous buvez l'eau et vous vous reposez sur la rive. \n Vous retrouvez 2 points de vie";
        choice1 = "aller au Sud";
        choice2 = "";
        choice3 = "";
        choice4 = "";
    }

    public void east() {
        storyBlock = "Vous marchez dans la forêt et trouvez une Longue Epée ! \n\n (Vous obtenez une Longue Epée)";
        choice1 = "aller à l'Ouest";
        choice2 = "";
        choice3 = "";
        choice4 = "";
    }

    public void west() {
        storyBlock = "Vous tombez nez à nez sur un Gobelin !";
        
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
