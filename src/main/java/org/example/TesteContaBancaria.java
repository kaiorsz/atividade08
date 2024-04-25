package org.example;

public class TesteContaBancaria {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria(1000.0); // Saldo inicial: R$ 1000.0

        try {
            conta.depositar(500.0);
            conta.sacar(200.0);
            conta.sacar(1500.0); // Tentando sacar um valor maior que o saldo
        } catch (SaldoInsuficienteException e) {
            System.out.println("Erro ao sacar: " + e.getMessage());
        }
    }
}