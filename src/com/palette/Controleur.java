package com.palette;

import java.awt.Button;

import com.ControleurFils;
import com.palette.Abstraction;
import com.palette.Presentation;

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
		
		presentation.getAugmenter().setOnAction(e -> notifPeres("Augmenter"));
		presentation.getDiminuer().setOnAction(e -> notifPeres("Diminuer"));
		presentation.getRaz().setOnAction(e -> notifPeres("RAZ"));

	}

	@Override
	public void update(int value) {
		// TODO Auto-generated method stub
		
	}



}
