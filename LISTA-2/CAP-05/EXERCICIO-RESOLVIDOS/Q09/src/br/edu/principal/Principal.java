package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int ta = 0, te = 0, tr = 0;  // Contadores de alunos Aprovados, Exame e Reprovados
        double totalClasse = 0;  // Soma das médias para calcular a média da classe
        double media, n1, n2;

        // Leitura das notas dos 6 alunos
        for (int cont = 1; cont <= 6; cont++) {
            System.out.println("Digite as duas notas do aluno " + cont + ":");
            n1 = scanner.nextDouble();
            n2 = scanner.nextDouble();

            // Calculando a média
            media = (n1 + n2) / 2;
            System.out.println("Média do aluno: " + media);

            // Verificando a situação do aluno e acumulando os totais
            if (media <= 3) {
                tr++;  // Aluno reprovado
                System.out.println("Reprovado");
            } else if (media > 3 && media < 7) {
                te++;  // Aluno de exame
                System.out.println("Exame");
            } else {
                ta++;  // Aluno aprovado
                System.out.println("Aprovado");
            }

            // Acumulando o total de médias para calcular a média da classe
            totalClasse += media;
        }

        // Calculando e mostrando os resultados finais
        double mediaClasse = totalClasse / 6;
        System.out.println("Total de alunos reprovados: " + tr);
        System.out.println("Total de alunos em exame: " + te);
        System.out.println("Total de alunos aprovados: " + ta);
        System.out.println("Média da classe: " + mediaClasse);
        
        scanner.close();
    }
}
