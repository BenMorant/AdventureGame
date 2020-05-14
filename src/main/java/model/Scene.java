package model;

import java.util.ArrayList;
import java.util.List;

public abstract class Scene {

    protected String title;

    private List<Object> sceneObjects = new ArrayList<>();

    public void addSceneObject(Object sceneObject) {
        this.sceneObjects.add(sceneObject);
        this.title = "L'aventure n'attend pas";
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<Object> getSceneObjects() {
        return sceneObjects;
    }

    public void setSceneObjects(List<Object> sceneObjects) {
        this.sceneObjects = sceneObjects;
    }
}
