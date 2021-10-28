package uzziel.cervantes.demo.dao;

import java.util.List;

import uzziel.cervantes.demo.model.Usuario;

public interface UsuarioDAO {

	List<Usuario> getUsuarios();

	Usuario getUsuario(int id);

	void saveUsuario(Usuario usuario);
}
