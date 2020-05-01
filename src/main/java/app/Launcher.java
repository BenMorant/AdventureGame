package app;

import controller.AbstractController;
import controller.ControllerImpl;
import model.AbstractModel;
import model.ModelImpl;
import org.w3c.dom.Document;
import org.xml.sax.SAXException;
import view.GUI;

import javax.swing.*;
import javax.swing.plaf.synth.SynthLookAndFeel;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.io.InputStream;
import java.text.ParseException;

public final class Launcher implements Runnable {

    public static void main(String[] args) {



        new Launcher().run();


    }

    public static void runGame() {


        AbstractModel model = new ModelImpl();
        AbstractController controller = new ControllerImpl(model);
        GUI gui = new GUI(controller);

        model.addObserver(gui);



    }

    @Override
    public void run() {
        runGame();
    }



}
