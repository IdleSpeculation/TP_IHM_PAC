package com;

import java.util.ArrayList;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class PAC extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
    	com.chSaisie.Presentation presFils1 = new com.chSaisie.Presentation();
    	com.chSaisie.Abstraction absFils1 = new com.chSaisie.Abstraction();
    	com.chSaisie.Controleur ctrlFils1 = new com.chSaisie.Controleur(absFils1, presFils1);
    	
    	com.palette.Presentation presFils2 = new com.palette.Presentation();
    	com.palette.Abstraction absFils2 = new com.palette.Abstraction();
    	com.palette.Controleur ctrlFils2 = new com.palette.Controleur(absFils2, presFils2);
    	
    	com.tableau.Presentation presFils3 = new com.tableau.Presentation();
    	com.tableau.Abstraction absFils3 = new com.tableau.Abstraction();
    	com.tableau.Controleur ctrlFils3 = new com.tableau.Controleur(absFils3, presFils3);
    	
    	com.pere.Presentation  presPere =  new com.pere.Presentation(primaryStage, presFils1, presFils2, presFils3);
    	com.pere.Abstraction absPere = new com.pere.Abstraction();
    	com.pere.Controleur ctrlPere = new com.pere.Controleur (absPere, presPere);    	    
    	
    	ctrlFils1.setPeresPAC(ctrlPere);    
    	ctrlFils2.setPeresPAC(ctrlPere);
    	ctrlFils3.setPeresPAC(ctrlPere);

    	
    	ArrayList<ControleurFils> ctrlfils = new ArrayList<ControleurFils>();
    	ctrlfils.add(ctrlFils1); ctrlfils.add(ctrlFils2); ctrlfils.add(ctrlFils3);
    	ctrlPere.setFilsPAC(ctrlfils);
    	

        ctrlFils1.control();
        ctrlFils2.control();
        ctrlFils3.control();
        ctrlPere.control();
        
    }
    public static void main(String[] args) {
        launch(args);
    }

}
