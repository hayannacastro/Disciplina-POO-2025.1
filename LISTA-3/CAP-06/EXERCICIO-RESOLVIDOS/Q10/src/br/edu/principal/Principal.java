package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String[] gabarito = new String[8];
        String[] resposta = new String[8];
        int[] numAluno = new int[10];
        int pontos, totAprovados = 0, percAprovados;
        
        
        for (int i = 0; i < 8; i++) {
            System.out.print("Digite a resposta da questão " + (i + 1) + ": ");
            gabarito[i] = scanner.nextLine().toUpperCase(); 
        }
        
        
        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o número do " + (i + 1) + "º aluno: ");
            numAluno[i] = scanner.nextInt();
            scanner.nextLine();  
            
            pontos = 0;
            for (int j = 0; j < 8; j++) {
                System.out.print("Digite a resposta do aluno " + numAluno[i] + " para a questão " + (j + 1) + ": ");
                resposta[j] = scanner.nextLine().toUpperCase();  
                
                if (resposta[j].equals(gabarito[j])) {
                    pontos++;
                }
            }
            
            System.out.println("A nota do aluno " + numAluno[i] + " foi " + pontos);
            
            
            if (pontos >= 6) {
                totAprovados++;
            }
        }
        
        
        percAprovados = (totAprovados * 100) / 10;
        System.out.println("O percentual de alunos aprovados é " + percAprovados + "%");
    }
}
