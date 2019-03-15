package util;

import java.util.Vector;

import interfaces.INomina;

public class Contenedora_figuras {
	
	private Vector<INomina> figuras = new Vector<INomina> ();

	public Vector<INomina> getFiguras() {
		return figuras;
	}

	public void setFiguras(Vector<INomina> figuras) {
		this.figuras = figuras;
	}
	
	public void add (INomina figura) {
		figuras.add(figura);
	}
	
	public void list () {
		
		for (INomina figura : figuras) {
			figura.imprimir();
		}
	}
	

}
