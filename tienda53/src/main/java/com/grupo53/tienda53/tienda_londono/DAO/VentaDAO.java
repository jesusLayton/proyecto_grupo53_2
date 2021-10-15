package com.grupo53.tienda53.tienda_londono.DAO;

import java.sql.*;
import java.util.ArrayList;


import com.grupo53.tienda53.tienda_londono.DTO.VentaVO;

import ch.qos.logback.core.recovery.ResilientSyslogOutputStream;

/**
 * Clase que permite el acceso a la base de datos
 *
 */

public class VentaDAO {
	/**
	 * Permite registrar un Cliente nuevo
	 * 
	 * @param user
	 */
	public boolean registrarVenta(VentaVO user) {
		//llama y crea una instancia de la clase encargada de hacer la conexión
		Conexion conex = new Conexion();

		try {
			//sentencia que se ejecutara en la base de datos
			Statement estatuto = conex.getConnection().createStatement();
			
			//String que contiene la sentencia insert a ejecutar
			String sentencia = "INSERT INTO ventas VALUES(" 
					+ user.getCodigo_venta() + "," + "'"
					+ user.getIvaventa() + "'," + "'"					
					+ user.getTotal_venta() + "'," + "'" 
					+ user.getValor_venta() + "'," + "'" 
					
					+ "');";
			
			//se ejecuta la sentencia en la base de datos
			estatuto.executeUpdate(sentencia);
			//impresión en consola para verificación 
			System.out.println("Registrado " + sentencia);
			//cerrando la sentencia y la conexión
			estatuto.close();
			conex.desconectar();
			
			return true;

		} catch (SQLException e) {
			//si hay un error en el sql mostrarlo
			System.out.println("------------------- ERROR --------------");
			System.out.println("No se pudo insertar el cliente");
			System.out.println(e.getMessage());
			System.out.println(e.getErrorCode());
			
			return false;
		} catch (Exception e) {
			//si hay cualquier otro error mostrarlo
			System.out.println("------------------- ERROR --------------");
			System.out.println("No se pudo insertar el cliente");
			System.out.println(e.getMessage());
			System.out.println(e.getLocalizedMessage());
			return false;
		}

	}

	/**
	 * permite consultar el Cliente asociado al user enviado como parametro
	 * 
	 * @param documento
	 * @return
	 */
	public ArrayList<VentaVO> consultarVenta(Integer codigo) {	
		//lista que contendra el o los clientes obtenidos
		ArrayList<VentaVO> listaventas = new ArrayList<VentaVO>();		
		//instancia de la conexión
		Conexion conex = new Conexion();
		try {
			//prepare la sentencia en la base de datos
			PreparedStatement consulta = conex.getConnection()
					.prepareStatement("SELECT * FROM ventas where codigo_venta = ? ");		
			// se cambia el comodin ? por el dato que ha llegado en el parametro de la funcion
			consulta.setInt(1, codigo);			
			//ejecute la sentencia
			ResultSet res = consulta.executeQuery();			
			//cree un objeto basado en la clase entidad con los datos encontrados
			if (res.next()) {
				VentaVO Venta = new VentaVO();
				Venta.setCodigo_venta(Integer.parseInt(res.getString("codigo_venta")));
				Venta.setIvaventa(res.getInt("ivaventa"));
				Venta.setTotal_venta(res.getInt("total_venta"));
				Venta.setValor_venta(res.getInt("valor_venta"));
				

				listaventas.add(Venta);
			}
			//cerrar resultado, sentencia y conexión
			res.close();
			consulta.close();
			conex.desconectar();

		} catch (SQLException e) {
			//si hay un error en el sql mostrarlo
			System.out.println("------------------- ERROR --------------");
			System.out.println("No se pudo consultar el cliente");
			System.out.println(e.getMessage());
			System.out.println(e.getErrorCode());
		} catch (Exception e) {
			//si hay cualquier otro error mostrarlo
			System.out.println("------------------- ERROR --------------");
			System.out.println("No se pudo consultar el cliente");
			System.out.println(e.getMessage());
			System.out.println(e.getLocalizedMessage());
		}
		return listaventas;
	}

	/**
	 * permite consultar la lista de todos las vetas
	 * 
	 * @return
	 */
	public ArrayList<VentaVO> listaVentas() {
		//lista que contendra el o las ventas obtenidas
		ArrayList<VentaVO> listaventas = new ArrayList<VentaVO>();
		
		//instancia de la conexión
		Conexion conex = new Conexion();

		try {
			//prepare la sentencia en la base de datos
			PreparedStatement consulta = conex.getConnection().prepareStatement("SELECT * FROM Ventas ORDER BY codigo_venta");
			
			//ejecute la sentencia
			ResultSet res = consulta.executeQuery();
			
			//cree un objeto para cada encontrado en la base de datos basado en la clase entidad con los datos encontrados
			while (res.next()) {
				VentaVO Venta = new VentaVO();
				Venta.setCodigo_venta(Integer.parseInt(res.getString("codigo_venta")));
				Venta.setIvaventa(res.getInt("ivaventa"));
				Venta.setTotal_venta(res.getInt("total_venta"));
				Venta.setValor_venta(res.getInt("valor_venta"));
				

				listaventas.add(Venta );
			}
			
			//cerrar resultado, sentencia y conexión
			res.close();
			consulta.close();
			conex.desconectar();

		} catch (SQLException e) {
			//si hay un error en el sql mostrarlo
			System.out.println("------------------- ERROR --------------");
			System.out.println("No se pudo consultar todos los clientes");
			System.out.println(e.getMessage());
			System.out.println(e.getErrorCode());
		} catch (Exception e) {
			//si hay cualquier otro error mostrarlo
			System.out.println("------------------- ERROR --------------");
			System.out.println("No se pudo consultar todos los clientes");
			System.out.println(e.getMessage());
			System.out.println(e.getLocalizedMessage());
		}

		return listaventas;
	
	}

	public int contar_venta () {
		Conexion conex = new Conexion();
	
		try {
			PreparedStatement consulta = conex.getConnection().prepareStatement("SELECT COUNT(codigo_venta) + 1 AS cuenta FROM ventas");
			
			ResultSet res = consulta.executeQuery();
			
			int cuenta = 0;
			
			while (res.next()) {
				cuenta = res.getInt("cuenta");
			}
			
			res.close();
			consulta.close();
			conex.desconectar();
			
			return cuenta;
			
		} catch (Exception e) {
			System.out.println(e);
			
			return 0;
		}
		
	}
	

}
