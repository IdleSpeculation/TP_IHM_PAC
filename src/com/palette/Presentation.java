package com.palette;

import javafx.scene.control.Button;

public class Presentation {
	private Button augmenter;
	private Button diminuer; 
	private Button raz; 
	public Presentation () {
		this.augmenter =  new Button("Augmenter");
		this.diminuer =  new Button("Diminuer");
		this.raz =  new Button("Raz");

	}
	public Button getAugmenter() {
		return augmenter;
	}
	public void setAugmenter(Button augmenter) {
		this.augmenter = augmenter;
	}
	public Button getDiminuer() {
		return diminuer;
	}
	public void setDiminuer(Button diminuer) {
		this.diminuer = diminuer;
	}
	public Button getRaz() {
		return raz;
	}
	public void setRaz(Button raz) {
		this.raz = raz;
	}
	
}

