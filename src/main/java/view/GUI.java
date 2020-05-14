package view;

import model.Model;
import model.People;

import javax.swing.*;
import javax.swing.plaf.synth.SynthLookAndFeel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;

public class GUI extends JFrame {

    public static final String GAME_TITLE = "L'aventure n'attend pas";
    private static final int MINIMUM_WIDTH = 1280;
    private static final int MINIMUM_HEIGHT = MINIMUM_WIDTH / 12 * 9;

    private JPanel container = new JPanel();
    private CardLayout cardLayout = new CardLayout();

    private JPanel titleScreen;
    private JPanel titleNamePanel;
    private JPanel startButtonPanel;
    private JPanel mainScreen;
    private JPanel attributesPanel;
    private JPanel choicesPanel;
    private JPanel mainTextPanel;
    private JPanel mainImagePanel;
    private JPanel portraitPanel;
    private JPanel gameOverScreen;
    private JPanel gameOverPanel;
    private JPanel newGamePanel;

    private JLabel titleNameLabel;
    private JButton startButton;

    private JTextArea mainTextArea;
    private JButton choiceButton;
    private JLabel hpLabel;
    private JLabel hpLabelNumber;
    private JLabel portraitLabel;
    private JLabel mainImageLabel;
    private JLabel weaponLabel;
    private JLabel weaponLabelName;

    private JLabel gameOverLabel;
    private JButton newGameButton;

    private Model model;

    private SceneChangeListener sceneChangeListener;
    private ChoiceListener choiceListener;

    public GUI(Model model) {
        this.model = model;

        initLookAndFeel();

        this.setTitle(GAME_TITLE);
        this.setMinimumSize(new Dimension(MINIMUM_WIDTH, MINIMUM_HEIGHT));
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(true);
        setDefaultLookAndFeelDecorated(true);

        setContentPane(container);
        container.setLayout(cardLayout);

        sceneChangeListener = new SceneChangeListener();
        choiceListener = new ChoiceListener();
        titleNamePanel = new JPanel();
        titleNameLabel = new JLabel("title");
        titleNamePanel.add(titleNameLabel);
        titleNamePanel.setBackground(Color.pink);
        titleNameLabel.setFont(new Font("Times New Roman", Font.PLAIN, 167));
        startButtonPanel = new JPanel();
        startButton = new JButton("start");
        startButtonPanel.add(startButton);
        startButtonPanel.setBackground(Color.green);

    titleScreen = new JPanel();
    titleScreen.setLayout(new GridBagLayout());
    GridBagConstraints gbcTitleScreen = new GridBagConstraints();
    gbcTitleScreen.weightx = 1;
    gbcTitleScreen.weighty = 1;
    gbcTitleScreen.fill = GridBagConstraints.HORIZONTAL;
    gbcTitleScreen.gridx = 1;
    gbcTitleScreen.gridy = 1;
    gbcTitleScreen.gridwidth = 3;
    gbcTitleScreen.insets = new Insets(10, 10, 10, 10);
    titleScreen.add(titleNamePanel, gbcTitleScreen);

    gbcTitleScreen.fill = GridBagConstraints.NONE;
    gbcTitleScreen.gridx = 1;
    gbcTitleScreen.gridy = 2;
    gbcTitleScreen.gridwidth = 1;
    gbcTitleScreen.insets = new Insets(10, 10, 10, 10);
    titleScreen.add(startButtonPanel, gbcTitleScreen);

        startButton.addActionListener(sceneChangeListener);

    mainScreen = new JPanel();
    mainScreen.setLayout(new GridBagLayout());
    GridBagConstraints gbcMainScreen = new GridBagConstraints();
    gbcMainScreen.weightx = 1;
    gbcMainScreen.weighty = 1;

    mainImagePanel = new JPanel();
    mainImagePanel.setBackground(Color.lightGray);
    mainImageLabel = new JLabel("main image label");
    mainImagePanel.add(mainImageLabel);

        mainTextPanel = new JPanel();
        mainTextPanel.setBackground(Color.orange);
        mainTextArea = new JTextArea("texte");
        mainTextArea.setLineWrap(true);
        mainTextArea.setWrapStyleWord(true);
        mainTextArea.setEditable(false);
        mainTextPanel.add(mainTextArea);
        choicesPanel = new JPanel(new GridLayout(4, 1, 10, 10));
        choicesPanel.setBackground(Color.yellow);

        choiceButton = new JButton("choice 1 and only");
        choicesPanel.add(choiceButton);


        attributesPanel = new JPanel(new GridLayout(2, 2, 5, 5));
        attributesPanel.setBackground(Color.blue);
        hpLabel = new JLabel("HP : ");
        hpLabelNumber = new JLabel("13");
        weaponLabel = new JLabel("Arme : ");
        weaponLabelName = new JLabel("bazooka");
        attributesPanel.add(hpLabel);
        attributesPanel.add(hpLabelNumber);
        attributesPanel.add(weaponLabel);
        attributesPanel.add(weaponLabelName);

        portraitPanel = new JPanel();
        portraitPanel.setBackground(Color.black);
        portraitLabel = new JLabel("portrait label");
        portraitPanel.add(portraitLabel);

        gbcMainScreen.gridx = 0;
        gbcMainScreen.gridy = 0;
        gbcMainScreen.gridwidth = 4;
        gbcMainScreen.gridheight = 4;
    gbcTitleScreen.insets = new Insets(10, 10, 10, 10);
    mainScreen.add(mainImagePanel, gbcMainScreen);

    gbcMainScreen.gridx = 0;
    gbcMainScreen.gridy = 4;
    gbcMainScreen.gridwidth = 4;
    gbcMainScreen.gridheight = 2;
    gbcTitleScreen.insets = new Insets(10, 10, 10, 10);
    mainScreen.add(mainTextPanel, gbcMainScreen);

    gbcMainScreen.gridx = 5;
    gbcMainScreen.gridy = 0;
    gbcMainScreen.gridwidth = 1;
    gbcMainScreen.gridheight = 1;
    gbcTitleScreen.insets = new Insets(10, 10, 10, 10);
    mainScreen.add(portraitPanel, gbcMainScreen);

    gbcMainScreen.gridx = 4;
    gbcMainScreen.gridy = 1;
    gbcMainScreen.gridwidth = 3;
    gbcMainScreen.gridheight = 3;
    mainScreen.add(attributesPanel, gbcMainScreen);

    gbcMainScreen.gridx = 4;
    gbcMainScreen.gridy = 4;
    gbcMainScreen.gridwidth = 3;
    gbcMainScreen.gridheight = 2;
    gbcTitleScreen.insets = new Insets(10, 10, 10, 10);
    mainScreen.add(choicesPanel, gbcMainScreen);

gameOverScreen = new JPanel();
gameOverScreen.setLayout(new GridBagLayout());
    GridBagConstraints gbcGameOverScreen = new GridBagConstraints();
    gbcGameOverScreen.weightx = 1;
    gbcGameOverScreen.weighty = 1;

gameOverPanel = new JPanel();
    gameOverLabel = new JLabel("GAME OVER");
    gameOverPanel.add(gameOverLabel);
    gameOverPanel.setBackground(Color.pink);
    gameOverLabel.setFont(new Font("Times New Roman", Font.PLAIN, 167));
        newGamePanel = new JPanel();
        newGameButton = new JButton("New Game");
        newGamePanel.add(newGameButton);
        newGamePanel.setBackground(Color.green);

        gameOverScreen.add(gameOverPanel, gbcGameOverScreen);
        gameOverScreen.add(newGamePanel, gbcGameOverScreen);


        container.add(titleScreen, "titleScreen");
        container.add(mainScreen, "mainScreen");
        container.add(gameOverScreen, "gameOverScreen");
        cardLayout.show(container, "titleScreen");
        pack();
        setVisible(true);

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


    public void updateHero(People hero) {
        hpLabelNumber.setText(Integer.toString(hero.getHp()));
        weaponLabelName.setText(hero.getWeapon());
    }


    private class SceneChangeListener implements ActionListener {

        public void actionPerformed(ActionEvent actionEvent) {
            Object source = actionEvent.getSource();
            if (startButton.equals(source)) {
                cardLayout.show(container, "mainScreen");
            }
            if (newGameButton.equals(source)) {
                cardLayout.show(container, "mainScreen");
            }


        }
    }

    private class ChoiceListener implements ActionListener {

        public void actionPerformed(ActionEvent actionEvent) {
            Object action = actionEvent.getActionCommand();
//            switch (action) {
//                case "c1" : null;
//                break;
//                case "c2" : null;
//                    break;
//                case "c3" : null;
//                    break;
//                case "c4" : null;
//                    break;
//
//            }


        }
    }
}
