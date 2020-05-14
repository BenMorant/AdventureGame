package view;

import java.awt.*;
import java.awt.event.ActionListener;

public abstract class GUI {


    public abstract void addSceneChangeListener(ActionListener sceneChangeListener);

    public abstract void addChoiceListener(ActionListener choiceListener);

    public abstract Object getStartButton();

    public abstract CardLayout getCardLayout();

    public abstract Container getContainer();

    public abstract Object getNewGameButton();
}
