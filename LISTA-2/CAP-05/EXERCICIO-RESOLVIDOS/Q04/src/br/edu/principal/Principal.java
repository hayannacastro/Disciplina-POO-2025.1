package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Declaração das variáveis
        int cod, numVeiculos, numAcidentes;
        int maior = 0, menor = Integer.MAX_VALUE;
        int cidMaior = 0, cidMenor = 0;
        int somaVeiculos = 0;
        int somaAcidentes = 0;
        int contAcidentes = 0;

        // Laço para ler os dados das 5 cidades
        for (int cont = 1; cont <= 5; cont++) {
            // Leitura dos dados da cidade
            System.out.print("Digite o código da cidade: ");
            cod = scanner.nextInt();
            System.out.print("Digite o número de veículos de passeio: ");
            numVeiculos = scanner.nextInt();
            System.out.print("Digite o número de acidentes com vítimas: ");
            numAcidentes = scanner.nextInt();

            // Calcular o maior e o menor índice de acidentes
            if (cont == 1) {
                maior = numAcidentes;
                cidMaior = cod;
                menor = numAcidentes;
                cidMenor = cod;
            } else {
                if (numAcidentes > maior) {
                    maior = numAcidentes;
                    cidMaior = cod;
                }
                if (numAcidentes < menor) {
                    menor = numAcidentes;
                    cidMenor = cod;
                }
            }

            // Somar o total de veículos
            somaVeiculos += numVeiculos;

            // Somar o total de acidentes nas cidades com menos de 2000 veículos
            if (numVeiculos < 2000) {
                somaAcidentes += numAcidentes;
                contAcidentes++;
            }
        }

        // Exibindo os resultados
        System.out.println("Maior índice de acidentes: " + maior + " na cidade de " + cidMaior);
        System.out.println("Menor índice de acidentes: " + menor + " na cidade de " + cidMenor);

        // Calculando a média de veículos
        double mediaVeiculos = (double) somaVeiculos / 5;
        System.out.println("Média de veículos nas 5 cidades: " + mediaVeiculos);

        // Calculando a média de acidentes nas cidades com menos de 2000 veículos
        if (contAcidentes == 0) {
            System.out.println("Não foi digitada nenhuma cidade com menos de 2000 veículos.");
        } else {
            double mediaAcidentes = (double) somaAcidentes / contAcidentes;
            System.out.println("Média de acidentes nas cidades com menos de 2000 veículos: " + mediaAcidentes);
        }

        // Fechar o scanner
        scanner.close();
    }
}
