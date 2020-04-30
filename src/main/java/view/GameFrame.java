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
             setFrameDefaultPositionToCenter();
           setDefaultBackgroundColorToBlack();
            setCloseBehavior();
            setResizableFrame();
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
    public void setFrameDefaultPositionToCenter() {
        this.setLocationRelativeTo(null);
    }

    @Override
    public void setDefaultBackgroundColorToBlack() {
        this.getContentPane().setBackground(FRAME_COLOR);
    }

    @Override
    public void setCloseBehavior() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void setResizableFrame() {
        this.setResizable(true);
    }
    }

