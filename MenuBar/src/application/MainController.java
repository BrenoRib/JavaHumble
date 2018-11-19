package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;

public class MainController implements Initializable {

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		
		
	}

	public void CloseApp (ActionEvent event) {
		Platform.exit();
		System.exit(0);
	}
}
