package model;

import app.Observer.Observable;
import app.Observer.Observer;

public class Model implements Observable {

    private People player = new Player();
    private Scene titleScene = new TitleScene(player);
    private Scene gameOverScene = new GameOverScene(player);
    private Scene mainScene = new MainScene(player);


    private People goblin = new Monster(20, "baton", "Le gobelin vous frappe avec son baton !");
    private boolean hasSilverRing = false;


    public Model() {
        initPlayer();

    }

    public void initPlayer() {
        player.setHp(13);
        player.setWeapon("couteau");
        ((Player) player).setPicture("./src/main/resources/pix/people/player/rambo.jpg");
    }

    public Scene getGameOverScene() {
        return gameOverScene;
    }

    public Scene getTitleScene() {
        return titleScene;
    }


    public People getPlayer() {
        return player;
    }

    public Scene getMainScene() {
        return mainScene;
    }

    public void setMainScene(Scene mainScene) {
        this.mainScene = mainScene;
    }

    @Override
    public void addObserver(Observer obs) {

    }

    @Override
    public void notifyObserver(String str) {

    }

    @Override
    public void notifyObservers(int number) {

    }

    @Override
    public void notifyObservers(People people) {

    }


}
