package com;

import java.util.ArrayList;

import com.pere.Abstraction;
import com.pere.Presentation;

public abstract class ControleurPere {

	protected ArrayList<ControleurFils> filsPAC ;
	
	public abstract void notifFils(int action);
	public abstract void update(String action);

	public ArrayList<ControleurFils> getFilsPAC() {
		return filsPAC;
	}

	public void setFilsPAC(ArrayList<ControleurFils> filsPAC) {
		this.filsPAC = filsPAC;
		
	}


	
	
}
