package controller;

import model.Model;
import view.GUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controller {

    private GUI gui;
    private Model model;

    public Controller(GUI gui, Model model) {
        this.gui = gui;
        this.model = model;

    }

}
