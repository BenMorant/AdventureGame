package model;

public class Model extends AbstractModel {

    private String modelName;
    private People people;


    public Model() {
        people = new People();
        people.setCurrentHp(13);
    }

    public void townGate() {
        System.out.println("vous êtes à townGate");
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
