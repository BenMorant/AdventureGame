package app;

import controller.AbstractController;
import controller.ControllerImpl;
import model.AbstractModel;
import model.ModelImpl;
import view.GUI;

import javax.swing.*;


public final class Launcher {

    public static void main(String[] args) {
SwingUtilities.invokeLater(() -> runGame());

    }

    private static void runGame() {



        AbstractModel model = new ModelImpl();
        GUI gui = new GUI(model);
        AbstractController controller = new ControllerImpl(model, gui);
        //model.addObserver(gui);



    }



}
