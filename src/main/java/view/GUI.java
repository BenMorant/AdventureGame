package view;

import app.Launcher;
import controller.AbstractController;
import observer.Observer;
import view.implementations.GameFrame;
import view.implementations.TitleScreen;

import javax.swing.*;
import javax.swing.plaf.synth.SynthLookAndFeel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;

public class GUI implements Observer {

    public static final String GAME_TITLE = "L'aventure n'attend pas";


    private JFrame gameFrame = new GameFrame(GAME_TITLE);

    private JPanel container = new JPanel();
//private JButton startButton = new JButton("start");

    private JPanel titleScreen;
    private JPanel mainPanel = new JPanel();
    private CardLayout cardLayout = new CardLayout();


    private AbstractController controller;

    public GUI(AbstractController controller) {

        initLookAndFeel();

        titleScreen = new TitleScreen(GAME_TITLE);
        this.controller = controller;
        gameFrame.setContentPane(container);
        container.setLayout(cardLayout);
//         titleScreen.add(startButton);

        mainPanel.setBackground(Color.pink);
        container.add(titleScreen, "1");
        container.add(mainPanel, "2");
        cardLayout.show(container, "1");
//        startButton.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent actionEvent) {
//                cardLayout.show(container, "2");
//            }
//        });

        gameFrame.setVisible(true);
        gameFrame.pack();

    }

public void initLookAndFeel() {
    SynthLookAndFeel synth = new SynthLookAndFeel();
    try {
        synth.load(this.getClass()
                .getResourceAsStream("/laf.xml"), this.getClass());
        UIManager.setLookAndFeel(synth);
    } catch (ParseException | UnsupportedLookAndFeelException e) {
        e.printStackTrace();
    }
}
    @Override
    public void update(String string) {

    }
}
