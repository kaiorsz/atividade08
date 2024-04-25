package org.example;

import java.util.Scanner;

public class TesteLogin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Login login = new Login("usuario123", "senha123");

        try {

            System.out.println("Digite o usuário:");
            String usuario = scanner.nextLine();

            System.out.println("Digite a senha:");
            String senha = scanner.nextLine();
            boolean loginSucesso = login.fazerLogin(usuario, senha);
            if (loginSucesso) {
                System.out.println("Login bem-sucedido!");
            } else {
                System.out.println("Login falhou.");
            }
        } catch (LoginInvalidoException e) {
            System.out.println("Erro ao fazer login: " + e.getMessage());
        }
    }
}