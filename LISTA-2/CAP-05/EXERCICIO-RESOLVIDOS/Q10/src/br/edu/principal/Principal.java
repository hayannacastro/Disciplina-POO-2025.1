package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Variáveis para as estatísticas
        int qtde = 0;  // Quantidade de jogadores com idade inferior a 18 anos
        int tot80 = 0;  // Total de jogadores com peso superior a 80 kg
        double media_idade, media_altura, porc;
        
        // Total de jogadores do campeonato (5 times x 11 jogadores)
        int totalJogadores = 5 * 11;
        
        // Acumuladores
        double somaAltura = 0;
        
        // Processamento dos 5 times
        for (int cont_time = 1; cont_time <= 5; cont_time++) {
            media_idade = 0;
            System.out.println("Time " + cont_time + ":");
            
            // Processamento dos 11 jogadores de cada time
            for (int cont_jog = 1; cont_jog <= 11; cont_jog++) {
                System.out.println("Digite a idade, peso e altura do jogador " + cont_jog + ":");
                int idade = scanner.nextInt();
                double peso = scanner.nextDouble();
                double altura = scanner.nextDouble();
                
                // Verifica idade inferior a 18 anos
                if (idade < 18) {
                    qtde++;
                }

                // Soma as idades para calcular a média da idade do time
                media_idade += idade;

                // Soma as alturas para calcular a média das alturas
                somaAltura += altura;

                // Conta jogadores com peso superior a 80 kg
                if (peso > 80) {
                    tot80++;
                }
            }

            // Calcula a média da idade do time
            media_idade /= 11;
            System.out.println("Média de idade do time " + cont_time + ": " + media_idade);
        }

        // Calcula a média da altura de todos os jogadores
        media_altura = somaAltura / totalJogadores;
        System.out.println("Média das alturas dos jogadores do campeonato: " + media_altura);

        // Calcula a porcentagem de jogadores com mais de 80 kg
        porc = (tot80 * 100.0) / totalJogadores;
        System.out.println("Porcentagem de jogadores com mais de 80 kg: " + porc + "%");

        // Exibe a quantidade de jogadores com idade inferior a 18 anos
        System.out.println("Quantidade de jogadores com idade inferior a 18 anos: " + qtde);
        
        scanner.close();
    }
}
