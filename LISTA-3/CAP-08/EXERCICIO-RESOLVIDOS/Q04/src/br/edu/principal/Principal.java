package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int seg = scanner.nextInt();
        int[] tempo = new int[3];
        transformacao(seg, tempo);
        System.out.println(tempo[0] + "h " + tempo[1] + "m " + tempo[2] + "s");
        scanner.close();
    }

    public static void transformacao(int segundos, int[] tempo) {
        tempo[0] = segundos / 3600;
        int r = segundos % 3600;
        tempo[1] = r / 60;
        tempo[2] = r % 60;
    }
}
