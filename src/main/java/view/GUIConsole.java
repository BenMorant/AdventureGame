package view;

import model.Model;

import java.awt.*;
import java.awt.event.ActionListener;

public class GUIConsole extends GUI {

    private Model model;

    public GUIConsole(Model model) {
        this.model = model;
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
}
