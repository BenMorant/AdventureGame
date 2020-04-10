package app;

import view.GameBoard;

import java.awt.*;

public class Launcher extends Canvas implements Runnable {


    private static final long serialVersionUID = -3532514812003198546L;

    public static void main(String[] args) {

        new GameBoard();

    }

    @Override
    public void run() {

    }
}
