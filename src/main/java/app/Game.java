package app;

import logic.GameWorld;
import logic.MainScreenController;
import logic.TitleScreenController;
import model.entity.screens.MainScreen;
import model.entity.screens.TitleScreen;
import view.GUI;

public final class Game {

    private final GUI gui = new GUI();
    private final GameWorld world = new GameWorld(gui);
    private final TitleScreenController titleScreenController;
    private final MainScreenController mainScreenController;

    private Game() {
        titleScreenController = new TitleScreenController(new TitleScreen(), gui, world);
        gui.getVisibilityManager().showTitleScreen();
        mainScreenController = new MainScreenController(new MainScreen(), gui, world);
    }

    public static void main(String[] args) {
        new Game();
    }

}
