package co.edu.iudigital.app.dto;

import lombok.Builder;
import lombok.Data;

//@Data 
//@Builder 
public class DelitoDto {
	
	private Long id;
	private String nombre;
	private String descripcion;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

}
