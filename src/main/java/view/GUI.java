package view;

import controller.AbstractController;
import observer.Observer;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI extends GameFrame implements Observer {

//    public static final int DEFAULT_WIDTH = 1280;
//    public static final int DEFAULT_HEIGHT = DEFAULT_WIDTH / 12 * 9;

    private JPanel container = new JPanel();
    private JButton startButton = new JButton("start");
    private JPanel titlePanel = new JPanel();
    private JPanel mainPanel = new JPanel();
    private CardLayout cardLayout = new CardLayout();



    private AbstractController controller;

    public GUI(AbstractController controller) {
//        this.setMinimumSize(new Dimension(DEFAULT_WIDTH, DEFAULT_HEIGHT));
//        this.setPreferredSize(new Dimension(DEFAULT_WIDTH, DEFAULT_HEIGHT));
//        this.setMaximumSize(new Dimension(DEFAULT_WIDTH, DEFAULT_HEIGHT));
//        this.setTitle("titre");
//        this.setResizable(false);
//        this.setLocationRelativeTo(null);
//        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        this.setLayout(null);
        this.controller = controller;
        this.setContentPane(container);
        container.setBackground(Color.black);
        container.setLayout(cardLayout);
        titlePanel.add(startButton);
        titlePanel.setBackground(Color.green);
        mainPanel.setBackground(Color.pink);
        container.add(titlePanel, "1");
        container.add(mainPanel, "2");
        cardLayout.show(container, "1");
        startButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                cardLayout.show(container, "2");
            }
        });

        setVisible(true);
        pack();

    }




    @Override
    public void update(String string) {

    }
}
