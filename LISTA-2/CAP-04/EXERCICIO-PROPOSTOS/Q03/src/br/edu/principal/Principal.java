package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        // Criação do scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário que digite os dois números
        System.out.println("Digite o primeiro número:");
        int numero1 = scanner.nextInt();

        System.out.println("Digite o segundo número:");
        int numero2 = scanner.nextInt();

        // Compara os números e exibe o menor
        if (numero1 < numero2) {
            System.out.println("O menor número é: " + numero1);
        } else if (numero2 < numero1) {
            System.out.println("O menor número é: " + numero2);
        } else {
            System.out.println("Os dois números são iguais.");
        }

        // Fecha o scanner
        scanner.close();
    }
}
