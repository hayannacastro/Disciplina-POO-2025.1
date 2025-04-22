package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        // Scanner para entrada de dados
        Scanner scanner = new Scanner(System.in);

        // Declaração das variáveis
        double num1, num2, num3, num4;

        // Entrada dos três números em ordem crescente
        System.out.print("Digite três números em ordem crescente:\n");
        System.out.print("Digite o primeiro número: ");
        num1 = scanner.nextDouble();

        System.out.print("Digite o segundo número: ");
        num2 = scanner.nextDouble();

        System.out.print("Digite o terceiro número: ");
        num3 = scanner.nextDouble();

        // Entrada do quarto número (fora de ordem)
        System.out.print("Digite um número (fora de ordem): ");
        num4 = scanner.nextDouble();

        // Exibição dos números em ordem decrescente
        if (num4 > num3) {
            System.out.println("A ordem decrescente é: " + num4 + " - " + num3 + " - " + num2 + " - " + num1);
        } else if (num4 > num2 && num4 < num3) {
            System.out.println("A ordem decrescente é: " + num3 + " - " + num4 + " - " + num2 + " - " + num1);
        } else if (num4 > num1 && num4 < num2) {
            System.out.println("A ordem decrescente é: " + num3 + " - " + num2 + " - " + num4 + " - " + num1);
        } else if (num4 < num1) {
            System.out.println("A ordem decrescente é: " + num3 + " - " + num2 + " - " + num1 + " - " + num4);
        }

        // Fechando o scanner
        scanner.close();
    }
}
