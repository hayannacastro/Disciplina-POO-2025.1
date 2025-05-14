package br.edu.formasgeometricas;

public class Pentagono {
	
	//Atributos
	private double lado;
	private double apotema;
	private double area;
	
	
	
	//Construtor
	public Pentagono() {
		lado = 0;
		area = 0;
	}
		
		
	//Métodos
	public void recebaLado(double lado) {
			this.lado = lado; 
	}
	
	public void calcApotema() {
		apotema = lado / (2 * Math.tan(Math.PI / 5));
	}
	
	public void calcArea() {
		area = (5 * lado * apotema) / 2;
	}
	
	public void mostrarArea() {
		System.out.println("A área do Pentágono é: " + area);
	}
	
	public double mostrarAreaComRetorno () {
		System.out.println(area);
		return area;
	}
}
