package es.domingojunta.services;

import java.util.ArrayList;
import java.util.List;

import es.domingojunta.entities.Alumno;

public class AlumnoServiceImpl implements AlumnoService {

	public static List<Alumno> alumnos = null;
	
	public AlumnoServiceImpl() {
		
		if (alumnos==null) {
			alumnos = new ArrayList<Alumno>();
			Alumno alumno = null;
			for (int i = 1; i <= 10; i++) {
				alumno = new Alumno(i,"alumno"+i, "apellidos"+i, "1EPO");
				alumnos.add(alumno);
			}
		}
		
	}
	@Override
	public List<Alumno> getAlumnos() {
		return alumnos;
	}

	@Override
	public Alumno getAlumnoById(int id) {
		for (Alumno item : alumnos) {
			if (item.getId()==id) {
				return item;
			} 
		}
		
		return null;
	}

	@Override
	public Alumno createAlumno(Alumno alumno) {
		for (Alumno item : alumnos) {
			if (item.getId()==alumno.getId()) {
				//Alumno ya existe
				return item;
			} 
		}
		alumnos.add(alumno);
		return alumno;
	}

	@Override
	public String deleteAlumno(int id) {
		for (Alumno item : alumnos) {
			if (item.getId()==id) {
				alumnos.remove(item);
				return "El alumno "+id+" ha sido dado de baja...";
			} 
	}
		return "El alumno con id:"+id+" no existe...";
	}
	@Override
	public Alumno updateAlumno(Alumno alumno) {
		for (Alumno item : alumnos) {
			if (item.getId()==alumno.getId()) {
				item.setId(alumno.getId());
				item.setNombre(alumno.getNombre());
				item.setApellidos(alumno.getApellidos());
				item.setCurso(alumno.getCurso());
				return item;
			} 
		}
		return null;
	}

}
