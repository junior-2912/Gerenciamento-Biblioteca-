package entities;

import repository.RepositorioEmprestimo;
import repository.RepositorioLivro;
import repository.RepositorioUsuario;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

public class Biblioteca {
    private RepositorioLivro repositorioLivro = new RepositorioLivro();
    private RepositorioUsuario repositorioUsuario = new RepositorioUsuario();
    private RepositorioEmprestimo repositorioEmprestimo = new RepositorioEmprestimo();

    public boolean cadastrarLivro(Livro livro) {
        if (livro != null) {
            return repositorioLivro.salvar(livro);
        }
        return false;
    }

    public boolean cadastrarUsuario(Usuario usuario) {
        if (usuario != null) {
            return repositorioUsuario.salvar(usuario);
        }
        return false;
    }

    public boolean fazerEmprestimo(Emprestimo emprestimo) {
        if (emprestimo != null) {
            return repositorioEmprestimo.salvar(emprestimo);
        }
        return false;
    }

    public List<Livro> listarLivros() {
        return repositorioLivro.buscarTodos();
    }

    public List<Usuario> listarUsuarios() {
        return repositorioUsuario.buscarTodos();
    }

    public List<Emprestimo> listarEmprestimos() {
        return repositorioEmprestimo.buscarTodos();
    }

    public List<Livro> buscarLivrosAtrasados() {
        return repositorioEmprestimo.buscarTodos().stream()
                .filter(emprestimo -> emprestimo.getDataDevolucao().isBefore(LocalDate.now()))
                .map(Emprestimo::getLivro)
                .toList();
    }

    public void devolverLivro(int idEmprestimo) {
        //Recebe o emprestimo baseado no id, se for null, lança uma exceção.
        Emprestimo emprestimo = repositorioEmprestimo.buscarPorId(idEmprestimo);
        //Muda o status do livro.
        emprestimo.getLivro().devolver();
        //Remove o emprestimo da lista do usuario.
        emprestimo.getUsuario().removerEmprestimo(emprestimo);
        repositorioEmprestimo.removerEmprestimo(emprestimo);
        System.out.println("Livro devolvido com sucesso!");
    }

    public List<Usuario> buscarUsuariosMaisEmprestimos() {
        Map<Usuario, Long> mapa = repositorioEmprestimo.buscarTodos()
                .stream()
                .collect(Collectors.groupingBy(Emprestimo::getUsuario, Collectors.counting()));

        return mapa.entrySet().stream()
                .sorted((Comparator.comparing(Map.Entry::getValue)))
                .map(Map.Entry::getKey)
                .limit(5)
                .toList();
    }
}
