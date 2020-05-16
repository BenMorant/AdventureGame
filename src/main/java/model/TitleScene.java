package model;

public class TitleScene extends Scene {


    private String startStr;

    public TitleScene(People player) {
        super(player);
        this.startStr = "C'est parti !";

    }

    public String getStartStr() {
        return startStr;
    }

    public void setStartStr(String startStr) {
        this.startStr = startStr;
    }
}
