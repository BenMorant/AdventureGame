package model;

public class Player extends People {

    private String picture;
    private boolean hasSilverRing;

    public Player() {
        super();

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

    public boolean isHasSilverRing() {
        return hasSilverRing;
    }

    public void setHasSilverRing(boolean hasSilverRing) {
        this.hasSilverRing = hasSilverRing;
    }
}
