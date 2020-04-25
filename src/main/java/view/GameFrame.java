package view;

import javax.swing.*;
import java.awt.*;

import static model.entity.screens.TitleScreen.TITLE;

public abstract class GameFrame extends JFrame {

    public static final int DEFAULT_WIDTH = 1280;
    public static final int DEFAULT_HEIGHT = DEFAULT_WIDTH / 12 * 9;

    public GameFrame() {
        super(TITLE);
        setMinimumSize(new Dimension(DEFAULT_WIDTH, DEFAULT_HEIGHT));
        setPreferredSize(new Dimension(DEFAULT_WIDTH, DEFAULT_HEIGHT));
        setMaximumSize(new Dimension(DEFAULT_WIDTH, DEFAULT_HEIGHT));
        setResizable(false);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setBackground(Color.black);
        setLayout(null);
        pack();
    }
}






