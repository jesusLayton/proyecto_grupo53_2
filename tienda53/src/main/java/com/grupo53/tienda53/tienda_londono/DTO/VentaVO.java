package com.grupo53.tienda53.tienda_londono.DTO;

import java.io.Serializable;

public class VentaVO implements Serializable {

	//identificador unico de las clases entidad
	private static final long serialVersionUID = 1L;
	
	private Integer codigo_venta;
	private Integer ivaventa;
	private Integer total_venta;
	private Integer valor_venta;
	/**
	 * @return the codigo_venta
	 */
	public Integer getCodigo_venta() {
		return codigo_venta;
	}
	/**
	 * @param codigo_venta the codigo_venta to set
	 */
	public void setCodigo_venta(Integer codigo_venta) {
		this.codigo_venta = codigo_venta;
	}
	/**
	 * @return the ivaventa
	 */
	public Integer getIvaventa() {
		return ivaventa;
	}
	/**
	 * @param ivaventa the ivaventa to set
	 */
	public void setIvaventa(Integer ivaventa) {
		this.ivaventa = ivaventa;
	}
	/**
	 * @return the total_venta
	 */
	public Integer getTotal_venta() {
		return total_venta;
	}
	/**
	 * @param total_venta the total_venta to set
	 */
	public void setTotal_venta(Integer total_venta) {
		this.total_venta = total_venta;
	}
	/**
	 * @return the valor_venta
	 */
	public Integer getValor_venta() {
		return valor_venta;
	}
	/**
	 * @param valor_venta the valor_venta to set
	 */
	public void setValor_venta(Integer valor_venta) {
		this.valor_venta = valor_venta;
	}
	/**
	 * @return the serialversionuid
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	
}
 