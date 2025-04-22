package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        
        double notaTrab, avalSem, exameFinal, media;

       
        System.out.print("Digite a nota do trabalho de laboratório: ");
        notaTrab = scanner.nextDouble();

        System.out.print("Digite a nota da avaliação semestral: ");
        avalSem = scanner.nextDouble();

        System.out.print("Digite a nota do exame final: ");
        exameFinal = scanner.nextDouble();

       
        media = (notaTrab * 2 + avalSem * 3 + exameFinal * 5) / 10;


        System.out.printf("Média ponderada: %.2f\n", media);


        if (media >= 8.0 && media <= 10.0) {
            System.out.println("Obteve conceito A");
        } else if (media >= 7.0 && media < 8.0) {
            System.out.println("Obteve conceito B");
        } else if (media >= 6.0 && media < 7.0) {
            System.out.println("Obteve conceito C");
        } else if (media >= 5.0 && media < 6.0) {
            System.out.println("Obteve conceito D");
        } else if (media >= 0.0 && media < 5.0) {
            System.out.println("Obteve conceito E");
        } else {
            System.out.println("Média inválida.");
        }

        scanner.close();
    }
}
