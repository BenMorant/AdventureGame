package view;

import model.GameOverScene;
import model.Model;
import model.People;

import java.awt.*;
import java.awt.event.ActionListener;
import java.util.Scanner;

public class GUIConsole extends GUI {

    Scanner myScanner = new Scanner(System.in);
    Scanner enterScanner = new Scanner(System.in);


    public GUIConsole(Model model) {
        super(model);
//        System.out.println(model.getTitleScene().getTitle());
//        System.out.println(((TitleScene) model.getTitleScene()).getStart());
        System.out.println(((GameOverScene) model.getGameOverScene()).getGameOverStr());
        System.out.println(((GameOverScene) model.getGameOverScene()).getNewGameStr());

    }


    @Override
    public void addSceneChangeListener(ActionListener sceneChangeListener) {

    }

    @Override
    public void addChoiceListener(ActionListener choiceListener) {

    }

    @Override
    public Object getStartButton() {
        return null;
    }

    @Override
    public CardLayout getCardLayout() {
        return null;
    }

    @Override
    public Container getContainer() {
        return null;
    }

    @Override
    public Object getNewGameButton() {
        return null;
    }

    @Override
    public void update(String str) {

    }

    @Override
    public void update(int number) {

    }

    @Override
    public void update(People people) {

    }
}
