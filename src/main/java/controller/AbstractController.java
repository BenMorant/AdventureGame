package controller;

import model.AbstractModel;

public abstract class AbstractController {

    protected AbstractModel model;

    public AbstractController(AbstractModel model) {
        this.model = model;
    }



    abstract void control();

}
