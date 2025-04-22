package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        // Criando o objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);
        
        // Declaração das variáveis
        int n, num, fat;
        
        // Lê o número N (quantos valores o usuário vai fornecer)
        System.out.print("Digite o número de valores: ");
        n = scanner.nextInt();
        
        // Exibe o cabeçalho da tabela
        System.out.println("Valor | Fatorial");
        System.out.println("-------------------");
        
        // Laço para ler N números e calcular o fatorial de cada um
        for (int i = 1; i <= n; i++) {
            // Lê o número para o qual será calculado o fatorial
            System.out.print("Digite um número inteiro e positivo: ");
            num = scanner.nextInt();
            
            // Inicializa o fatorial como 1
            fat = 1;
            
            // Calcula o fatorial do número
            for (int j = 1; j <= num; j++) {
                fat *= j;
            }
            
            // Exibe o valor e seu fatorial
            System.out.printf("%5d | %8d%n", num, fat);
        }
        
        // Fecha o scanner
        scanner.close();
    }
}
