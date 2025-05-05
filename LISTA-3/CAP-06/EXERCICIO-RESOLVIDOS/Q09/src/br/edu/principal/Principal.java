package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int[] voo = new int[12];
        String[] origem = new String[12];
        String[] destino = new String[12];
        int[] lugares = new int[12];
        int op, op2, numVoo, i, j;
        String local;

        for (i = 0; i < 12; i++) {
            System.out.print("Digite o número do voo: ");
            voo[i] = scanner.nextInt();
            scanner.nextLine(); 
            System.out.print("Digite o local de origem: ");
            origem[i] = scanner.nextLine();
            System.out.print("Digite o local de destino: ");
            destino[i] = scanner.nextLine();
            System.out.print("Digite o número de lugares disponíveis: ");
            lugares[i] = scanner.nextInt();
            scanner.nextLine();  
        }

        do {
            System.out.println("1- Consultar");
            System.out.println("2- Reservar");
            System.out.println("3- Finalizar");
            System.out.print("Digite sua opção: ");
            op = scanner.nextInt();

            if (op == 1) {
                System.out.println("1- Consulta por voo");
                System.out.println("2- Consulta por origem");
                System.out.println("3- Consulta por destino");
                System.out.print("Digite sua opção: ");
                op2 = scanner.nextInt();
                scanner.nextLine();  

                if (op2 == 1) {
                    System.out.print("Digite o número do voo: ");
                    numVoo = scanner.nextInt();
                    i = 0;
                    while (i < 12 && voo[i] != numVoo) {
                        i++;
                    }
                    if (i == 12) {
                        System.out.println("Voo inexistente");
                    } else {
                        System.out.println("Número do voo: " + voo[i]);
                        System.out.println("Local de origem: " + origem[i]);
                        System.out.println("Local de destino: " + destino[i]);
                        System.out.println("Lugares disponíveis: " + lugares[i]);
                    }
                } else if (op2 == 2) {
                    System.out.print("Digite o local de origem: ");
                    local = scanner.nextLine();
                    for (i = 0; i < 12; i++) {
                        if (origem[i].equalsIgnoreCase(local)) {
                            System.out.println("Número do voo: " + voo[i]);
                            System.out.println("Local de origem: " + origem[i]);
                            System.out.println("Local de destino: " + destino[i]);
                            System.out.println("Lugares disponíveis: " + lugares[i]);
                        }
                    }
                } else if (op2 == 3) {
                    System.out.print("Digite o local de destino: ");
                    local = scanner.nextLine();
                    for (i = 0; i < 12; i++) {
                        if (destino[i].equalsIgnoreCase(local)) {
                            System.out.println("Número do voo: " + voo[i]);
                            System.out.println("Local de origem: " + origem[i]);
                            System.out.println("Local de destino: " + destino[i]);
                            System.out.println("Lugares disponíveis: " + lugares[i]);
                        }
                    }
                }
            } else if (op == 2) {
                System.out.print("Digite o número do voo desejado: ");
                numVoo = scanner.nextInt();
                i = 0;
                while (i < 12 && voo[i] != numVoo) {
                    i++;
                }
                if (i == 12) {
                    System.out.println("Número de voo não encontrado");
                } else {
                    if (lugares[i] == 0) {
                        System.out.println("Voo lotado");
                    } else {
                        lugares[i]--;
                        System.out.println("Reserva confirmada!");
                    }
                }
            }

        } while (op != 3);

        System.out.println("Programa finalizado.");
    }
}
