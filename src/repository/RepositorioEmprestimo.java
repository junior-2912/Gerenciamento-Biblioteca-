package repository;

import entities.Emprestimo;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RepositorioEmprestimo implements Repositorio<Emprestimo> {
    private Set<Emprestimo> emprestimos = new HashSet<>();

    @Override
    public void salvar(Emprestimo item) {
        emprestimos.add(item);
    }

    @Override
    public Emprestimo buscarPorId(int id) {
        for (Emprestimo emprestimo : emprestimos) {
            if (emprestimo.getId() == id) {
                return emprestimo;
            }
        }
        return null;
    }

    @Override
    public List<Emprestimo> buscarTodos() {
        return emprestimos.stream().toList();
    }
}
