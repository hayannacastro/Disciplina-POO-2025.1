package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double precoAntigo = scanner.nextDouble();
        double precoAtual = scanner.nextDouble();
        double acrescimo = calculoReajuste(precoAntigo, precoAtual);
        System.out.println("Acréscimo percentual = " + acrescimo + "%");
        scanner.close();
    }

    public static double calculoReajuste(double pa, double pn) {
        return ((pn - pa) * 100) / pa;
    }
}
