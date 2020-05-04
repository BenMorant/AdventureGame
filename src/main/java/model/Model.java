package model;

public class Model {

    String modelName;
    People people;

    public Model() {
        people = new People();
        people.setCurrentHp(13);
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public People getPeople() {
        return people;
    }

    public void setPeople(People people) {
        this.people = people;
    }
}
