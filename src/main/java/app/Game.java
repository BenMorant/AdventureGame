package app;


import controller.Controller;
import model.entity.screens.Screen;
import view.GUI;

public final class Game implements Runnable {

    public static void main(String[] args) {
        new Game().run();


    }

    public static void runGame() {
        Screen screen = new Screen();
        GUI gui = new GUI(screen);
        Controller controller = new Controller(screen, gui);
    }

    @Override
    public void run() {
        runGame();
    }
}
