package model;

public abstract class Scene {

    protected String title;

    public Scene() {
        this.title = "L'aventure n'attend pas";
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
