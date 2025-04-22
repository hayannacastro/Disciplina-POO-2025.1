package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);
        
   
        int anoAtual;
        double salario = 1000.00;
        double percentual = 1.5 / 100; 
        double novoSalario;
        
       
        System.out.print("Digite o ano atual: ");
        anoAtual = scanner.nextInt();
        
        novoSalario = salario + (percentual * salario); 
        
        
        for (int i = 2007; i <= anoAtual; i++) {
            percentual = 2 * percentual; 
            novoSalario += percentual * novoSalario; 
        }
        
        
        System.out.printf("O salário atual do funcionário em %d é: R$ %.2f%n", anoAtual, novoSalario);
        
       
        scanner.close();
    }
}
