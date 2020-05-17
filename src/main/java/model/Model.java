package model;

import app.Observer.Observable;
import app.Observer.Observer;

import java.util.ArrayList;
import java.util.List;

public class Model implements Observable {

    private List<Observer> Observers = new ArrayList<>();

    private String position;
    private People player = new Player();
    private MainScene mainScene = new MainScene(player);

    private People goblin = new Monster(20, "baton", "Le gobelin vous frappe avec son baton !");
    private boolean hasSilverRing = false;


    public Model() {
        this.position = position;
        initPlayer(player);


    }

    public void initPlayer(People player) {
        player.setHp(13);
        player.setWeapon("couteau");
        ((Player) player).setPicture("./src/main/resources/pix/people/player/rambo.jpg");
        setPosition("townGate");

    }

    public void townGate() {
        setPosition("townGate");
        mainScene.townGate();
    }

    public void talkGuard() {
        setPosition("talkGuard");
        mainScene.talkGuard();
    }

    public void attackGuard() {
        setPosition("attackGuard");
        mainScene.attackGuard();
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

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
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
