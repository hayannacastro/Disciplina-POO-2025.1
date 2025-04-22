package br.edu.principal;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Leitura dos dados
        System.out.print("Digite o número de termos da série: ");
        int numTermos = scanner.nextInt();
        System.out.print("Digite o valor de X: ");
        double x = scanner.nextDouble();
        
        // Variáveis para cálculo
        double s = 0; // Resultado da série
        int denominador = 1; // Controla o sinal e o valor do fatorial
        
        // Laço para calcular cada termo da série
        for (int i = 1; i <= numTermos; i++) {
            int expoente = i + 1;
            double fat = 1;
            
            // Calculando o fatorial
            for (int j = 1; j <= expoente; j++) {
                fat *= j;
            }
            
            // Alternando os sinais e adicionando o termo à soma
            if (expoente % 2 == 0) {
                s -= Math.pow(x, expoente) / fat; // Sinal negativo para expoentes pares
            } else {
                s += Math.pow(x, expoente) / fat; // Sinal positivo para expoentes ímpares
            }

            // Alterando o denominador (sinal) a cada 4 termos
            if (denominador == 4) {
                denominador = -1;
            } else if (denominador == 1) {
                denominador = 1;
            }

            // Alterna o sinal a cada 4 termos
            if (denominador == 1) {
                denominador = 2;
            } else {
                denominador = 3;
            }
        }

        // Exibe o resultado da série
        System.out.println("O valor da série é: " + s);
        
        // Fechar o scanner
        scanner.close();
    }
}
