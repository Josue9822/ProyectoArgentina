package idat.edu.proyecto.dao;

import java.util.List;

import idat.edu.proyecto.models.Usuario;

public interface UsuarioDao {
	
	List<Usuario> getUsuarios();
	
	void eliminar(Long id);

	void registrar(Usuario usuario);

}
