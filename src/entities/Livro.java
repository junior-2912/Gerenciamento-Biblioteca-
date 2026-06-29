package entities;

import enums.StatusLivro;

public class Livro {
    private String titulo;
    private String autor;
    private int isbn;
    private StatusLivro statusLivro;
    
    public Livro(String titulo, String autor, int isbn, StatusLivro statusLivro) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.statusLivro = statusLivro;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getIsbn() {
        return isbn;
    }

    public StatusLivro getStatusLivro() {
        return statusLivro;
    }

    @Override
    public String toString() {
        return titulo + " - " + autor + " - \n" + isbn + " - " + statusLivro;
    }

    
}
