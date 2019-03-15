package bean;

public class Figura {
	protected String nombre;
	protected String color;
	protected double lado;
	
	public Figura(String nombre, String color, double lado) {
	this.nombre = nombre;
	this.color = color;
	this.lado = lado;
	}
	
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getLado() {
		return lado;
	}

	public void setLado(double lado) {
		this.lado = lado;
	}
	
	public void imprimir () {
		System.out.print(nombre + " " + color + "  ");
	}

	
	
}
