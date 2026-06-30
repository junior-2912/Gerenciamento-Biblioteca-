package repository;

import entities.Emprestimo;
import entities.Livro;
import exceptions.ElementoNaoEncontradoException;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class RepositorioLivro implements Repositorio<Livro> {

    private Set<Livro> livros = new HashSet<>();


    @Override
    public boolean salvar(Livro item) {
        adicionarArquivo(item);
        return livros.add(item);
    }

    @Override
    public Livro buscarPorId(int id) {
        for (Livro livro : livros) {
            if (livro.getIsbn() == id) {
                return livro;
            }
        }
        throw new ElementoNaoEncontradoException("O livro com isbn informado nao foi encontrado!");
    }

    @Override
    public List<Livro> buscarTodos() {
        return livros.stream().toList();
    }

    @Override
    public void adicionarArquivo(Livro item) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("c:\\windows\\temp\\livros.csv", true))) {
            bw.write(item.toString());
            bw.newLine();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
