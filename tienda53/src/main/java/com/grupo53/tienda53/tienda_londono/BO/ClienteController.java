package com.grupo53.tienda53.tienda_londono.BO;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

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
	public ModelAndView registrarCliente(ClienteVO user) {
		ClienteDAO Dao = new ClienteDAO();
		Dao.registrarCliente(user);
		return new ModelAndView("redirect:" + "Admin/clientes.jsp?create=1");
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
	@GetMapping("/eliminarcliente/{cedula}")
	public ModelAndView eliminarCliente(@PathVariable(value = "cedula") Integer cedula_Cliente) {
		ClienteDAO Dao = new ClienteDAO();
		Dao.eliminarCliente(cedula_Cliente);
		return new ModelAndView("redirect:" + "../Admin/clientes.jsp?delete=1");
	}
	
	@PutMapping("/actualizarclientes")
	public void actualizarCliente(ClienteVO user) {
		ClienteDAO Dao = new ClienteDAO();
		Dao.actualizarCliente(user);
	}
	
	

}