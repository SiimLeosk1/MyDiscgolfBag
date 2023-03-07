package com.example.mydiscgolfbag;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class AppController {

	@FXML
	private Button SubmitBtn;

	@FXML
	private TextField txtField1;

	@FXML
	private Label confirmText;

	@FXML
	void onSubmitButtonClick(ActionEvent event) {
		System.out.println("Hi");
		confirmText.setText("Disc added.");
	}

	@FXML
	void sayConfirmClick(ActionEvent event) {

	}
	}