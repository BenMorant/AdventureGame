package app;

import controller.Controller;
import javax.swing.SwingUtilities;
import model.Story;
import view.GUI;


public final class Launcher {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> runGame());


    }

    private static void runGame() {

        Story story = new Story();
        GUI gui = new GUI(story);
        Controller controller = new Controller(gui, story);
        story.addObserver(gui);


    }


}
