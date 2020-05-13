package model;


import java.util.ArrayList;
import java.util.List;

public class Model extends AbstractModel {

    private People player = new People(13, "couteau");
    private People goblin = new People(20, "baton");
    private boolean hasSilverRing = false;

    private String position;

    private List<String> choices = new ArrayList<>();


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
