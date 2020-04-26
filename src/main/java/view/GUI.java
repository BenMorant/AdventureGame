package view;

import controller.AbstractController;
import observer.Observer;

import javax.swing.*;

public class GUI extends JFrame implements Observer {

    private AbstractController controller;

    public GUI(AbstractController controller) {
        this.controller = controller;

    }

    @Override
    public void update(String string) {

    }
}
