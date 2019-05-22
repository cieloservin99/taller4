package py.edu.facitec.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity//Indicamos que se creará una tabla cliente
public class Cliente {
	@Id//Para indicar la clave primaria
	@GeneratedValue//Paara generar la clave primaria secuencialmente
	private Integer id;
	private String nombre;
	private String correo;
	
	
	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getCorreo() {
		return correo;
	}


	public void setCorreo(String correo) {
		this.correo = correo;
	}


	@Override
	public String toString() {
		return "Cliente [id=" + id + ", nombre=" + nombre + ", correo="
				+ correo + "]";
	}
	
	
	

}
