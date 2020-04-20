package logic;

import model.entity.screens.MainScreen;
import view.GUI;

public class MainScreenController {

    private final MainScreen mainScreen;
    private final GUI gui;
    private final GameWorld world;

    public MainScreenController(MainScreen mainScreen, GUI gui, GameWorld world) {
        this.mainScreen = mainScreen;
        this.gui = gui;
        // this.gui.getStartButtonPanel().addStartButtonListener(new Controller.ScreenHandler(), "start");
        this.world = world;
    }
}
