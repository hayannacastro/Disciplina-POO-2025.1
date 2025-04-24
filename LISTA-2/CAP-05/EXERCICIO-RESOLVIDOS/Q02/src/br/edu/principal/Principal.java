package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        
        int n; 
        double e = 1.0; 
        
        
        System.out.print("Digite um valor inteiro e positivo para N: ");
        n = scanner.nextInt();
        
       
        if (n <= 0) {
            System.out.println("O valor de N deve ser um número inteiro positivo.");
        } else {
            
            for (int i = 1; i <= n; i++) {
                double fat = 1;
             
                for (int j = 1; j <= i; j++) {
                    fat *= j;
                }
                
                e += 1.0 / fat;
            }
            
            
            System.out.printf("O valor de E para N = %d é: %.10f%n", n, e);
        }
        
      
        scanner.close();
    }
}
