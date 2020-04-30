package view;

import view.interfaces.GameFrameInterface;

import javax.swing.*;
import java.awt.*;


import static app.Constants.DEFAULT_HEIGHT;
import static app.Constants.DEFAULT_WIDTH;
import static app.Constants.FRAME_COLOR;
import static app.Constants.GAMETITLE;

public abstract class GameFrame extends JFrame implements GameFrameInterface {

        public GameFrame() {
            displayFrameTitle();
            setMinimalFrameSize();
            setDefaultFrameSize();
            setMaxFrameSize();
             setFrameDefaultPosition();
           setDefaultBackgroundColor();
            this.setResizable(false);
            this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            pack();
        }

        @Override
        public void displayFrameTitle() {
            this.setTitle(GAMETITLE);
        }

    @Override
    public void setMinimalFrameSize() {
        this.setMinimumSize(new Dimension(DEFAULT_WIDTH, DEFAULT_HEIGHT));
    }

    @Override
    public void setDefaultFrameSize() {
        this.setPreferredSize(new Dimension(DEFAULT_WIDTH, DEFAULT_HEIGHT));
    }

    @Override
    public void setMaxFrameSize() {
        this.setMaximumSize(new Dimension(DEFAULT_WIDTH, DEFAULT_HEIGHT));
    }

    @Override
    public void setFrameDefaultPosition() {
        this.setLocationRelativeTo(null);
    }

    @Override
    public void setDefaultBackgroundColor() {
        this.getContentPane().setBackground(FRAME_COLOR);
    }


    }

