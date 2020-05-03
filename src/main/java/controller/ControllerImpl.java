package controller;

import model.AbstractModel;
import view.GUI;

public class ControllerImpl extends AbstractController {


    public ControllerImpl(AbstractModel model, GUI gui) {
        super(model, gui);
    }

    @Override
    void control() {
//TODO to define : "permet d'indiquer les informations à envoyer à notre modèle.
// Celui-ci mis à jour, les données à afficher dans la vue seront envoyées
// via l'implémentation du pattern observer entre notre modèle et notre vue. "
    }
}
