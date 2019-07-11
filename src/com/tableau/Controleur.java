package com.tableau;

import com.ControleurFils;
import com.tableau.Abstraction;
import com.tableau.Presentation;

import javafx.scene.control.TableColumn;

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
		
		presentation.getButton().setOnAction(e -> notifPeres("Afficher_Tableau"));
		presentation.getCacher().setOnAction(e -> notifPeres("Cacher_Tableau"));


	}

	@Override
	public void update(int value) {
		// TODO Auto-generated method stub
		com.pere.Abstraction dummyVar = new com.pere.Abstraction();
		dummyVar.setTemperature(value);
		this.presentation.getTableView().getItems().add(dummyVar);
	}



}
