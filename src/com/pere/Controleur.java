package com.pere;

import com.ControleurPere;
import com.pere.Abstraction;
import com.pere.Presentation;

import javafx.scene.chart.XYChart;

public class Controleur extends ControleurPere{

	@Override
	public void notifFils(int action) {
		// TODO Auto-generated method stub
		for(int i=0; i<this.filsPAC.size(); i++) {
			this.filsPAC.get(i).update(action);
		}
	}

	private Abstraction abstraction;
	private Presentation presentation; 

	 public Controleur(Abstraction abstraction, Presentation presentation) {
		 this.abstraction = abstraction;
	     this.presentation = presentation;
	 }
	 public void control() {

	    	
	 }


	@Override
	public void update(String action) {
		// TODO Auto-generated method stub
		int temp = this.abstraction.getTemperature();
		System.out.print(action);
		if (action=="Augmenter") {
			this.abstraction.setTemperature(temp+10);
			this.presentation.getSeries().getData().add(new XYChart.Data(this.presentation.getSeries().getData().size(), temp+10));
			notifFils(temp+10);
		}
		else if (action=="Diminuer") {
			this.abstraction.setTemperature(temp-10);
			this.presentation.getSeries().getData().add(new XYChart.Data(this.presentation.getSeries().getData().size(), temp-10));
			notifFils(temp-10);

		}
		else if(action == "RAZ"){ 
			this.abstraction.setTemperature(0);
			this.presentation.getSeries().getData().add(new XYChart.Data(this.presentation.getSeries().getData().size(), 0));
			notifFils(0);

		}
		else if (action=="Afficher_Tableau") {
			this.presentation.getHbox().getChildren().add(this.presentation.getTableView());
		}
		else if (action=="Cacher_Tableau") {
			this.presentation.getHbox().getChildren().remove(this.presentation.getTableView());
		}
		else {
			this.abstraction.setTemperature(Integer.parseInt(action));
			this.presentation.getSeries().getData().add(new XYChart.Data(this.presentation.getSeries().getData().size(), Integer.parseInt(action)));
			notifFils(Integer.parseInt(action));
		}

	}

}
