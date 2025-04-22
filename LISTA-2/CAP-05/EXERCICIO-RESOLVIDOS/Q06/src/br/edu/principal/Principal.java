package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Definindo o salário mínimo
        double salarioMinimo = 450.00;

        // Processando os dados de 10 funcionários
        for (int cont = 1; cont <= 10; cont++) {
            // Leitura dos dados do funcionário
            System.out.println("Digite os dados do funcionário " + cont);
            System.out.print("Código: ");
            int codigo = scanner.nextInt();
            System.out.print("Número de horas trabalhadas: ");
            double nht = scanner.nextDouble();
            System.out.print("Turno (M - matutino, V - vespertino, N - noturno): ");
            char turno = scanner.next().charAt(0);
            System.out.print("Categoria (G - gerente, O - operário): ");
            char categoria = scanner.next().charAt(0);

            // Validação do turno
            while (turno != 'M' && turno != 'V' && turno != 'N') {
                System.out.print("Turno inválido. Digite novamente (M, V ou N): ");
                turno = scanner.next().charAt(0);
            }

            // Validação da categoria
            while (categoria != 'G' && categoria != 'O') {
                System.out.print("Categoria inválida. Digite novamente (G ou O): ");
                categoria = scanner.next().charAt(0);
            }

            // Cálculo do valor da hora trabalhada
            double valorHora = 0.0;
            if (categoria == 'G') {
                if (turno == 'N') {
                    valorHora = salarioMinimo * 18 / 100;
                } else {
                    valorHora = salarioMinimo * 15 / 100;
                }
            } else if (categoria == 'O') {
                if (turno == 'N') {
                    valorHora = salarioMinimo * 13 / 100;
                } else {
                    valorHora = salarioMinimo * 10 / 100;
                }
            }

            // Cálculo do salário inicial
            double salarioInicial = nht * valorHora;

            // Cálculo do auxílio alimentação
            double auxilioAlimentacao = 0.0;
            if (salarioInicial <= 300) {
                auxilioAlimentacao = salarioInicial * 20 / 100;
            } else if (salarioInicial < 600) {
                auxilioAlimentacao = salarioInicial * 15 / 100;
            } else {
                auxilioAlimentacao = salarioInicial * 5 / 100;
            }

            // Cálculo do salário final
            double salarioFinal = salarioInicial + auxilioAlimentacao;

            // Exibição dos resultados
            System.out.println("\nResumo do Funcionário:");
            System.out.println("Código: " + codigo);
            System.out.println("Número de horas trabalhadas: " + nht);
            System.out.println("Valor da hora trabalhada: R$ " + String.format("%.2f", valorHora));
            System.out.println("Salário inicial: R$ " + String.format("%.2f", salarioInicial));
            System.out.println("Auxílio alimentação: R$ " + String.format("%.2f", auxilioAlimentacao));
            System.out.println("Salário final: R$ " + String.format("%.2f", salarioFinal));
            System.out.println("-------------------------------------\n");
        }

        // Fechar o scanner
        scanner.close();
    }
}
