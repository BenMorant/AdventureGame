package model;

public abstract class Scene {

    protected String title;
    protected People player;

    public Scene(People player) {
        this.title = "L'aventure n'attend pas";
        this.player = player;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
