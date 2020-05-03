package controller;

import model.AbstractModel;
import view.GUI;

public abstract class AbstractController {

    protected AbstractModel model;
    protected GUI gui;

    public AbstractController(AbstractModel model, GUI gui) {
        this.model = model;
        this.gui = gui;
    }



    abstract void control();

}
