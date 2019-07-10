package com.chSaisie;

import com.ControleurFils;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;

public class Controleur extends ControleurFils{

	@Override
	public void notifPeres(String action) {
		// TODO Auto-generated method stub
		this.getPeresPAC().update(action);
	}
	

    private Abstraction abstraction;
    private Presentation presentation;

    public Controleur(Abstraction abstraction, Presentation presentation) {
        this.abstraction = abstraction;
        this.presentation = presentation;
    }

    public void control() {
    	presentation.getButton().setOnAction(e -> notifPeres(this.presentation.getTextField().getText()));

    }

    @Override
    public void update(int value) {

    	this.presentation.getTextField().setText(Integer.toString(value));
    }

}
