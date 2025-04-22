package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Leitura do número de termos
        System.out.print("Digite o número de termos: ");
        int numTermos = scanner.nextInt();
        
        // Inicialização dos primeiros três números
        int num1 = 2, num2 = 7, num3 = 3;
        
        // Exibição dos três primeiros números
        System.out.print(num1 + " ");
        System.out.print(num2 + " ");
        System.out.print(num3 + " ");
        
        // Variável para controlar a quantidade de termos já exibidos
        int i = 4;
        
        // Gerar a sequência
        while (i <= numTermos) {
            num1 = num1 * 2;
            System.out.print(num1 + " ");
            i++;
            
            if (i <= numTermos) {
                num2 = num2 * 3;
                System.out.print(num2 + " ");
                i++;
            }
            
            if (i <= numTermos) {
                num3 = num3 * 4;
                System.out.print(num3 + " ");
                i++;
            }
        }
        
        scanner.close();
    }
}
