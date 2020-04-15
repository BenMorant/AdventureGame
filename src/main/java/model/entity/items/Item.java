package model.entity.items;

import model.entity.GenericModelEntity;

public abstract class Item extends GenericModelEntity {

    protected int weight = 0;

    public Item(int gender, String name, String image, String description, int weight) {
        super(gender, name, image, description);
        this.image = "./src/main/resources/pix/items/" + image;
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Item{" +
                "weight=" + weight +
                ", gender=" + gender +
                ", name='" + name + '\'' +
                ", image='" + image + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}


