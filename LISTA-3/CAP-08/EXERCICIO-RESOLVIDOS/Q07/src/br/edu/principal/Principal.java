package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double nota1 = scanner.nextDouble();
        double nota2 = scanner.nextDouble();
        double nota3 = scanner.nextDouble();
        char letra;
        do {
            letra = scanner.next().toUpperCase().charAt(0);
        } while (letra != 'A' && letra != 'P');
        double m = calculaMedia(nota1, nota2, nota3, letra);
        if (letra == 'A') {
            System.out.println("A média aritmética " + m);
        } else {
            System.out.println("A média ponderada " + m);
        }
        scanner.close();
    }

    public static double calculaMedia(double n1, double n2, double n3, char l) {
        if (l == 'A') {
            return (n1 + n2 + n3) / 3;
        } else {
            return (n1 * 5 + n2 * 3 + n3 * 2) / 10;
        }
    }
}
