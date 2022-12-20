package de.hhn.se.pmt.ai.buga23.view.registerbuga23;


import de.hhn.ai.pmt.kuenstlicheattraktionen.model.Benutzer;
import de.hhn.ai.pmt.kuenstlicheattraktionen.model.BenutzerCriteria;
import de.hhn.ai.pmt.kuenstlicheattraktionen.model.BenutzerDAO;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.paint.Paint;
import javafx.stage.Stage;
import org.orm.PersistentException;

import java.util.Objects;
import java.util.Random;

import java.util.Random;


public class HelloController {
    @FXML
    private Button registerbtn;

    @FXML
    private Button canclebtn;

    @FXML
    private Label outputlabel;

    @FXML
    private Label mainlable;

    @FXML
    private Label vnamelabel;

    @FXML
    private TextField vnametxtfield;

    @FXML
    private Label nnamelabel;

    @FXML
    private TextField nnametxtfield;

    @FXML
    private Label emaillabel;

    @FXML
    private TextField emailtxtfield;

    @FXML
    private Label passlabel;

    @FXML
    private TextField passtxtbox;

    @FXML
    public void initialize(){
        outputlabel.setVisible(false);
    }

    @FXML
    void registerUser(ActionEvent event) {
        String vname = vnametxtfield.getText();
        String nname = nnametxtfield.getText();
        String password = passtxtbox.getText();
        String email = emailtxtfield.getText();
        //id wird nicht gebraucht, weil das wird automatisch gefuellt!!!!

        if (vname.equals("")){
            //falls Vorname Leer ist
            outputlabel.setVisible(true);
            outputlabel.setText("Der Vorname darf Nicht leer sein!");
            outputlabel.setStyle("-fx-text-fill: red;");
        } else if (nname.equals("")) {
            //falls Nachnahme Leer ist
            outputlabel.setVisible(true);
            outputlabel.setText("Der Nachname darf Nicht leer sein!");
            outputlabel.setStyle("-fx-text-fill: red;");
        } else if (password.equals("")) {
            //falls Passwort Leer ist
            outputlabel.setVisible(true);
            outputlabel.setText("Das Password darf Nicht leer sein!");
            outputlabel.setStyle("-fx-text-fill: red;");
        } else if (email.equals("")) {
            //falls Email Leer ist
            outputlabel.setVisible(true);
            outputlabel.setText("Die Email darf Nicht leer sein!");
            outputlabel.setStyle("-fx-text-fill: red;");
        }
        else {
            //Erstellen von Benutzer objekt
            Benutzer b = new Benutzer();
            b.setEmail(email);
            b.setNachname(nname);
            b.setVorname(vname);
            b.setPassword(password);


            //BenutzerDAO.createBenutzer().setVorname(vname);
            //BenutzerDAO.createBenutzer().setNachname(nname);
            //BenutzerDAO.createBenutzer().setEmail(email);
            //BenutzerDAO.createBenutzer().setPassword(password);

            try{
                //Speichern von Benutzer objekt

                BenutzerDAO.save(b);
                outputlabel.setVisible(true);
                outputlabel.setText("Neuer Benutzer wurde angelegt!");
                outputlabel.setStyle("-fx-text-fill: green;");
            }
            catch (PersistentException e){
                //falls erstellen nicht funktionieren
                outputlabel.setVisible(true);
                outputlabel.setText("Neuer Benutzer konnte nicht angelegt werden!");
                outputlabel.setStyle("-fx-text-fill: red;");
            }
        }
    }

    @FXML
    void cancleRegister(ActionEvent event) {
        //zuruek login seite
        Stage stage = (Stage) canclebtn.getScene().getWindow();
        stage.close();

    }
}