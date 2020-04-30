package view;

import controller.AbstractController;
import observer.Observer;
import view.implementations.GameFrame;
import view.implementations.TitleScreen;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI implements Observer {

    public static final String GAME_TITLE = "L'aventure n'attend pas";

    private JFrame gameFrame = new GameFrame(GAME_TITLE);

    private JPanel container = new JPanel();
 //   private JButton startButton = new JButton("start");
 //   private JPanel titlePanel = new JPanel();
    private JPanel titleScreen;
    private JPanel mainPanel = new JPanel();
    private CardLayout cardLayout = new CardLayout();

    private AbstractController controller;

    public GUI(AbstractController controller) {

        titleScreen = new TitleScreen(GAME_TITLE);

        this.controller = controller;
        gameFrame.setContentPane(container);
        container.setBackground(Color.black);
        container.setLayout(cardLayout);
    //    titlePanel.add(startButton);
        titleScreen.setBackground(Color.green);
        mainPanel.setBackground(Color.pink);
        container.add(titleScreen, "1");
        container.add(mainPanel, "2");
        cardLayout.show(container, "1");
//        titleScreen.getStartButton.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent actionEvent) {
//                cardLayout.show(container, "2");
//            }
//        });

        gameFrame.setVisible(true);
        gameFrame.pack();

    }




    @Override
    public void update(String string) {

    }
}
