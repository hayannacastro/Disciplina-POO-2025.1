package br.edu.formasgeometricas;

public class Quadrado {
	
	
	//Atributos
	private double lado;
	private double area;
	
	
	//Costrutor
	public Quadrado() {
		lado = 0;
		area = 0;
	}
	
	
	//Métodos
	public void recebaLado(double lado) {
		this.lado = lado; 
	}
	
	public void calcArea() {
		area = (lado * lado);
	}
	
	public void mostrarArea () {
		System.out.println("A área do Quadrado é: " + area);
	}

	public double mostrarAreaComRetorno () {
		System.out.println(area);
		return area;
	}

}