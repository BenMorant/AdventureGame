package model;

public class Player extends People {


//    private String position;
    private String picture;

    public Player() {
        super();
        //  this.position = null;

    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }


    public void receiveHealing(int healing) {
        hp += healing;
    }

//    public String getPosition() {
//        return position;
//    }
//
//    public void setPosition(String position) {
//        this.position = position;
//    }
}
