package br.edu.formasgeometricas;

public class Hexagono {
	
	//Atributos
		private double lado;
		private double area;
		
		
		//Costrutor
		public Hexagono() {
			lado = 0;
			area = 0;
		}
		
		
		//Métodos
		public void recebaLado(double lado) {
			this.lado = lado; 
		}
		
		public void calcArea() {
			area = (3 * Math.sqrt(3) * lado * lado) / 2;
		}
		
		public void mostrarArea () {
			System.out.println("A área do Hexagono é: " + area);
		}

		public double mostrarAreaComRetorno () {
			System.out.println(area);
			return area;
		}
	
	
}
