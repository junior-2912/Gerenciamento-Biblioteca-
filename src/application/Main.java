package application;

import exceptions.LivroNaoDisponivelException;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        try (Scanner entrada = new Scanner(System.in)) {
            while (true) {
                try {
                    System.out.println("Digite um numero: ");
                    System.out.println("0 - Sair");
                    System.out.println("1 - Cadastrar livro");
                    System.out.println("2 - Cadastrar usuario");
                    System.out.println("3 - Listar livros");
                    System.out.println("4 - Listar usuários");
                    System.out.println("5 - Listar emprestimos");
                    System.out.println("6 - Livros atrasados");
                    System.out.println("7 - Usuarios com mais emprestimos");
                    System.out.println("8 - Top 5 livros mais emprestados");

                    int indice = entrada.nextInt();
                    entrada.nextLine();
                    if (indice == 0) break;

                    switch (indice) {
                        case 1 -> {

                        }

                    }
                } catch (LivroNaoDisponivelException e) {
                    System.out.println(e.getMessage());
                }


            }
        }

    }
}
