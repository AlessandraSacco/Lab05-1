package it.polito.tdp.anagrammi;

import java.net.URL;
import java.util.ResourceBundle;

import it.polito.tdp.anagrammi.model.Model;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class FXMLController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button btnAnagrammi;

    @FXML
    private TextField txtField;

    @FXML
    private TextArea txtArea1;

    @FXML
    private TextArea txtArea2;

    @FXML
    private Button btnReset;

	private Model model;

    @FXML
    void doAnagrammi(ActionEvent event) {
     String risultato= txtField.getText();
    
     
    }

    @FXML
    void doReset(ActionEvent event) {
     txtArea1.clear();
     txtArea2.clear();
    }

    @FXML
    void initialize() {
        assert btnAnagrammi != null : "fx:id=\"btnAnagrammi\" was not injected: check your FXML file 'Scene.fxml'.";
        assert txtField != null : "fx:id=\"txtField\" was not injected: check your FXML file 'Scene.fxml'.";
        assert txtArea1 != null : "fx:id=\"txtArea1\" was not injected: check your FXML file 'Scene.fxml'.";
        assert txtArea2 != null : "fx:id=\"txtArea2\" was not injected: check your FXML file 'Scene.fxml'.";
        assert btnReset != null : "fx:id=\"btnReset\" was not injected: check your FXML file 'Scene.fxml'.";

    }

	public void setModel(Model model) {
	this.model=model;
		
	}
}
