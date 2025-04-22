package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        // Scanner para entrada de dados
        Scanner scanner = new Scanner(System.in);

        // Declaração das variáveis
        double nota1, nota2, nota3, media, notaExame;

        // Entrada das notas
        System.out.print("Digite a primeira nota: ");
        nota1 = scanner.nextDouble();

        System.out.print("Digite a segunda nota: ");
        nota2 = scanner.nextDouble();

        System.out.print("Digite a terceira nota: ");
        nota3 = scanner.nextDouble();

        // Cálculo da média aritmética
        media = (nota1 + nota2 + nota3) / 3;

        // Exibição da média
        System.out.printf("Média aritmética: %.2f\n", media);

        // Verificação da situação do aluno
        if (media >= 0 && media < 3) {
            System.out.println("Reprovado");
        } else if (media >= 3 && media < 7) {
            System.out.println("Exame");
            notaExame = 12 - media;
            System.out.printf("Deve tirar nota %.2f para ser aprovado\n", notaExame);
        } else if (media >= 7 && media <= 10) {
            System.out.println("Aprovado");
        } else {
            System.out.println("Média inválida.");
        }

        scanner.close();
    }
}
