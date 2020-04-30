package view;

import controller.AbstractController;
import observer.Observer;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI extends GameFrame implements Observer {

    private JPanel container = new JPanel();
    private JButton startButton = new JButton("start");
    private JPanel titlePanel = new JPanel();
    private JPanel mainPanel = new JPanel();
    private CardLayout cardLayout = new CardLayout();

    private AbstractController controller;

    public GUI(AbstractController controller) {

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
