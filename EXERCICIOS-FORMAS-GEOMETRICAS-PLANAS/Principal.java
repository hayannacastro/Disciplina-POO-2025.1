package br.edu.principal;

import br.edu.formasgeometricas.*;


public class Principal {

	public static void main(String[] args) {
		Triangulo fg1 = new Triangulo();
		fg1.recebaBase(10);
		fg1.recebaAltura(6);
		fg1.calcArea();
		fg1.mostrarArea();
		double recebaArea = fg1.mostrarAreaComRetorno();
		System.out.println("");
		
		
		Quadrado  fg2 = new Quadrado();
		fg2.recebaLado(8);
		fg2.calcArea();
		fg2.mostrarArea();
		recebaArea = fg2.mostrarAreaComRetorno();
		System.out.println("");
		
		
		Circulo  fg3 = new Circulo();
		fg3.recebaRaio(9);
		fg3.calcArea();
		fg3.mostrarArea();
		recebaArea = fg3.mostrarAreaComRetorno();
		System.out.println("");
		
		
		Trapezio fg4 = new Trapezio();
		fg4.recebaBaseMaior(9.6);
		fg4.recebaBaseMenor(5);
		fg4.recebaAltura(8);
		fg4.calcArea();
		fg4.mostrarArea();
		recebaArea = fg4.mostrarAreaComRetorno();
		System.out.println("");
		
		
		Retangulo fg5 = new Retangulo();
		fg5.recebaBase(4);
		fg5.recebaAltura(9);
		fg5.calcArea();
		fg5.mostrarArea();
		recebaArea = fg5.mostrarAreaComRetorno();
		System.out.println("");
		
		
		Losango fg6 = new Losango();
		fg6.recebaBaseMaior(7);
		fg6.recebaBaseMenor(9);
		fg6.calcArea();
		fg6.mostrarArea();
		recebaArea = fg6.mostrarAreaComRetorno();
		System.out.println("");
		
		
		Paralelogramo fg7 = new Paralelogramo();
		fg7.recebaBase(12);
		fg7.recebaAltura(9);
		fg7.calcArea();
		fg7.mostrarArea();
		recebaArea = fg7.mostrarAreaComRetorno();
		System.out.println("");
		
		
		Pentagono fg8 = new Pentagono();
		fg8.recebaLado(5);
		fg8.calcApotema();
		fg8.calcArea();
		fg8.mostrarArea();
		recebaArea = fg8.mostrarAreaComRetorno();
		System.out.println("");
		
		
		Quadrado  fg9 = new Quadrado();
		fg9.recebaLado(4);
		fg9.calcArea();
		fg9.mostrarArea();
		recebaArea = fg9.mostrarAreaComRetorno();
		System.out.println("");
		

	}

}
