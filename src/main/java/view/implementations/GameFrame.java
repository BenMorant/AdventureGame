package view.implementations;

import view.interfaces.GameFrameInterface;

import javax.swing.*;
import java.awt.*;

public class GameFrame extends JFrame implements GameFrameInterface {

    private static final int MINIMUM_WIDTH = 1280;
    private static final int MINIMUM_HEIGHT = MINIMUM_WIDTH / 12 * 9;
    private static final Color FRAME_COLOR = Color.black;

        public GameFrame(String frameTitle) {
            displayFrameTitle(frameTitle);
            setMinimalFrameSize(MINIMUM_WIDTH, MINIMUM_HEIGHT);
            setFrameFullScreen();
             setFrameDefaultPositionToCenter();
           setDefaultBackgroundColorToBlack();
            setCloseBehavior();
            setResizableFrame();
            pack();
        }

        @Override
        public void displayFrameTitle(String frameTitle) {
            this.setTitle(frameTitle);
        }

    @Override
    public void setMinimalFrameSize(int width, int height) {
        this.setMinimumSize(new Dimension(width, height));
    }

    @Override
    public void setFrameFullScreen() {
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

