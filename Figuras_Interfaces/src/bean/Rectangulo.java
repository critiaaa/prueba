package bean;

import interfaces.INomina;

public class Rectangulo extends Figura implements INomina {
	
	private double lado2;
	
	public Rectangulo(String nombre, String color, double lado, double lado2) {
		super(nombre, color, lado);
		this.lado2 = lado2;
	}

	public double area() {
		return lado * lado2;
	}
	
	public double perimetro () {
		return 2*lado + 2 * lado2;
	}

	public void imprimir () {
		super.imprimir();
		System.out.println("area " + area() + " perimetro " + perimetro());
	}
 	

}
