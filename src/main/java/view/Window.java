package view;

import javax.swing.*;
import java.awt.*;

import static logic.Game.TITLE;

public class Window extends JFrame {

    public static final int DEFAULT_WIDTH = 1280;
    public static final int DEFAULT_HEIGHT = DEFAULT_WIDTH / 12 * 9;

//    TitleNamePanel titleNamePanel;
//    StartButtonPanel startButtonPanel;
//
//    HeroPanel heroPanel;
//    ChoiceButtonPanel choiceButtonPanel;
//    MainTextPanel mainTextPanel;
//    ImagePanelHeroPicture imagePanelHeroPicture;
//    ImagePanelMain imagePanelMain;

    public Window() {
        super(TITLE);
        setMinimumSize(new Dimension(DEFAULT_WIDTH, DEFAULT_HEIGHT));
        setPreferredSize(new Dimension(DEFAULT_WIDTH, DEFAULT_HEIGHT));
        setMaximumSize(new Dimension(DEFAULT_WIDTH, DEFAULT_HEIGHT));
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setBackground(Color.black);
        setLayout(null);

//        titleNamePanel = new TitleNamePanel();
//        startButtonPanel = new StartButtonPanel();
//
//        heroPanel = new HeroPanel();
//        choiceButtonPanel = new ChoiceButtonPanel();
//        mainTextPanel = new MainTextPanel();
//        imagePanelHeroPicture = new ImagePanelHeroPicture();
//        imagePanelMain = new ImagePanelMain();
//
//        createGameBoard();
    }

//    public void createGameBoard() {
//        add(titleNamePanel);
//        add(startButtonPanel);
//        add(heroPanel);
//        add(choiceButtonPanel);
//        add(mainTextPanel);
//        add(imagePanelHeroPicture);
//        add(imagePanelMain);
//        setVisible(true);
//        pack();
//    }


}






