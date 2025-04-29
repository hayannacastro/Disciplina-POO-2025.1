package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a;
        do {
            a = scanner.nextInt();
        } while (a <= 1);
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int result = divisores(a, b, c);
        System.out.println("Soma dos inteiros = " + result);
        scanner.close();
    }

    public static int divisores(int a, int b, int c) {
        int s = 0;
        for (int i = b; i <= c; i++) {
            if (i % a == 0) {
                s += i;
            }
        }
        return s;
    }
}
