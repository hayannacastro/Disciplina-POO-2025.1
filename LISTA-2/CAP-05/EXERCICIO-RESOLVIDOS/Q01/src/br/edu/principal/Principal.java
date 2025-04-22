package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        // Criando o objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);
        
        // Declaração das variáveis
        int anoAtual;
        double salario = 1000.00; // Salário inicial
        double percentual = 1.5 / 100; // Percentual de aumento inicial (1,5%)
        double novoSalario;
        
        // Lê o ano atual fornecido pelo usuário
        System.out.print("Digite o ano atual: ");
        anoAtual = scanner.nextInt();
        
        // O salário do funcionário após o aumento de 2006
        novoSalario = salario + (percentual * salario); // Aumento de 1,5% em 2006
        
        // A partir de 2007, os aumentos seguem a regra de dobrar o percentual a cada ano
        for (int i = 2007; i <= anoAtual; i++) {
            percentual = 2 * percentual; // Dobro do percentual anterior
            novoSalario += percentual * novoSalario; // Aumento do salário
        }
        
        // Exibe o novo salário
        System.out.printf("O salário atual do funcionário em %d é: R$ %.2f%n", anoAtual, novoSalario);
        
        // Fecha o scanner
        scanner.close();
    }
}
