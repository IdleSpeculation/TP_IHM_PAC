package com;

import java.util.ArrayList;

import com.pere.Abstraction;
import com.pere.Presentation;

public abstract class ControleurFils {

	private ControleurPere peresPAC ;	

	public abstract void notifPeres(String action);
	public abstract void update(int value);

	public ControleurPere getPeresPAC() {
		return peresPAC;
	}
	public void setPeresPAC(ControleurPere peresPAC) {
		this.peresPAC = peresPAC;
	}
	
}
