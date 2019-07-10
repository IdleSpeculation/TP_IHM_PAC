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
    	com.pere.Presentation  presPere =  new com.pere.Presentation();
    	com.pere.Abstraction absPere = new com.pere.Abstraction();
    	com.pere.Controleur ctrlPere = new com.pere.Controleur (absPere, presPere);
    	
    	
    	com.chSaisie.Presentation presFils1 = new com.chSaisie.Presentation();
    	com.chSaisie.Abstraction absFils1 = new com.chSaisie.Abstraction();
    	com.chSaisie.Controleur ctrlFils1 = new com.chSaisie.Controleur(absFils1, presFils1);
    	ctrlFils1.setPeresPAC(ctrlPere);
    	
    	com.palette.Presentation presFils2 = new com.palette.Presentation();
    	com.palette.Abstraction absFils2 = new com.palette.Abstraction();
    	com.palette.Controleur ctrlFils2 = new com.palette.Controleur(absFils2, presFils2);
    	ctrlFils2.setPeresPAC(ctrlPere);
    	
    	ArrayList<ControleurFils> ctrlfils = new ArrayList<ControleurFils>();
    	ctrlfils.add(ctrlFils1); ctrlfils.add(ctrlFils2);
    	ctrlPere.setFilsPAC(ctrlfils);
    	
        Group root = new Group();
        primaryStage.setTitle("Illustration du modele MVC ");
        primaryStage.setMinWidth(400);
        primaryStage.setMinHeight(300);
        Scene scene=new Scene(root);
        VBox vbox1 = new VBox(presFils1.getLabel(), presFils1.getTextField(), presFils1.getButton());
        HBox hbox1 = new HBox(presFils2.getAugmenter(), presFils2.getDiminuer(), presFils2.getRaz());
        HBox hbox2 = new HBox(presPere.getLineChart(),vbox1);
        VBox vbox = new VBox (hbox2, hbox1);

        root.getChildren().add(vbox);
        primaryStage.setScene(scene);
        primaryStage.show();

        ctrlFils1.control();
        ctrlFils2.control();
        ctrlPere.control();
    }
    public static void main(String[] args) {
        launch(args);
    }

}
