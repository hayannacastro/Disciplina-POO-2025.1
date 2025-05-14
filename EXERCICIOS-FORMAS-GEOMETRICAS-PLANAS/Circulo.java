package br.edu.formasgeometricas;

public class Circulo {
	
	
	//Atributos
	private double raio;
	private double area;
	
	
	//Construtor
	public Circulo() {
		raio = 0;
		area = 0;
	}
	
	
	//Métodos
	public void recebaRaio(double raio) {
		this.raio = raio; 
	}
	
	public void calcArea() {
		area = Math.PI * raio * raio;
	}
	
	public void mostrarArea() {
		System.out.println("A área do Círculo é: " + area);
	}
	
	public double mostrarAreaComRetorno () {
		System.out.println(area);
		return area;
	}


}
