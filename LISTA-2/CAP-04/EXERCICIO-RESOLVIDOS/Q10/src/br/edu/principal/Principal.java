package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        // Criando o objeto Scanner para ler entradas do usuário
        Scanner scanner = new Scanner(System.in);

        // Variáveis para armazenar os dados das duas datas
        int d1, m1, a1, d2, m2, a2;

        // Solicita a primeira data
        System.out.println("Digite a primeira data:");
        System.out.print("Dia (dd): ");
        d1 = scanner.nextInt();
        System.out.print("Mês (mm): ");
        m1 = scanner.nextInt();
        System.out.print("Ano (aaaa): ");
        a1 = scanner.nextInt();

        // Solicita a segunda data
        System.out.println("Digite a segunda data:");
        System.out.print("Dia (dd): ");
        d2 = scanner.nextInt();
        System.out.print("Mês (mm): ");
        m2 = scanner.nextInt();
        System.out.print("Ano (aaaa): ");
        a2 = scanner.nextInt();

        // Comparando as duas datas
        if (a1 > a2) {
            System.out.println("A maior data é: " + d1 + "-" + m1 + "-" + a1);
        } else if (a2 > a1) {
            System.out.println("A maior data é: " + d2 + "-" + m2 + "-" + a2);
        } else if (m1 > m2) {
            System.out.println("A maior data é: " + d1 + "-" + m1 + "-" + a1);
        } else if (m2 > m1) {
            System.out.println("A maior data é: " + d2 + "-" + m2 + "-" + a2);
        } else if (d1 > d2) {
            System.out.println("A maior data é: " + d1 + "-" + m1 + "-" + a1);
        } else if (d2 > d1) {
            System.out.println("A maior data é: " + d2 + "-" + m2 + "-" + a2);
        } else {
            System.out.println("As datas são iguais!");
        }

        // Fechando o scanner
        scanner.close();
    }
}
