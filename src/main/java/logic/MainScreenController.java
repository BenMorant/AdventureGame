package logic;

import model.entity.screens.Screen;
import view.GUI;

public class MainScreenController {

    private final Screen screen;
    private final GUI gui;
    // private final GameWorld world;

    //    public MainScreenController(MainScreen mainScreen, GUI gui, GameWorld world) {
    public MainScreenController(Screen screen, GUI gui) {
        this.screen = screen;
        this.gui = gui;
        gui.updateMainTextArea(screen.getMainScreen().getStoryBlock());
        gui.updateChoiceButtons(screen.getMainScreen().getChoices());
        //  this.gui.getChoiceButtonPanel().addChoiceButtonListener(new ChoiceHandler());
        // this.world = world;
    }

//    private class ChoiceHandler implements ActionListener {
//
//        public void actionPerformed(ActionEvent actionEvent) {
//            String choice = actionEvent.getActionCommand();
//            switch (world.getHeroPosition()) {
//                case "townGate":
//                    switch (choice) {
//                        case "c1":
//                            if (!world.playerHasSilverRing()) {
//                                world.talkToGuard();
//                            }
//                            break;
//                        case "c2":
//                            world.attackGuard();
//                            break;
//                        case "c3":
//                            world.crossRoad();
//                            break;
//                    }
//                    break;
//
//                case "playerTalkedToGuard":
//                    switch (choice) {
//                        case "c1":
//                            world.townGate();
//                            break;
//                    }
//                    break;
//
//                case "playerAttackedGuard":
//                    switch (choice) {
//                        case "c1":
//                            if (world.playerIsAlive()) {
//                                world.townGate();
//                            }
//                            break;
//                    }
//                    break;
//
//                case "crossRoad":
//                    switch (choice) {
//                        case "c1":
//                            world.north();
//                            break;
//                        case "c2":
//                            world.east();
//                            break;
//                        case "c3":
//                            world.townGate();
//                            break;
//                        case "c4":
//                            world.west();
//                            break;
//                    }
//                    break;
//
//                case "north":
//                    switch (choice) {
//                        case "c1":
//                            world.crossRoad();
//                            break;
//                    }
//                    break;
//
//                case "east":
//                    switch (choice) {
//                        case "c1":
//                            world.crossRoad();
//                            break;
//                    }
//                    break;
//
//                case "west":
//                    if (world.goblinIsAlive()) {
//                        switch (choice) {
//                            case "c1":
//                                world.fightGoblin();
//                                break;
//                            case "c2":
//                                world.crossRoad();
//                                break;
//                        }
//                    } else {
//                        switch (choice) {
//                            case "c1":
//                                world.crossRoad();
//                                break;
//                        }
//                    }
//                    break;
//
//                case "goblinBattle":
//                    switch (choice) {
//                        case "c1":
//                            world.attackGoblin();
//                            break;
//                        case "c2":
//                            world.crossRoad();
//                            break;
//                    }
//                    break;
//
//                case "playerAttackedGoblin":
//                    switch (choice) {
//                        case "c1":
//                            if (world.goblinIsAlive()) {
//                                world.goblinAttacks();
//                            }
//                            break;
//                    }
//                    break;
//
//                case "goblinAttackedPlayer":
//                    switch (choice) {
//                        case "c1":
//                            if (world.playerIsAlive()) {
//                                world.fightGoblin();
//                            }
//                            break;
//                    }
//                    break;
//
//                case "playedKilledGoblin":
//                    switch (choice) {
//                        case "c1":
//                            world.crossRoad();
//                            break;
//                    }
//                    break;
//            }
//        }
//
//    }


}
