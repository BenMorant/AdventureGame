package logic;

import view.GameBoard;

public class Game {

    public static final String TITLE = "L'aventure n'attend pas";

    GameBoard gameBoard;
    private int points;

    public Game(GameBoard parentGameBoard) {
        gameBoard = parentGameBoard;

    }

    public void increasePoints() {
        points ++;
    }

    public void decreasePoints() {
        points --;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }
}
