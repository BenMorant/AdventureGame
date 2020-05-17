package model;

import app.Observer.Observable;
import app.Observer.Observer;

import java.util.ArrayList;
import java.util.List;

public class Model implements Observable {

    private List<Observer> Observers = new ArrayList<>();

    private People player = new Player();
    private Scene mainScene = new MainScene(player);

    private People goblin = new Monster(20, "baton", "Le gobelin vous frappe avec son baton !");
    private boolean hasSilverRing = false;


    public Model() {
        initPlayer(player);

    }

    public void initPlayer(People player) {
        player.setHp(13);
        player.setWeapon("couteau");
        ((Player) player).setPicture("./src/main/resources/pix/people/player/rambo.jpg");
        ((Player) player).movePosition("townGate");

    }

    public void townGate() {
        ((Player) player).movePosition("townGate");
        ((MainScene) mainScene).townGate();
    }

    public void talkGuard() {
        ((Player) player).movePosition("talkGuard");
        ((MainScene) mainScene).talkGuard();
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
        this.Observers.add(obs);

    }

    @Override
    public void notifyObserver(String str) {
        for (Observer obs : Observers)
            obs.update(str);

    }

    @Override
    public void notifyObservers(int number) {
        for (Observer obs : Observers)
            obs.update(number);

    }

    @Override
    public void notifyObservers(People people) {
        for (Observer obs : Observers)
            obs.update(people);

    }


}
