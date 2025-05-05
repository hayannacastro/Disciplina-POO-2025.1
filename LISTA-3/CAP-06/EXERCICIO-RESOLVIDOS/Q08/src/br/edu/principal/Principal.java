package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] X = new int[5];
        int[] Y = new int[5];
        int[] R = new int[10];
        int aux;

        for (int i = 0; i < 5; i++) {
            X[i] = scanner.nextInt();
        }

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 4; j++) {
                if (X[j] > X[j + 1]) {
                    aux = X[j];
                    X[j] = X[j + 1];
                    X[j + 1] = aux;
                }
            }
        }

        for (int i = 0; i < 5; i++) {
            Y[i] = scanner.nextInt();
        }

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 4; j++) {
                if (Y[j] > Y[j + 1]) {
                    aux = Y[j];
                    Y[j] = Y[j + 1];
                    Y[j + 1] = aux;
                }
            }
        }

        int j = 0;
        for (int i = 0; i < 5; i++) {
            R[j++] = X[i];
            R[j++] = Y[i];
        }

        for (int i = 0; i < 9; i++) {
            for (int k = 0; k < 9 - i; k++) {
                if (R[k] > R[k + 1]) {
                    aux = R[k];
                    R[k] = R[k + 1];
                    R[k + 1] = aux;
                }
            }
        }

        System.out.print("X Ordenado: ");
        for (int i = 0; i < 5; i++) {
            System.out.print(X[i] + " ");
        }
        System.out.println();

        System.out.print("Y Ordenado: ");
        for (int i = 0; i < 5; i++) {
            System.out.print(Y[i] + " ");
        }
        System.out.println();

        System.out.print("Resultado: ");
        for (int i = 0; i < 10; i++) {
            System.out.print(R[i] + " ");
        }
    }
}
