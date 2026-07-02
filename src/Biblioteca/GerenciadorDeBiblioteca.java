package Biblioteca;

import java.util.ArrayList;
public class GerenciadorDeBiblioteca {

    private ArrayList<Livro> ListadeLivros = new ArrayList();

    public void SalvarLivro(Livro livro){
        this.ListadeLivros.add(livro);
        System.out.println("Livro salvo com sucesso!");
    }

    public void mostraLivro(){
        if (ListadeLivros.isEmpty()){
            System.out.println("Nenhum livro encontrado!");
        }
        for(Livro l: ListadeLivros){
            System.out.println("ID: " + l.getId() + "| Titulo: " + l.getTitulo() + "| Autor: " + l.getAutor());
        }
    }

    public Livro buscaLivro(int id){
        for(Livro l: ListadeLivros) {
            if (l.getId() == id) {
                return l;
            }
        }
        System.out.println("Nenhum livro encontrado!");
        return null;
    }

    public void RemoverLivro(int id) {
        Livro livro = buscaLivro(id);
        if (livro != null) {
            ListadeLivros.remove(livro);
        } else {
            System.out.println("Livro nao encontrado!");
        }
    }
}

