package view;

import javax.swing.*;
import java.awt.*;

    public abstract class GameFrame extends JFrame {

        public static final int DEFAULT_WIDTH = 1280;
        public static final int DEFAULT_HEIGHT = DEFAULT_WIDTH / 12 * 9;
        public static final String TITLE = "L'aventure n'attend pas";
        private static final Color FRAME_COLOR = Color.black;


        public GameFrame() {
            super(TITLE);
            this.setMinimumSize(new Dimension(DEFAULT_WIDTH, DEFAULT_HEIGHT));
            this.setPreferredSize(new Dimension(DEFAULT_WIDTH, DEFAULT_HEIGHT));
            this.setMaximumSize(new Dimension(DEFAULT_WIDTH, DEFAULT_HEIGHT));
            this.setResizable(false);
            this.setLocationRelativeTo(null);
            this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            this.getContentPane().setBackground(FRAME_COLOR);
            pack();
        }
    }

