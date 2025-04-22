package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        // Scanner para entrada de dados
        Scanner scanner = new Scanner(System.in);

        // Declaração das variáveis
        double num1, num2, soma, raiz;
        int op;

        // Exibição do menu
        System.out.println("MENU:");
        System.out.println("1 - Somar dois números");
        System.out.println("2 - Raiz quadrada de um número");
        System.out.print("Digite sua opção: ");
        op = scanner.nextInt(); // Leitura da opção escolhida

        // Verificação da opção escolhida
        if (op == 1) {
            // Opção 1: Somar dois números
            System.out.print("Digite um valor para o primeiro número: ");
            num1 = scanner.nextDouble();
            System.out.print("Digite um valor para o segundo número: ");
            num2 = scanner.nextDouble();
            soma = num1 + num2;
            System.out.println("A soma de " + num1 + " e " + num2 + " é " + soma);
        } else if (op == 2) {
            // Opção 2: Raiz quadrada de um número
            System.out.print("Digite um valor: ");
            num1 = scanner.nextDouble();
            if (num1 < 0) {
                System.out.println("Não é possível calcular a raiz quadrada de um número negativo!");
            } else {
                raiz = Math.sqrt(num1); // Calculando a raiz quadrada
                System.out.println("A raiz quadrada de " + num1 + " é " + raiz);
            }
        } else {
            // Caso a opção seja inválida
            System.out.println("Opção inválida!");
        }

        // Fechar o scanner
        scanner.close();
    }
}
