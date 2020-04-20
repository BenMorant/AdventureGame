package logic;

import model.entity.screens.TitleScreen;
import view.GUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TitleScreenController {

    private final TitleScreen titleScreen;
    private final GUI gui;
    private final GameWorld world;

    public TitleScreenController(TitleScreen titleScreen, GUI gui, GameWorld world) {
        this.titleScreen = titleScreen;
        this.gui = gui;
        this.gui.getStartButtonPanel().addStartButtonListener(new ScreenHandler(), "start");
        this.world = world;
    }

    private class ScreenHandler implements ActionListener {

        public void actionPerformed(ActionEvent actionEvent) {
            String action = actionEvent.getActionCommand();
            if (action.equals("start")) {
                gui.getVisibilityManager().showMainScreen();
                world.townGate();

            }

        }
    }


}
