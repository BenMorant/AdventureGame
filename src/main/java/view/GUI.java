package view;

import model.Model;
import view.implementations.GameFrameImpl;
import view.implementations.TitleScreenImpl;

import javax.swing.*;
import javax.swing.plaf.synth.SynthLookAndFeel;
import java.awt.*;
import java.text.ParseException;

public class GUI {

    public static final String GAME_TITLE = "L'aventure n'attend pas";

    private JFrame gameFrame = new GameFrameImpl(GAME_TITLE);
    private JPanel container = new JPanel();
    private JPanel titleScreen;
    private JPanel mainPanel = new JPanel();
    private CardLayout cardLayout = new CardLayout();

    private Model model;

public GUI(Model model) {
        initLookAndFeel();

 titleScreen = new TitleScreenImpl(GAME_TITLE);
    this.model = model;
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

}
