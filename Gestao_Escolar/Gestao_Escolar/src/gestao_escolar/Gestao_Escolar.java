package gestao_escolar;

import java.util.Scanner;

public class Gestao_Escolar {
    public static void main(String[] args) {
        System.out.println("Boas Vindas ao Sistema de Gestão Escolar!");

        // entrada de informações via teclado
        Scanner leitor = new Scanner(System.in);

         /*
         a partir do Java 10 pode substuir a redundância
         de declaração por "var"
         Exemplo: var leitor = new Scanner(System.in);
          */


        System.out.println("\nDigite o nome do estudante: ");
        String nome = leitor.nextLine();

        System.out.println("Digite a idade do estudante: ");
        int idade = leitor.nextInt();

        System.out.println("Digite a nota 1 do estudante: ");
        var nota1 = leitor.nextDouble();

        System.out.println("Digite a nota 2 do estudante: ");
        var nota2 = leitor.nextDouble();

        System.out.println("Digite a nota 3 do estudante: ");
        var nota3 = leitor.nextDouble();

        var media = (nota1 + nota2 + nota3) / 3;

        System.out.println("-- Média do Estudante: " + media);

        if (media >= 7) {
            System.out.println("Estudante Aprovado!");
        } else {
            System.out.println("Estudante reprovado");
        }

        // Saídas

        /*
        System.out.println("\n------ Boletim ---------");
        System.out.println("nome: " + nome);
        System.out.println("idade: " + idade);
        System.out.println("nota " + nota);
        */

        /*
        if (nota >= 7)
            if (nota == 8) {
                System.out.println("O estudante: " + nome + " passou com nota: " + nota);
            } if (nota == 9) {
                System.out.println("O estudante: " + nome + " passou bem com nota: " + nota);
            } if (nota == 10) {
                System.out.println("O estudante: " + nome + " passou com louvor com nota: " + nota);
            }
        if (nota < 7) {
            System.out.println("O estudante: " + nome + " reprovou com nota: " + nota);
        }
        */


    }

}
