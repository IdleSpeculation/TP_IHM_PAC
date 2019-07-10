package com.chSaisie;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Presentation {

	private Label label;
	private TextField textField;
	private Button button;
	public Presentation () {
		
        this.textField = new TextField();
        this.textField.setText("0");
        this.label = new Label("this is it");
        this.button = new Button("Valider");

        this.textField.textProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observable, String oldValue,
                                String newValue) {
                if (!newValue.matches("\\d*")) {
                    textField.setText(newValue.replaceAll("[^\\d]", ""));
                }
            }
        
        });
             

	}
	

	public Button getButton() {
		return button;
	}


	public void setButton(Button button) {
		this.button = button;
	}


	public Label getLabel() {
		return label;
	}
	public void setLabel(Label label) {
		this.label = label;
	}
	public TextField getTextField() {
		return textField;
	}
	public void setTextField(TextField textField) {
		this.textField = textField;
	}
	
	
}
