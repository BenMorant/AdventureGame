package app;

import logic.GameWorld;
import view.GUI;
import view.VisibilityManager;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public final class Game {

    private final GUI gui = new GUI(new ChoiceHandler());
    private final VisibilityManager visibilityManager = new VisibilityManager(gui);
    private final GameWorld world = new GameWorld(gui);

    private Game() {
//        gui.showTitleScreen();
        visibilityManager.showTitleScreen();
    }

    public static void main(String[] args) {
        new Game();
    }

    private class ChoiceHandler implements ActionListener {

        public void actionPerformed(ActionEvent actionEvent) {
            String choice = actionEvent.getActionCommand();
            if (choice.equals("start")) {
//                gui.showMainScreen();
                visibilityManager.showMainScreen();
                world.startGame();
            }

            switch (world.getHeroPosition()) {
                case "townGate":
                    switch (choice) {
                        case "c1":
                            if (!world.playerHasSilverRing()) {
                                world.talkToGuard();
                            }
                            break;
                        case "c2":
                            world.attackGuard();
                            break;
                        case "c3":
                            world.crossRoad();
                            break;
                    }
                    break;

                case "playerTalkedToGuard":
                    switch (choice) {
                        case "c1":
                            world.townGate();
                            break;
                    }
                    break;

                case "playerAttackedGuard":
                    switch (choice) {
                        case "c1":
                            if (world.playerIsAlive()) {
                                world.townGate();
                            }
                            break;
                    }
                    break;

                case "crossRoad":
                    switch (choice) {
                        case "c1":
                            world.north();
                            break;
                        case "c2":
                            world.east();
                            break;
                        case "c3":
                            world.townGate();
                            break;
                        case "c4":
                            world.west();
                            break;
                    }
                    break;

                case "north":
                    switch (choice) {
                        case "c1":
                            world.crossRoad();
                            break;
                    }
                    break;

                case "east":
                    switch (choice) {
                        case "c1":
                            world.crossRoad();
                            break;
                    }
                    break;

                case "west":
                    if (world.goblinIsAlive()) {
                        switch (choice) {
                            case "c1":
                                world.fightGoblin();
                                break;
                            case "c2":
                                world.crossRoad();
                                break;
                        }
                    } else {
                        switch (choice) {
                            case "c1":
                                world.crossRoad();
                                break;
                        }
                    }
                    break;

                case "goblinBattle":
                    switch (choice) {
                        case "c1":
                            world.attackGoblin();
                            break;
                        case "c2":
                            world.crossRoad();
                            break;
                    }
                    break;

                case "playerAttackedGoblin":
                    switch (choice) {
                        case "c1":
                            if (world.goblinIsAlive()) {
                                world.goblinAttacks();
                            }
                            break;
                    }
                    break;

                case "goblinAttackedPlayer":
                    switch (choice) {
                        case "c1":
                            if (world.playerIsAlive()) {
                                world.fightGoblin();
                            }
                            break;
                    }
                    break;

                case "playedKilledGoblin":
                    switch (choice) {
                        case "c1":
                            world.crossRoad();
                            break;
                    }
                    break;
            }
        }

    }

}
