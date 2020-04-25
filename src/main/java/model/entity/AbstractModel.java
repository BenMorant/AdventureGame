package model.entity;

import observer.Observable;
import observer.Observer;

import java.util.ArrayList;

public abstract class AbstractModel implements Observable {

    protected double result = 0;
    protected String operateur = "", operande = "";
    private final ArrayList<Observer> listObserver = new ArrayList<>();

    //Efface
    public abstract void reset();

    //Effectue le calcul
    public abstract void calcul();

    //Affichage forcé du résultat
    public abstract void getResultat();

    //Définit l'opérateur de l'opération
    public abstract void setOperateur(String operateur);

    //Définit le nombre à utiliser pour l'opération
    public abstract void setNombre(String nbre);

    //Implémentation du pattern observer
    public void addObserver(Observer obs) {
        this.listObserver.add(obs);
    }

    public void notifyObserver(String str) {
        for (Observer obs : listObserver)
            obs.update(str);
    }
}
