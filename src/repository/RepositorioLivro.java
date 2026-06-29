package repository;

import entities.Livro;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RepositorioLivro implements Repositorio<Livro> {

    private Set<Livro> livros = new HashSet<>();


    @Override
    public void salvar(Livro item) {
        livros.add(item);
    }

    @Override
    public Livro buscarPorId(int id) {
        for (Livro livro : livros) {
            if (livro.getIsbn() == id) {
                return livro;
            }
        }
        return null;
    }

    @Override
    public List<Livro> buscarTodos() {
        return livros.stream().toList();
    }
}
