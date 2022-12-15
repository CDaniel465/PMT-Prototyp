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
        String vname = vnametxtfield.toString();
        String nname = nnametxtfield.toString();
        String password = passtxtbox.toString();
        String email = emailtxtfield.toString();
        //id wird nicht gebraucht weil das wird automatisch gefüllt!!!!

        Benutzer b = new Benutzer();
        b.setEmail(email);
        b.setNachname(nname);
        b.setVorname(vname);
        b.setPassword(password);
        BenutzerDAO.createBenutzer();
        //BenutzerDAO.createBenutzer(b);

        //wenn alles klappt
        outputlabel.setVisible(true);
        outputlabel.setText("Neuer Benutzer wurde angelegt!");
        outputlabel.setStyle("-fx-text-fill: green;");

        //wenn es nicht klappt
        outputlabel.setVisible(true);
        outputlabel.setText("Neuer Benutzer konnte nicht angelegt werden!");
        outputlabel.setStyle("-fx-text-fill: red;");
    }

    @FXML
    void cancleRegister(ActionEvent event) {
        //zuruek login seite
        Stage stage = (Stage) canclebtn.getScene().getWindow();
        stage.close();

    }
}