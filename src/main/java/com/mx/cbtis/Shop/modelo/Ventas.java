package com.mx.cbtis.Shop.modelo;

public class Ventas {

	private Integer id_venta;
	private String producto;
	private Integer cantidad;
	private Float total;
	private String direccion;
	
	
	public Ventas() {
		super();
	}

	public Ventas(Integer id_venta, String producto, Integer cantidad, Float total, String direccion) {
		this.id_venta = id_venta;
		this.producto = producto;
		this.cantidad = cantidad;
		this.total = total;
		this.direccion = direccion;
	}


	public Integer getId_venta() {
		return id_venta;
	}
	public void setId_venta(Integer id_venta) {
		this.id_venta = id_venta;
	}
	public String getProducto() {
		return producto;
	}
	public void setProducto(String producto) {
		this.producto = producto;
	}
	public Integer getCantidad() {
		return cantidad;
	}
	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}
	public Float getTotal() {
		return total;
	}
	public void setTotal(Float total) {
		this.total = total;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
}
