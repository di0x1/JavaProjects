package Biblioteca;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        GerenciadorDeBiblioteca gerenciador = new GerenciadorDeBiblioteca();
        Scanner teclado = new Scanner(System.in);

        int opcao;

        do{
            System.out.println(
                    "1. Inserir Livro\n"
                    + "2. Mostrar Livro\n"
                    + "3. Buscar Livro\n"
                    + "4.Remover Livro\n"
                            + "0. Sair\n"
            );

            opcao = teclado.nextInt();
            switch(opcao){
                case 1:
                    System.out.println("Digite o id do livro: ");
                    int idLivro = teclado.nextInt();
                    teclado.nextLine();
                    System.out.println("Digite o nome do livro: ");
                    String nomeLivro = teclado.nextLine();
                    System.out.println("Digite o Autor do livro: ");
                    String autorLivro = teclado.nextLine();
                    Livro novoLivro = new Livro(idLivro, nomeLivro, autorLivro);
                    gerenciador.SalvarLivro(novoLivro);
                    System.out.println("Livro adicionado com sucesso!");
                    break;

                case 2:
                    gerenciador.mostraLivro();
                    break;

                case 3:
                    System.out.println("Coloque o id do livro: ");
                    int idLivroColoque = teclado.nextInt();
                    gerenciador.buscaLivro(idLivroColoque);
                    break;

                case 4:
                    System.out.println("Coloque o id do livro: ");
                    int idLivroColoque2 = teclado.nextInt();
                    gerenciador.buscaLivro(idLivroColoque2);
            }

        }while(opcao != 0);
        teclado.close();

    }
}
