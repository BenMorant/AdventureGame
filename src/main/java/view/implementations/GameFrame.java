package view.implementations;

import view.interfaces.GameFrameInterface;

import javax.swing.*;
import java.awt.*;

public class GameFrame extends JFrame implements GameFrameInterface {

    private static final int MINIMUM_WIDTH = 1280;
    private static final int MINIMUM_HEIGHT = MINIMUM_WIDTH / 12 * 9;

        public GameFrame(String frameTitle) {
            authorizeCustomWindowDecoration();
            displayFrameTitle(frameTitle);
            setMinimalFrameSize(MINIMUM_WIDTH, MINIMUM_HEIGHT);
            setFrameFullScreen();
             setFrameDefaultPositionToCenter();
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
    public void setCloseBehavior() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void setResizableFrame() {
        this.setResizable(true);
    }

    @Override
    public void authorizeCustomWindowDecoration() {
        setDefaultLookAndFeelDecorated(true);
    }
}


