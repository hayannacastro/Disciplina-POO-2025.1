package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
      
        Scanner scanner = new Scanner(System.in);

        int num;


        System.out.print("Digite um número: ");
        num = scanner.nextInt();

    
        if (num % 2 == 0) {
            System.out.println("O número é par");
        } else {
            System.out.println("O número é ímpar");
        }


        scanner.close();
    }
}
