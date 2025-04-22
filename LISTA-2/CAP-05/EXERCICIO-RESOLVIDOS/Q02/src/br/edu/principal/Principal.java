package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        // Criando o objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);
        
        // Declaração das variáveis
        int n; // valor de N
        double e = 1.0; // Inicializando o valor de e com 1 (primeiro termo)
        
        // Lê o valor de N fornecido pelo usuário
        System.out.print("Digite um valor inteiro e positivo para N: ");
        n = scanner.nextInt();
        
        // Verifica se o valor de N é positivo
        if (n <= 0) {
            System.out.println("O valor de N deve ser um número inteiro positivo.");
        } else {
            // Calcular o valor de E utilizando a fórmula
            for (int i = 1; i <= n; i++) {
                double fat = 1; // Inicializa o fatorial
                // Calculando o fatorial de i
                for (int j = 1; j <= i; j++) {
                    fat *= j;
                }
                // Soma o termo 1/fatorial de i à variável e
                e += 1.0 / fat;
            }
            
            // Exibe o resultado de E
            System.out.printf("O valor de E para N = %d é: %.10f%n", n, e);
        }
        
        // Fecha o scanner
        scanner.close();
    }
}
