package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        // Scanner para entrada de dados
        Scanner scanner = new Scanner(System.in);

        // Declaração das variáveis
        double A, B, C;
        int I;

        // Entrada dos valores A, B e C
        System.out.print("Digite um valor para A: ");
        A = scanner.nextDouble();

        System.out.print("Digite um valor para B: ");
        B = scanner.nextDouble();

        System.out.print("Digite um valor para C: ");
        C = scanner.nextDouble();

        // Entrada do valor de I
        System.out.print("Digite um valor para I (1, 2 ou 3): ");
        I = scanner.nextInt();

        // Verificação do valor de I e exibição das ordens
        if (I == 1) { // Ordem crescente
            if (A < B && A < C) {
                if (B < C) {
                    System.out.println("A ordem crescente dos números é: " + A + " - " + B + " - " + C);
                } else {
                    System.out.println("A ordem crescente dos números é: " + A + " - " + C + " - " + B);
                }
            } else if (B < A && B < C) {
                if (A < C) {
                    System.out.println("A ordem crescente dos números é: " + B + " - " + A + " - " + C);
                } else {
                    System.out.println("A ordem crescente dos números é: " + B + " - " + C + " - " + A);
                }
            } else {
                if (A < B) {
                    System.out.println("A ordem crescente dos números é: " + C + " - " + A + " - " + B);
                } else {
                    System.out.println("A ordem crescente dos números é: " + C + " - " + B + " - " + A);
                }
            }
        } else if (I == 2) { // Ordem decrescente
            if (A > B && A > C) {
                if (B > C) {
                    System.out.println("A ordem decrescente dos números é: " + A + " - " + B + " - " + C);
                } else {
                    System.out.println("A ordem decrescente dos números é: " + A + " - " + C + " - " + B);
                }
            } else if (B > A && B > C) {
                if (A > C) {
                    System.out.println("A ordem decrescente dos números é: " + B + " - " + A + " - " + C);
                } else {
                    System.out.println("A ordem decrescente dos números é: " + B + " - " + C + " - " + A);
                }
            } else {
                if (A > B) {
                    System.out.println("A ordem decrescente dos números é: " + C + " - " + A + " - " + B);
                } else {
                    System.out.println("A ordem decrescente dos números é: " + C + " - " + B + " - " + A);
                }
            }
        } else if (I == 3) { // Maior número entre os outros
            if (A > B && A > C) {
                System.out.println("A ordem desejada é: " + B + " - " + A + " - " + C);
            } else if (B > A && B > C) {
                System.out.println("A ordem desejada é: " + A + " - " + B + " - " + C);
            } else {
                System.out.println("A ordem desejada é: " + A + " - " + C + " - " + B);
            }
        } else {
            System.out.println("Valor de I inválido! Digite 1, 2 ou 3.");
        }

        // Fechar o scanner
        scanner.close();
    }
}
