package app;

import controller.Controller;
import model.Model;
import view.GUI;
import view.GUIGraphic;

import javax.swing.*;


public final class Launcher {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> runGame());


    }

    private static void runGame() {


        Model model = new Model();
        GUI gui = new GUIGraphic(model);
//GUI gui = new GUIConsole(model);
        Controller controller = new Controller(gui, model);
        model.addObserver(gui);


    }



}
