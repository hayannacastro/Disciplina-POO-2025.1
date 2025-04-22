package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Variáveis para armazenar as notas
        double nota1, nota2, nota3, nota4, media;

        // Solicita as notas ao aluno
        System.out.println("Digite a primeira nota:");
        nota1 = scanner.nextDouble();
        
        System.out.println("Digite a segunda nota:");
        nota2 = scanner.nextDouble();
        
        System.out.println("Digite a terceira nota:");
        nota3 = scanner.nextDouble();
        
        System.out.println("Digite a quarta nota:");
        nota4 = scanner.nextDouble();
        
        // Calcula a média aritmética
        media = (nota1 + nota2 + nota3 + nota4) / 4;

        // Exibe a média
        System.out.println("Média do aluno: " + media);

        // Verifica se o aluno foi aprovado ou reprovado
        if (media >= 7) {
            System.out.println("Aprovado!");
        } else {
            System.out.println("Reprovado!");
        }

        scanner.close();
    }
}
