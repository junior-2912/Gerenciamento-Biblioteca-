package repository;

import entities.Usuario;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RepositorioUsuario implements Repositorio<Usuario> {
    private Set<Usuario> usuarios = new HashSet<>();

    @Override
    public void salvar(Usuario item) {
        usuarios.add(item);
    }

    @Override
    public List<Usuario> buscarTodos() {
        return usuarios.stream().toList();
    }
}
