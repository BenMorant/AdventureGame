package model;

import app.Observer.Observable;
import app.Observer.Observer;

import java.util.ArrayList;
import java.util.List;

public class Model implements Observable {

    private List<Observer> Observers = new ArrayList<>();

    private People player = new Player();
    private MainScene mainScene = new MainScene(player);

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
        mainScene.townGate();
    }

    public void talkGuard() {
        ((Player) player).movePosition("talkGuard");
        mainScene.talkGuard();
    }


    public People getPlayer() {
        return player;
    }

    public MainScene getMainScene() {
        return mainScene;
    }

    public void setMainScene(MainScene mainScene) {
        this.mainScene = mainScene;
    }

    @Override
    public void addObserver(Observer obs) {
        this.Observers.add(obs);

    }


    @Override
    public void notifyObservers(People people) {
        for (Observer obs : Observers) {
            obs.updatePeople(people);
        }

    }

    @Override
    public void notifyObservers(String storyBlock) {
        for (Observer obs : Observers) {
            obs.updateMainText(storyBlock);
        }
    }

    @Override
    public void notifyObservers(String choice1, String choice2, String choice3, String choice4) {
        for (Observer obs : Observers) {
            obs.updateChoices(choice1, choice2, choice3, choice4);
        }

    }


}
