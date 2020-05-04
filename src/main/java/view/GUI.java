package view;

import model.Model;
import view.implementations.TitleScreen;


import javax.swing.*;
import javax.swing.plaf.synth.SynthLookAndFeel;
import java.awt.*;
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
    private JButton choice1;
    private JButton choice2;
    private JButton choice3;
    private JButton choice4;
    private JLabel peopleHpLabel;
    private JLabel peopleHpLabelNumber;
    private JLabel portraitLabel;
    private JLabel mainImageLabel;

    private JLabel gameOverLabel;
    private JButton newGameButton;




    private Model model;

public GUI(Model model) {

    initLookAndFeel();
    this.setTitle(GAME_TITLE);
    this.setMinimumSize(new Dimension(MINIMUM_WIDTH, MINIMUM_HEIGHT));
    this.setExtendedState(JFrame.MAXIMIZED_BOTH);
    this.setLocationRelativeTo(null);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setResizable(true);
    setDefaultLookAndFeelDecorated(true);
    this.model = model;
    setContentPane(container);
    container.setLayout(cardLayout);

    titleScreen = new JPanel();
    titleNamePanel = new JPanel();
    startButtonPanel = new JPanel();
    titleNameLabel = new JLabel("title");
    startButton = new JButton("start");

    mainScreen = new JPanel();
    mainTextPanel = new JPanel();
    choicesPanel = new JPanel();
    attributesPanel = new JPanel();
    mainTextArea = new JTextArea("once upon a time...");
    choice1 = new JButton("choice 1");
    choice2 = new JButton("choice 2");
    choice3 = new JButton("choice 3");
    choice4 = new JButton("choice 4");
    peopleHpLabel = new JLabel("HP : ");
    peopleHpLabelNumber = new JLabel("how much buddy ?");

gameOverScreen = new JPanel();
gameOverPanel = new JPanel();
newGamePanel = new JPanel();

gameOverLabel = new JLabel("GAME OVER");
newGameButton = new JButton("New Game");

        container.add(titleScreen, "1");
        container.add(mainScreen, "2");
        container.add(gameOverScreen, "3");
        cardLayout.show(container, "1");
        setVisible(true);
        pack();

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
}
