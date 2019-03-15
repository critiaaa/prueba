package test;

import bean.Circunferencia;
import bean.Rectangulo;
import bean.Triangulo;
import interfaces.INomina;
import util.Contenedora_figuras;

public class test {

	public static void main(String[] args) {
		INomina c1 = new Circunferencia ("circulo1" , "verde",3.0);
		INomina c2 = new Circunferencia ("circulo2" , "azul",4.0);

		INomina t1 = new Triangulo ("tri1" ,"rojo",3,5);
		INomina t2 = new Triangulo ("tri2" ,"amarillo",4,6);
		
		INomina r1 = new Rectangulo ("rect1" ,"marron",7,5);
		INomina r2 = new Rectangulo ("rect2" ,"gris",8,9);

		Contenedora_figuras c = new Contenedora_figuras ();
		
		c.add(c1);
		c.add(c2);
		c.add(t1);
		c.add(t2);
		c.add(r1);
		c.add(r2);
		c.list();
		
	}

}
