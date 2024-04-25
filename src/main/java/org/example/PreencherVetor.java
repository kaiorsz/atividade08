package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class PreencherVetor {
    public static void main(String[] args) {
        int[] vetor = new int[10];
        int indice = 0;

        Scanner scanner = new Scanner(System.in);
        int valor = 1;

        try {
            System.out.println("Digite os valores inteiros para preencher o vetor (digite 0 para parar):");
            while (valor != 0) {
                try {
                    valor = scanner.nextInt();
                    vetor[indice] = valor;
                    indice++;
                } catch (InputMismatchException e) {
                    System.out.println("Erro: Valor informado não é numérico. Tente novamente.");
                    scanner.next();
                }
            }

            System.out.println("Vetor preenchido:");
            for (int i = 0; i < indice; i++) {
                System.out.print(vetor[i] + " ");
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Erro: Você informou mais do que 10 valores. Apenas os primeiros 10 foram armazenados.");
        } finally {
            scanner.close();
        }
    }
}

