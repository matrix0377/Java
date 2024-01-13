package br.com.dvanet;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("\n ----- Calculo de Fatorial ----- \n");
        String opcao = "S";
        int j = 0;
        do {
            int numero;
            System.out.println("Informe o número para calcular o fatorial: ");
            System.out.print("> ");

            Scanner scanner = new Scanner(System.in);
            numero = scanner.nextInt();

            long fatorial = 1;
            int i = 1;

            while (i <= numero) {
                fatorial = fatorial * i;
                i++;
            }
            j++;
            System.out.println("O fatorial de " + numero + " é " + fatorial + "\n");
            System.out.println("Deseja continuar S/N? ");
            System.out.print(" Entre com a opção: 'S' para continuar ou Qualquer coisa diferente para SAIR >> ");
            opcao= scanner.next().toUpperCase();

            if (j > 0) {
                if (j == 1) {
                    System.out.println("Você calculou " + j + " Fatorial");
                } else if (j >= 2) {
                    System.out.println("  Você calculou --->>> " + j + " Fatoriais");
                } else {
                    System.out.println("Você não calculou Fatoriais");
                    }
            }
        } while (opcao.equals("S"));

    }
}