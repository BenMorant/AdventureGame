package view;

import app.Observer.Observer;
import model.Model;

import java.awt.*;
import java.awt.event.ActionListener;

public abstract class GUI implements Observer {

    protected Model model;

    public GUI(Model model) {
        this.model = model;
    }


    public abstract void addSceneChangeListener(ActionListener sceneChangeListener);

    public abstract void addChoiceListener(ActionListener choiceListener);

    public abstract Object getStartButton();

    public abstract CardLayout getCardLayout();

    public abstract Container getContainer();

    public abstract Object getNewGameButton();
}
