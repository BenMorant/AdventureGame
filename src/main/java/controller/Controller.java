package controller;

import model.Model;
import view.GUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controller {

    private GUI gui;
    private Model model;

    public Controller(GUI gui, Model model) {
        this.gui = gui;
        this.model = model;
        gui.addSceneChangeListener(new SceneChangeListener());
        gui.addChoiceListener(new ChoiceListener());
    }


    private class SceneChangeListener implements ActionListener {

        public void actionPerformed(ActionEvent actionEvent) {
            Object source = actionEvent.getSource();
            if (gui.getStartButton().equals(source)) {
                gui.getCardLayout().show(gui.getContainer(), "mainScreen");
            }
            if (gui.getNewGameButton().equals(source)) {
                gui.getCardLayout().show(gui.getContainer(), "mainScreen");
            }


        }
    }

    private class ChoiceListener implements ActionListener {

        public void actionPerformed(ActionEvent actionEvent) {
            Object action = actionEvent.getActionCommand();
//            switch (action) {
//                case "c1" : null;
//                break;
//                case "c2" : null;
//                    break;
//                case "c3" : null;
//                    break;
//                case "c4" : null;
//                    break;
//
//            }

        }
    }

}
