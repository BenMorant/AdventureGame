package app;

import controller.Controller;
import model.Model;
import view.GUI;

import javax.swing.*;


public final class Launcher {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                runGame();
            }
        });


    }

    private static void runGame() {



        Model model = new Model();
        GUI gui = new GUI(model);
    Controller controller = new Controller(gui, model);
        model.addObserver(gui);



    }



}
