package es.domingojunta.services;

import java.util.List;

import es.domingojunta.entities.Alumno;


public interface AlumnoService {

	public List<Alumno> getAlumnos();
	public Alumno getAlumnoById(int id);
	public Alumno createAlumno(Alumno alumno);
	public String deleteAlumno(int id);
	public Alumno updateAlumno(Alumno alumno);
	
	
}
