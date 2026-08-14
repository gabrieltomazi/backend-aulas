package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    // Pergunta quantos alunos vão ser cadastrados
    System.out.print("Quantos alunos serão cadastrados?: ");
    int qtdAlunos = scanner.nextInt();

    // Inicialização das listas
    String[] alunos = new String[qtdAlunos];
    double[] medias = new double[qtdAlunos];

    // Primeiro loop é pra pegar o nome e as notas do aluno
    for (int i = 0; i < qtdAlunos; i++) {

      System.out.print("Digite o nome do aluno: ");
      String nomeDoAluno = scanner.next();

      // Adiciona o aluno na lista de strings
      alunos[i] = nomeDoAluno;

      // Lista que armazena as notas dos alunos para depois somar e dividir por 3
      double[] notasDoAluno = new double[3];

      // Segundo loop é pra pegar as 3 notas desse aluno
      for (int j = 0; j < 3; j++) {

        // Pergunta as notas e armazena na lista notasDoAluno
        System.out.print("Digite a nota " + (j + 1) + " do " + nomeDoAluno + ": ");
        double nota = scanner.nextDouble();
        notasDoAluno[j] = nota;
      }
      // Pega a lista de notasDoAluno soma elas e depois armazena na lista medias na posição específica do aluno
      double notasSomadas = Arrays.stream(notasDoAluno).sum();
      medias[i] = notasSomadas / 3;
      System.out.println("Aluno: " + nomeDoAluno + " adicionado!");
    }

    // Loop que passa por cada aluno e a sua devida média
    for (int i = 0; i < medias.length; i++) {
      System.out.printf("O aluno %s teve a média: %.2f", alunos[i], medias[i]);
    }
  }
}
