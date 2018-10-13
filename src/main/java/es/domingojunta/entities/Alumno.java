package es.domingojunta.entities;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Alumno {
	
	private int id;
	private String nombre;
	private String apellidos;
	private String curso;
	
	//Constructores
	//Getters and Setters
	
	
	
	public Alumno() {
		super();
	}
	
	public Alumno(int id,String nombre, String apellidos, String curso) {
		super();
		this.id=id;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.curso = curso;
	}

	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
	
	

}
