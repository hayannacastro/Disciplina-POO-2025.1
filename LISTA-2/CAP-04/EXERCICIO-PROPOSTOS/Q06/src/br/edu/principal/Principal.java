package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        // Scanner para entrada de dados
        Scanner scanner = new Scanner(System.in);

        // Declaração da variável
        int num;

        // Entrada do número
        System.out.print("Digite um número: ");
        num = scanner.nextInt();

        // Verificação se o número é par ou ímpar
        if (num % 2 == 0) {
            System.out.println("O número é par");
        } else {
            System.out.println("O número é ímpar");
        }

        // Fechar o scanner
        scanner.close();
    }
}
