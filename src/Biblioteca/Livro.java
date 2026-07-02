package Biblioteca;

public class Livro {
    private int id ;
    private String titulo;
    private String autor;
    public boolean disponivel;

    public Livro(int id, String titulo, String autor){
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
        this.disponivel = true;


    }

    public boolean isDisponivel(){
        return this.disponivel;
    }

    public void setDisponivel(boolean disponivel){
        this.disponivel = disponivel;
    }

    public void setTitulo(String titulo){
        this.titulo = titulo;
    }

    public void setAutor(String autor){
        this.autor = autor;
    }

    public int getId(){
        return this.id;
    }
    public String getTitulo(){
        return this.titulo;
    }
    public String getAutor(){
        return this.autor;
    }
}
