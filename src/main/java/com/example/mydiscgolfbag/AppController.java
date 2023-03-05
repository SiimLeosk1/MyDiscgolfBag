package com.example.mydiscgolfbag;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class AppController {
	@FXML
	private Label welcomeText;

	@FXML
	protected void onHelloButtonClick() {
		welcomeText.setText("This button works!");
	}
}