package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

   
        double num1, num2, soma, raiz;
        int op;

  
        System.out.println("MENU:");
        System.out.println("1 - Somar dois números");
        System.out.println("2 - Raiz quadrada de um número");
        System.out.print("Digite sua opção: ");
        op = scanner.nextInt(); 

      
        if (op == 1) {
  
            System.out.print("Digite um valor para o primeiro número: ");
            num1 = scanner.nextDouble();
            System.out.print("Digite um valor para o segundo número: ");
            num2 = scanner.nextDouble();
            soma = num1 + num2;
            System.out.println("A soma de " + num1 + " e " + num2 + " é " + soma);
        } else if (op == 2) {
           
            System.out.print("Digite um valor: ");
            num1 = scanner.nextDouble();
            if (num1 < 0) {
                System.out.println("Não é possível calcular a raiz quadrada de um número negativo!");
            } else {
                raiz = Math.sqrt(num1); 
                System.out.println("A raiz quadrada de " + num1 + " é " + raiz);
            }
        } else {
           
            System.out.println("Opção inválida!");
        }

 
        scanner.close();
    }
}
