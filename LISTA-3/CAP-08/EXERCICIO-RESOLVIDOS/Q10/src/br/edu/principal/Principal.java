package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        double s = sequencia(num);
        System.out.println("S = " + s);
        scanner.close();
    }

    public static double sequencia(int n) {
        double seq = 1.0;
        for (int a = 1; a <= n; a++) {
            int f = 1;
            for (int b = 1; b <= a; b++) {
                f *= b;
            }
            seq += 1.0 / f;
        }
        return seq;
    }
}
