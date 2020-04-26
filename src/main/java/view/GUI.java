package view;

import controller.AbstractController;
import observer.Observer;

import javax.swing.*;
import java.awt.*;

public class GUI extends JFrame implements Observer {

    public static final int DEFAULT_WIDTH = 1280;
    public static final int DEFAULT_HEIGHT = DEFAULT_WIDTH / 12 * 9;

    private JPanel container = new JPanel();

    private AbstractController controller;

    public GUI(AbstractController controller) {
        this.setMinimumSize(new Dimension(DEFAULT_WIDTH, DEFAULT_HEIGHT));
        this.setPreferredSize(new Dimension(DEFAULT_WIDTH, DEFAULT_HEIGHT));
        this.setMaximumSize(new Dimension(DEFAULT_WIDTH, DEFAULT_HEIGHT));
        this.setTitle("titre");
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.controller = controller;
        this.setContentPane(container);
        this.getContentPane().setBackground(Color.black);
        setVisible(true);
        pack();

    }

    @Override
    public void update(String string) {

    }
}
