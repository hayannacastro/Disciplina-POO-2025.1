package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        int n, num, fat;
        
        System.out.print("Digite o número de valores: ");
        n = scanner.nextInt();
        
        System.out.println("Valor | Fatorial");
        System.out.println("-------------------");
        
     
        for (int i = 1; i <= n; i++) {
            
            System.out.print("Digite um número inteiro e positivo: ");
            num = scanner.nextInt();

            fat = 1;
            
            for (int j = 1; j <= num; j++) {
                fat *= j;
            }
            
            
            System.out.printf("%5d | %8d%n", num, fat);
        }
        
        
        scanner.close();
    }
}
