package view;

import logic.Game;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static logic.Game.TITLE;

public class GameBoard extends JFrame implements ActionListener {


    Game game;


    MasterPanel titlePanel;
    TitleNamePanel titleNamePanel;


    MasterPanel mainPanel;
    GamePanel increaseButtonPanel;
    GamePanel decreaseButtonPanel;
    GamePanel pointsPanel;
    GameButton increaseButton;
    GameButton decreaseButton;
    GameLabel pointsLabel;
    Font normalFont = new Font("Times New Roman", Font.PLAIN, 26);
    HeroPanel heroPanel;





    public GameBoard() {
        super(TITLE);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        mainPanel = new MasterPanel();
        //   setContentPane(mainPanel);
        titlePanel = new MasterPanel();
        setContentPane(titlePanel);
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
                game.increaseHP();
                break;
            case "DECREASE" :
                game.decreaseHP();
                break;
        }
        updateScreen();
    }

    private void updateScreen() {
        pointsLabel.setText("HP : " + game.getHero().getHp());
    }


    private void buildGameBoard() {
        titleNamePanel = new TitleNamePanel();
        titlePanel.add(titleNamePanel);


        heroPanel = new HeroPanel();
        mainPanel.add(heroPanel);
        increaseButtonPanel = new GamePanel(500, 600, 250, 120);
        increaseButton = new GameButton("INCREASE");
        increaseButton.addActionListener(this);
        increaseButtonPanel.add(increaseButton);
        mainPanel.add(increaseButtonPanel);
        decreaseButtonPanel = new GamePanel(500, 750, 250, 120);
        decreaseButton = new GameButton("DECREASE");
        decreaseButton.addActionListener(this);
        decreaseButtonPanel.add(decreaseButton);
        mainPanel.add(decreaseButtonPanel);
        pointsPanel = new GamePanel(500, 300, 250, 120);
        pointsLabel = new GameLabel("HP : " + game.getHero().getHp(), Color.white, normalFont);
        pointsPanel.add(pointsLabel);
        mainPanel.add(pointsPanel);

        pack();
    }
}
