package view;

import view.interfaces.GameFrameInterface;

import javax.swing.*;
import java.awt.*;


import static app.Constants.MINIMUM_HEIGHT;
import static app.Constants.MINIMUM_WIDTH;
import static app.Constants.FRAME_COLOR;
import static app.Constants.GAMETITLE;

public abstract class GameFrame extends JFrame implements GameFrameInterface {

        public GameFrame() {
            displayFrameTitle();
            setMinimalFrameSize();
            displayFrameFullScreen();
             setFrameDefaultPosition();
           setDefaultBackgroundColor();
            setCloseBehavior();
            setFrameResizable(true);
            pack();
        }

        @Override
        public void displayFrameTitle() {
            this.setTitle(GAMETITLE);
        }

    @Override
    public void setMinimalFrameSize() {
        this.setMinimumSize(new Dimension(MINIMUM_WIDTH, MINIMUM_HEIGHT));
    }

    @Override
    public void displayFrameFullScreen() {
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
    }

    @Override
    public void setFrameDefaultPosition() {
        this.setLocationRelativeTo(null);
    }

    @Override
    public void setDefaultBackgroundColor() {
        this.getContentPane().setBackground(FRAME_COLOR);
    }

    @Override
    public void setCloseBehavior() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void setFrameResizable(boolean isResizable) {
        this.setResizable(isResizable);
    }
    }

