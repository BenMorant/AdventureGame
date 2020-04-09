package view;

import logic.Game;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static logic.Game.TITLE;

public class GameBoard extends JFrame implements ActionListener {



    Game game;

    MasterPanel masterPanel;

    GamePanel increaseButtonPanel;
    GamePanel decreaseButtonPanel;
    GamePanel pointsPanel;
    GameButton increaseButton;
    GameButton decreaseButton;
    GameLabel pointsLabel;
    Font normalFont = new Font("Times New Roman", Font.PLAIN, 26);





    public GameBoard() {
        super(TITLE);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

       masterPanel = new MasterPanel();
        setContentPane(masterPanel);
        setLayout(null);

        game = new Game(this);

        createGameBoard();
    }

    public void createGameBoard() {

        buildGameBoard();
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        String action = actionEvent.getActionCommand();
        switch (action) {
            case "INCREASE" :
                game.increasePoints();
                break;
            case "DECREASE" :
                game.decreasePoints();
                break;
        }
        updateScreen();
    }

    private void updateScreen() {
        pointsLabel.setText("Points : "+game.getPoints());
    }


    private void buildGameBoard() {
        increaseButtonPanel = new GamePanel(500, 600, 250, 120);
        increaseButton = new GameButton("INCREASE");
        increaseButton.addActionListener(this);
        increaseButtonPanel.add(increaseButton);
        masterPanel.add(increaseButtonPanel);
        decreaseButtonPanel = new GamePanel(500, 750, 250, 120);
        decreaseButton = new GameButton("DECREASE");
        decreaseButton.addActionListener(this);
        decreaseButtonPanel.add(decreaseButton);
        masterPanel.add(decreaseButtonPanel);
        pointsPanel = new GamePanel(500, 300, 250, 120);
        pointsLabel = new GameLabel("Points : ", Color.white, normalFont);
        pointsPanel.add(pointsLabel);
        masterPanel.add(pointsPanel);

        pack();
    }
}
