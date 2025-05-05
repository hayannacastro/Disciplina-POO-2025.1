package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] qtd = new int[10];
        double[] preco = new double[10];
        double totGeral = 0, comissao, totVend;
        int maiorQtd = 0, indMaior = 0;

        for (int i = 0; i < 10; i++) {
            qtd[i] = scanner.nextInt();
            preco[i] = scanner.nextDouble();
        }

        for (int i = 0; i < 10; i++) {
            totVend = qtd[i] * preco[i];
            System.out.println(qtd[i] + " " + preco[i] + " " + totVend);
            totGeral += totVend;
            
            if (qtd[i] > maiorQtd) {
                maiorQtd = qtd[i];
                indMaior = i;
            }
        }

        comissao = totGeral * 0.05;
        System.out.println(totGeral + " " + comissao);
        System.out.println(preco[indMaior] + " " + (indMaior + 1));
    }
}
