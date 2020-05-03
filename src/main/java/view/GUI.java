package view;

import model.Model;


import javax.swing.*;
import javax.swing.plaf.synth.SynthLookAndFeel;
import java.awt.*;
import java.text.ParseException;

public class GUI extends JFrame {

    public static final String GAME_TITLE = "L'aventure n'attend pas";
    private static final int MINIMUM_WIDTH = 1280;
    private static final int MINIMUM_HEIGHT = MINIMUM_WIDTH / 12 * 9;

    private JPanel container = new JPanel();
    private JPanel titleScreen;
    private JPanel mainPanel = new JPanel();
    private CardLayout cardLayout = new CardLayout();

    private Model model;

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



        mainPanel.setBackground(Color.pink);
        container.add(titleScreen, "1");
        container.add(mainPanel, "2");
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
