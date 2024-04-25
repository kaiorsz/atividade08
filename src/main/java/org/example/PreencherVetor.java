package org.example;

import java.util.Scanner;

public class PreencherVetor {
    public static void main(String[] args) {
        int[] vetor = new int[10];
        int indice = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite os valores inteiros para preencher o vetor (digite 0 para parar):");
        int valor = scanner.nextInt();
        while (valor != 0 && indice < 10) {
            vetor[indice] = valor;
            indice++;
            if (indice < 10) {
                System.out.println("Digite outro valor inteiro:");
                valor = scanner.nextInt();
            }
        }

        System.out.println("Vetor preenchido:");
        for (int i = 0; i <= indice; i++) {
            System.out.print(vetor[i] + " ");
        }

        scanner.close();
    }
}

