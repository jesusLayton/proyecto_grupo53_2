package com.grupo53.tienda53.tienda_londono.BO;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.grupo53.tienda53.tienda_londono.DAO.UsuarioDAO;
import com.grupo53.tienda53.tienda_londono.DTO.UsuarioVO;


@RestController
public class UsuarioController {
	
	/*
	 * @GetMapping obtener o buscar
	 * @PostMapping insertar o agregar
	 * @PutMapping modificar o actualizar
	 * @DeleteMapping eliminar o borrar
	 * */

	@PostMapping("/registrarUsuario")
	public ModelAndView registrarUsuario(UsuarioVO user) {
		UsuarioDAO Dao = new UsuarioDAO();
		Dao.registrarUsuario(user);
		return new ModelAndView("redirect:" + "Admin/usuarios.jsp");
	}

	@GetMapping("/consultarUsuario")
	public ArrayList<UsuarioVO> consultarUsuarios(String usuario) {
		UsuarioDAO Dao = new UsuarioDAO();
		return Dao.consultarUsuario(usuario);
	}

	@GetMapping("/listarUsuarios")
	public ArrayList<UsuarioVO> listaDeUsuarios() {
		UsuarioDAO Dao = new UsuarioDAO();
		return Dao.listaDeUsuarios();
	}
	@DeleteMapping("/eliminarUsuario")
	public void eliminarUsuario(Integer cedula_usuario) {
		UsuarioDAO Dao = new UsuarioDAO();
		Dao.eliminarUsuario(cedula_usuario);
	}
	
	@PutMapping("/actualizarUsuarios")
	public void actualizarUsuario(UsuarioVO user) {
		UsuarioDAO Dao = new UsuarioDAO();
		Dao.actualizarUsuario(user);
	}
}