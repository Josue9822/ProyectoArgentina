package idat.edu.proyecto.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import idat.edu.proyecto.models.Usuario;

@Repository
@Transactional
public class UsuarioDaoImpl implements UsuarioDao {
	
	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public List<Usuario> getUsuarios() {
		
		String query = "FROM Usuario";
		return entityManager.createQuery(query).getResultList();
		
	}

	@Override
	public void eliminar(Long id) {
		Usuario usuario = entityManager.find(Usuario.class, id);
		entityManager.remove(usuario);
		
	}

	@Override
	public void registrar(Usuario usuario) {
		entityManager.merge(usuario);
		
	}

}
