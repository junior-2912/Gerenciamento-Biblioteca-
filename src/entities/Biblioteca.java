package entities;

import repository.RepositorioEmprestimo;
import repository.RepositorioLivro;
import repository.RepositorioUsuario;

public class Biblioteca {
    private RepositorioLivro repositorioLivro = new RepositorioLivro();
    private RepositorioUsuario repositorioUsuario = new RepositorioUsuario();
    private RepositorioEmprestimo repositorioEmprestimo = new RepositorioEmprestimo();

    public boolean cadastrarLivro(Livro livro) {

    }
}
