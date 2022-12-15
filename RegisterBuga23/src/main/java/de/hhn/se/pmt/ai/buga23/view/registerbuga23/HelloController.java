package de.hhn.se.pmt.ai.buga23.view.registerbuga23;


import de.hhn.ai.pmt.kuenstlicheattraktionen.model.Benutzer;
import de.hhn.ai.pmt.kuenstlicheattraktionen.model.BenutzerDAO;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
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
    public void Init(){


    }

    @FXML
    void registerUser(ActionEvent event) {
        String vname = vnametxtfield.toString();
        String nname = nnametxtfield.toString();
        String password = passtxtbox.toString();
        String email = emailtxtfield.toString();
        int id = new Random().nextInt(100000); //for now just random later check number of ids
        //Benutzer b = new Benutzer(vname, nname, password,email,id);
        //BenutzerDAO.createBenutzer(b);
    }

}