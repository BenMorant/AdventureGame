package view;

import logic.Game;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static logic.Game.TITLE;

public class GameBoard extends JFrame implements ActionListener {

    public static final int DEFAULT_WIDTH = 1280;
    public static final int DEFAULT_HEIGHT = DEFAULT_WIDTH / 12 * 9;

    Game game;

    TitleNamePanel titleNamePanel;
    StartButtonPanel startButtonPanel;

    HeroPanel heroPanel;
    ChoiceButtonPanel choiceButtonPanel;
    MainTextPanel mainTextPanel;
    ImagePanelHeroPicture imagePanelHeroPicture;
    ImagePanelMain imagePanelMain;

    GamePanel increaseButtonPanel;
    GamePanel decreaseButtonPanel;
    GamePanel pointsPanel;
    GameButton increaseButton;
    GameButton decreaseButton;
    GameLabel pointsLabel;
    Font normalFont = new Font("Times New Roman", Font.PLAIN, 26);

    public GameBoard() {
        super(TITLE);
        setMinimumSize(new Dimension(DEFAULT_WIDTH, DEFAULT_HEIGHT));
        setPreferredSize(new Dimension(DEFAULT_WIDTH, DEFAULT_HEIGHT));
        setMaximumSize(new Dimension(DEFAULT_WIDTH, DEFAULT_HEIGHT));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setBackground(Color.black);
        setLayout(null);

        game = new Game(this);

        titleNamePanel = new TitleNamePanel();
        startButtonPanel = new StartButtonPanel();

        heroPanel = new HeroPanel(game.getHero());
        choiceButtonPanel = new ChoiceButtonPanel();
        mainTextPanel = new MainTextPanel();
        imagePanelHeroPicture = new ImagePanelHeroPicture();
        imagePanelMain = new ImagePanelMain();

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
        //      showTitleScreen();

        //   showMainScreen();


        increaseButtonPanel = new GamePanel(500, 600, 250, 120);
        increaseButton = new GameButton("INCREASE");
        increaseButton.addActionListener(this);
        increaseButtonPanel.add(increaseButton);
        add(increaseButtonPanel);
        decreaseButtonPanel = new GamePanel(500, 750, 250, 120);
        decreaseButton = new GameButton("DECREASE");
        decreaseButton.addActionListener(this);
        decreaseButtonPanel.add(decreaseButton);
        add(decreaseButtonPanel);
        pointsPanel = new GamePanel(500, 300, 250, 120);
        pointsLabel = new GameLabel("HP : " + game.getHero().getHp(), Color.white, normalFont);
        pointsPanel.add(pointsLabel);
        add(pointsPanel);

        pack();
    }

    private void showMainScreen() {
        add(heroPanel);
        add(choiceButtonPanel);
        add(mainTextPanel);
        add(imagePanelHeroPicture);
        add(imagePanelMain);
    }

    private void showTitleScreen() {
        add(titleNamePanel);
        add(startButtonPanel);
    }
}
