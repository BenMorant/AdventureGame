package app;

import controller.AbstractController;
import controller.ControllerImpl;
import model.AbstractModel;
import model.ModelImpl;
import view.GUI;

public final class Launcher implements Runnable {

    public static void main(String[] args) {
        new Launcher().run();


    }

    public static void runGame() {


        AbstractModel model = new ModelImpl();
        AbstractController controller = new ControllerImpl(model);
        GUI gui = new GUI(controller);

        model.addObserver(gui);



    }

    @Override
    public void run() {
        runGame();
    }
}
