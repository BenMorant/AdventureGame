package model;

public class Model {

    private Scene titleScene = new TitleScene();

    private People player = new People(13, "couteau");
    private People goblin = new People(20, "baton");
    private boolean hasSilverRing = false;

    private String position;


    public Model() {
        this.position = null;

    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public Scene getTitleScene() {
        return titleScene;
    }

    public void setTitleScene(Scene titleScene) {
        this.titleScene = titleScene;
    }
}
