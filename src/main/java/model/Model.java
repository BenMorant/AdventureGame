package model;

import app.Observer.Observable;
import app.Observer.Observer;

public class Model implements Observable {

    private Scene titleScene = new TitleScene();
    private Scene gameOverScene = new GameOverScene();

    private People player = new Player(13, "couteau");
    private People goblin = new Monster(20, "baton", "Le gobelin vous frappe avec son baton !");
    private boolean hasSilverRing = false;


    public Model() {


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
