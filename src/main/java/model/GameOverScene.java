package model;

public class GameOverScene extends Scene {


    private String gameOverStr;
    private String newGameStr;

    public GameOverScene() {
        super();
        this.gameOverStr = "Game Over";
        this.newGameStr = "Nouvelle partie ?";

    }

    public String getGameOverStr() {
        return gameOverStr;
    }

    public void setGameOverStr(String gameOverStr) {
        this.gameOverStr = gameOverStr;
    }

    public String getNewGameStr() {
        return newGameStr;
    }

    public void setNewGameStr(String newGameStr) {
        this.newGameStr = newGameStr;
    }
}
