package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import model.Story;
import view.GUI;

public class Controller {

    private GUI gui;
    private Story story;

    public Controller(GUI gui, Story story) {
        this.gui = gui;
        this.story = story;
        gui.addSceneChangeListener(new SceneChangeListener());
        gui.addChoiceListener(new ChoiceListener());

        gui.updatePeople(story.getPlayer());
        gui.updateChoices(story.getMainScene().getChoice1(), story.getMainScene().getChoice2(),
            story.getMainScene().getChoice3(), story.getMainScene().getChoice4());
        gui.updateMainText(story.getMainScene().getStoryBlock());


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
            String choice = actionEvent.getActionCommand();

            switch (story.getPosition()) {
                case "townGate":
                    switch (choice) {
                        case "c1":
                            story.talkGuard();
                            gui.updateChoices(story.getMainScene().getChoice1(),
                                story.getMainScene().getChoice2(),
                                story.getMainScene().getChoice3(),
                                story.getMainScene().getChoice4());
                            gui.updateMainText(story.getMainScene().getStoryBlock());
                            break;
                        case "c2":
                            story.attackGuard();
                            gui.updateChoices(story.getMainScene().getChoice1(),
                                story.getMainScene().getChoice2(),
                                story.getMainScene().getChoice3(),
                                story.getMainScene().getChoice4());
                            gui.updateMainText(story.getMainScene().getStoryBlock());
                            break;

//                            if (!model.playerHasSilverRing()) {
//                                model.talkToGuard();
//                            }
//                            break;
//                        case "c2":
//                            model.attackGuard();
//                            break;
//                        case "c3":
//                            model.crossRoad();
//                            break;
//                    }
//                    break;
//
//                case "playerTalkedToGuard":
//                    switch (choice) {
//                        case "c1":
//                            model.townGate();
//                            break;
//                    }
//                    break;
//
//                case "playerAttackedGuard":
//                    switch (choice) {
//                        case "c1":
//                            if (model.playerIsAlive()) {
//                                model.townGate();
//                            }
//                            break;
//                    }
//                    break;
//
//                case "crossRoad":
//                    switch (choice) {
//                        case "c1":
//                            model.north();
//                            break;
//                        case "c2":
//                            model.east();
//                            break;
//                        case "c3":
//                            model.townGate();
//                            break;
//                        case "c4":
//                            model.west();
//                            break;
//                    }
//                    break;
//
//                case "north":
//                    switch (choice) {
//                        case "c1":
//                            model.crossRoad();
//                            break;
//                    }
//                    break;
//
//                case "east":
//                    switch (choice) {
//                        case "c1":
//                            model.crossRoad();
//                            break;
//                    }
//                    break;
//
//                case "west":
//                    if (model.goblinIsAlive()) {
//                        switch (choice) {
//                            case "c1":
//                                model.fightGoblin();
//                                break;
//                            case "c2":
//                                model.crossRoad();
//                                break;
//                        }
//                    } else {
//                        switch (choice) {
//                            case "c1":
//                                model.crossRoad();
//                                break;
//                        }
//                    }
//                    break;
//
//                case "goblinBattle":
//                    switch (choice) {
//                        case "c1":
//                            model.attackGoblin();
//                            break;
//                        case "c2":
//                            model.crossRoad();
//                            break;
//                    }
//                    break;
//
//                case "playerAttackedGoblin":
//                    switch (choice) {
//                        case "c1":
//                            if (model.goblinIsAlive()) {
//                                model.goblinAttacks();
//                            }
//                            break;
//                    }
//                    break;
//
//                case "goblinAttackedPlayer":
//                    switch (choice) {
//                        case "c1":
//                            if (model.playerIsAlive()) {
//                                model.fightGoblin();
//                            }
//                            break;
//                    }
//                    break;
//
//                case "playedKilledGoblin":
//                    switch (choice) {
//                        case "c1":
//                            model.crossRoad();
//                            break;
//                    }
//                    break;
                    }
            }

        }
    }

}
