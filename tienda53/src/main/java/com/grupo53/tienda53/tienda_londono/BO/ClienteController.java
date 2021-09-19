package com.grupo53.tienda53.tienda_londono.BO;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.grupo53.tienda53.tienda_londono.DAO.ClienteDAO;
import com.grupo53.tienda53.tienda_londono.DTO.ClienteVO;


@RestController
public class ClienteController {
	
	/*
	 * @GetMapping obtener o buscar
	 * @PostMapping insertar o agregar
	 * @PutMapping modificar o actualizar
	 * @DeleteMapping eliminar o borrar
	 * */

	@PostMapping("/registrarcliente")
	public void registrarCliente(ClienteVO user) {
		ClienteDAO Dao = new ClienteDAO();
		Dao.registrarCliente(user);
	}

	@GetMapping("/consultarcliente")
	public ArrayList<ClienteVO> consultarClientes(String Cliente) {
		ClienteDAO Dao = new ClienteDAO();
		return Dao.consultarCliente(Cliente);
	}

	@GetMapping("/listarclientes")
	public ArrayList<ClienteVO> listaDeClientes() {
		ClienteDAO Dao = new ClienteDAO();
		return Dao.listaDeClientes();
	}
	@DeleteMapping("/eliminarcliente")
	public void eliminarCliente(Integer cedula_Cliente) {
		ClienteDAO Dao = new ClienteDAO();
		Dao.eliminarCliente(cedula_Cliente);
	}
	
	@PutMapping("/actualizarclientes")
	public void actualizarCliente(ClienteVO user) {
		ClienteDAO Dao = new ClienteDAO();
		Dao.registrarCliente(user);
	}
	
	

}