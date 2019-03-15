package bean;

import interfaces.INomina;

public class Circunferencia extends Figura implements INomina {

	public Circunferencia(String nombre, String color, double lado) {
		super(nombre, color, lado);
		// TODO Auto-generated constructor stub
	}

	public double area() {
		return lado * lado * pi;
	}
	
	public double perimetro () {
		return 2 * lado + pi;
	}
	
	public void imprimir () {
		super.imprimir();
		System.out.println("area " + area() + " perimetro " + perimetro());
	}
	
	

}
