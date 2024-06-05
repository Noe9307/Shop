package com.mx.cbtis.Shop.modelo;

public class Productos {

	private Integer id_prod;
	private String categoria;
	private String nombre;
	private Float precio;
	private Integer existencia;
	private String img;
	
	
	public Productos() {
		super();
	}
	
	public Productos(Integer id_prod, String categoria, String nombre, Float precio, Integer existencia, String img) {
		super();
		this.id_prod = id_prod;
		this.categoria = categoria;
		this.nombre = nombre;
		this.precio = precio;
		this.existencia = existencia;
		this.img = img;
	}
	public Integer getId_prod() {
		return id_prod;
	}
	public void setId_prod(Integer id_prod) {
		this.id_prod = id_prod;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Float getPrecio() {
		return precio;
	}
	public void setPrecio(Float precio) {
		this.precio = precio;
	}
	public Integer getExistencia() {
		return existencia;
	}
	public void setExistencia(Integer existencia) {
		this.existencia = existencia;
	}
	public String getImg() {
		return img;
	}
	public void setImg(String img) {
		this.img = img;
	}
}
