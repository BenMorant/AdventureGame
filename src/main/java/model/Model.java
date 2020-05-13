package model;


public class Model extends AbstractModel {

    private People player = new People(13, "Couteau");
    private People goblin = new People(20, "Baton");
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



}
