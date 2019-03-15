package bean;

import interfaces.INomina;

public class Triangulo extends Figura implements INomina {

	protected double altura;
	
	public Triangulo(String nombre, String color, double lado,double altura) {
		super(nombre, color, lado);
		this.altura = altura;
	}

	
	public double area() {
		return lado * altura / 2;
	}
	
	public double perimetro () {
		return lado + altura;
	}
	
	public void imprimir () {
		super.imprimir();
		System.out.println("area " + area() + " perimetro " + perimetro());
	}
 	

}
