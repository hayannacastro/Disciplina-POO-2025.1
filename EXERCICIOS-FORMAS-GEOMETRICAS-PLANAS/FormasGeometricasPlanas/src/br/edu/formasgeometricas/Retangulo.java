package br.edu.formasgeometricas;

public class Retangulo {
	//Atributos
		private double base;
		private double altura;
		private double area;
		
		
		//Construtor
		public Retangulo() {
			base = 0;
			altura = 0;
			area = 0;
		}
		
		
		//Métodos
		public void recebaAltura(double altura) {
			this.altura = altura; 
		}
		
		public void recebaBase(double base) {
			this.base = base; 
		}
		
		
		public void calcArea() {
			area = (base * altura);
		}
		public void mostrarArea () {
			System.out.println("A área do Retângulo é: " + area);
		}
		
		public double mostrarAreaComRetorno () {
			System.out.println(area);
			return area;
		}

}
