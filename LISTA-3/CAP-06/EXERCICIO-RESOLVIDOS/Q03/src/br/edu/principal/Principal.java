package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] vet1 = new int[10];
        int[] vet2 = new int[10];
        int[] vet3 = new int[20];
        int j = 0;

        for (int i = 0; i < 10; i++) {
            vet1[i] = scanner.nextInt();
        }

        for (int i = 0; i < 10; i++) {
            vet2[i] = scanner.nextInt();
        }

        for (int i = 0; i < 10; i++) {
            vet3[j++] = vet1[i];
            vet3[j++] = vet2[i];
        }

        for (int i = 0; i < 20; i++) {
            System.out.print(vet3[i] + " ");
        }
    }
}
