package logic;

import model.entity.screens.Screen;
import view.GUI;

public class Controller {
    private final Screen screen;
    private final GUI gui;
    private TitleScreenController titleScreenController;
    private MainScreenController mainScreenController;

    public Controller(Screen screen, GUI gui) {
        this.screen = screen;
        this.gui = gui;
        addAllControllers();
    }

    public void addAllControllers() {
        titleScreenController = new TitleScreenController(screen, gui);
        mainScreenController = new MainScreenController(screen, gui);
    }

}
