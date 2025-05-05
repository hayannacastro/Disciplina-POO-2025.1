package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] X = new int[10];
        int[] Y = new int[10];
        int[] U = new int[20];
        int[] D = new int[10];
        int[] S = new int[10];
        int[] P = new int[10];
        int[] IT = new int[10];
        int cont_u = 0, cont_d = 0, cont_i = 0;

        for (int i = 0; i < 10; i++) {
            X[i] = scanner.nextInt();
            Y[i] = scanner.nextInt();
        }

        for (int i = 0; i < 10; i++) {
            if (!contains(U, X[i], cont_u)) {
                U[cont_u++] = X[i];
            }
        }

        for (int i = 0; i < 10; i++) {
            if (!contains(U, Y[i], cont_u)) {
                U[cont_u++] = Y[i];
            }
        }

        System.out.print("União: ");
        for (int i = 0; i < cont_u; i++) {
            System.out.print(U[i] + " ");
        }
        System.out.println();

        for (int i = 0; i < 10; i++) {
            if (!contains(Y, X[i], 10) && !contains(D, X[i], cont_d)) {
                D[cont_d++] = X[i];
            }
        }

        System.out.print("Diferença: ");
        for (int i = 0; i < cont_d; i++) {
            System.out.print(D[i] + " ");
        }
        System.out.println();

        System.out.print("Soma: ");
        for (int i = 0; i < 10; i++) {
            S[i] = X[i] + Y[i];
            System.out.print(S[i] + " ");
        }
        System.out.println();

        System.out.print("Produto: ");
        for (int i = 0; i < 10; i++) {
            P[i] = X[i] * Y[i];
            System.out.print(P[i] + " ");
        }
        System.out.println();

        for (int i = 0; i < 10; i++) {
            if (contains(Y, X[i], 10) && !contains(IT, X[i], cont_i)) {
                IT[cont_i++] = X[i];
            }
        }

        System.out.print("Intersecção: ");
        for (int i = 0; i < cont_i; i++) {
            System.out.print(IT[i] + " ");
        }
        System.out.println();
    }

    public static boolean contains(int[] arr, int value, int size) {
        for (int i = 0; i < size; i++) {
            if (arr[i] == value) {
                return true;
            }
        }
        return false;
    }
}
