package model;

public class Model {

    private Scene titleScene = new TitleScene();

    private People player = new Player(13, "couteau");
    private People goblin = new Monster(20, "baton", "Le gobelin vous frappe avec son baton !");
    private boolean hasSilverRing = false;


    public Model() {


    }



    public Scene getTitleScene() {
        return titleScene;
    }

    public void setTitleScene(Scene titleScene) {
        this.titleScene = titleScene;
    }
}
