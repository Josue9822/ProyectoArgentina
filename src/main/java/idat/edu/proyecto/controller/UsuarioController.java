package idat.edu.proyecto.controller;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import idat.edu.proyecto.dao.UsuarioDao;
import idat.edu.proyecto.models.Usuario;

@RestController
public class UsuarioController {
	
	@Autowired
	private UsuarioDao 	usuariodao;
	
	@RequestMapping(value = "api/usuario", method = RequestMethod.GET)
	public List<Usuario> getUsuarios() {
		return usuariodao.getUsuarios();
		
	}
	
	@RequestMapping(value = "api/usuario/{id}", method = RequestMethod.DELETE)
	public void eliminar(@PathVariable Long id) {
		
		usuariodao.eliminar(id);
	}
	
	@RequestMapping(value = "api/usuario", method = RequestMethod.POST)
	public void registrarUsuario(@RequestBody Usuario usuario) {
		usuariodao.registrar(usuario);
		
	}
	
	
	/*
	@RequestMapping(value = "usuario/{id}")
	public Usuario getUsuario(@PathVariable Long id) {
		Usuario usuario = new Usuario();
		usuario.setId(id);
		usuario.setNombre("Lucas");
		usuario.setApellido("Perez");
		usuario.setEmail("lucas@gmail.com");
		usuario.setTelefono("989939567");
		
		return usuario;
	}
	
	@RequestMapping(value = "usuario")
	public Usuario editarUsuario() {
		Usuario usuario = new Usuario();
		usuario.setNombre("Lucas");
		usuario.setApellido("Perez");
		usuario.setEmail("lucas@gmail.com");
		usuario.setTelefono("989939567");
		
		return usuario;
	}
	
	@RequestMapping(value = "usuario")
	public Usuario eliminarUsuario() {
		Usuario usuario = new Usuario();
		usuario.setNombre("Lucas");
		usuario.setApellido("Perez");
		usuario.setEmail("lucas@gmail.com");
		usuario.setTelefono("989939567");
		
		return usuario;
	}
	
	@RequestMapping(value = "usuario")
	public Usuario buscar() {
		Usuario usuario = new Usuario();
		usuario.setNombre("Lucas");
		usuario.setApellido("Perez");
		usuario.setEmail("lucas@gmail.com");
		usuario.setTelefono("989939567");
		
		return usuario;
	}*/

}
