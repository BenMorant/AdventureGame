package app;

//public final class Game {
//
//    private final GUI gui = new GUI();
//    private final GameWorld world = new GameWorld(gui);
//    private final TitleScreenController titleScreenController;
//    private final MainScreenController mainScreenController;
//
//    private Game() {
//        titleScreenController = new TitleScreenController(new TitleScreen(), gui, world);
//        gui.getVisibilityManager().showTitleScreen();
//        mainScreenController = new MainScreenController(new MainScreen(), gui, world);
//    }
//
//    public static void main(String[] args) {
//        new Game();
//    }
//
//}

import logic.MainScreenController;
import logic.TitleScreenController;
import model.entity.screens.MainScreen;
import model.entity.screens.TitleScreen;
import view.GUI;

public final class Game implements Runnable {

//    private final GUI gui = new GUI();
//    private final GameWorld world = new GameWorld(gui);
//    private final TitleScreenController titleScreenController;
//    private final MainScreenController mainScreenController;
//
//    private Game() {
//        titleScreenController = new TitleScreenController(new TitleScreen(), gui, world);
//        gui.getVisibilityManager().showTitleScreen();
//        mainScreenController = new MainScreenController(new MainScreen(), gui, world);
//    }

    public static void main(String[] args) {
        new Game().run();


    }

    public static void runGame() {
        TitleScreen titleScreen = new TitleScreen();
        MainScreen mainScreen = new MainScreen();
        GUI gui = new GUI(titleScreen, mainScreen);
        TitleScreenController titleScreenController = new TitleScreenController(titleScreen, gui);
        MainScreenController mainScreenController = new MainScreenController(mainScreen, gui);
    }

    @Override
    public void run() {
        runGame();
    }
}
