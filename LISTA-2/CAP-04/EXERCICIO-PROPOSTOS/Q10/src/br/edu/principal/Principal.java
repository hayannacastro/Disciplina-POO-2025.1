package br.edu.principal;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o custo de fábrica do carro: ");
        double custoFabrica = scanner.nextDouble();
        double precoConsumidor;

        if (custoFabrica <= 12000) {
            precoConsumidor = custoFabrica + (custoFabrica * 0.05); 
        } else if (custoFabrica <= 25000) {
            precoConsumidor = custoFabrica + (custoFabrica * 0.10) + (custoFabrica * 0.15);
        } else {
            precoConsumidor = custoFabrica + (custoFabrica * 0.15) + (custoFabrica * 0.20); 
        }

        System.out.printf("Custo de fábrica: R$ %.2f\n", custoFabrica);
        System.out.printf("Preço ao consumidor: R$ %.2f\n", precoConsumidor);
        
        scanner.close();
    }
}
