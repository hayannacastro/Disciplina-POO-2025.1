package br.edu.principal;

public class Principal {
    public static void main(String[] args) {
        // Variáveis para os dois primeiros números da sequência
        int num1 = 0, num2 = 1, res;
        
        // Exibir os dois primeiros números da sequência
        System.out.print(num1 + " ");
        System.out.print(num2 + " ");
        
        // Calcular e exibir os próximos números da sequência de Fibonacci
        for (int cont = 3; cont <= 8; cont++) {
            res = num1 + num2;
            System.out.print(res + " ");
            
            // Atualizar os números para os próximos cálculos
            num1 = num2;
            num2 = res;
        }
    }
}
