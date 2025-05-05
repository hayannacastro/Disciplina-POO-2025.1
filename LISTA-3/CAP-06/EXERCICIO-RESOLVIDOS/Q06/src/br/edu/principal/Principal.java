package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] vet = new int[10];
        int aux;

        for (int i = 0; i < 10; i++) {
            vet[i] = scanner.nextInt();
        }

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9 - i; j++) {
                if (vet[j] < vet[j + 1]) {
                    aux = vet[j];
                    vet[j] = vet[j + 1];
                    vet[j + 1] = aux;
                }
            }
        }

        System.out.print("Ordenado: ");
        for (int i = 0; i < 10; i++) {
            System.out.print(vet[i] + " ");
        }
    }
}
