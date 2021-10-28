package uzziel.cervantes.demo.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import uzziel.cervantes.demo.model.Usuario;

@Repository
@Transactional
public class UsuarioDAOImp implements UsuarioDAO {

	@PersistenceContext
	private EntityManager entityManager;
	
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Usuario> getUsuarios() {
		String sql ="FROM Usuario";
		return entityManager.createQuery(sql).getResultList();
	}

	@Override
	public Usuario getUsuario(int id) {
		return entityManager.find(Usuario.class, id);
	}
	
	@Override
	public void saveUsuario(Usuario usuario) {
		entityManager.merge(usuario);
	}
}
