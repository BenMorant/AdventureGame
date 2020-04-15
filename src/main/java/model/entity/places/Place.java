package model.entity.places;

import model.entity.GenericModelEntity;

public abstract class Place extends GenericModelEntity {


    public Place(int gender, String name, String image, String description) {
        super(gender, name, image, description);
        this.image = "./src/main/resources/pix/places/" + image;
    }

    @Override
    public String toString() {
        return "Place{" +
                "gender=" + gender +
                ", name='" + name + '\'' +
                ", image='" + image + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
