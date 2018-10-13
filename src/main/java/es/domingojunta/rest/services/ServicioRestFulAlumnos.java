package es.domingojunta.rest.services;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.codehaus.jackson.annotate.JsonUnwrapped;

import es.domingojunta.entities.Alumno;
import es.domingojunta.services.*;

@Path("/alumno")
public class ServicioRestFulAlumnos {
	
	private AlumnoService service = new AlumnoServiceImpl();
	
	@GET
	@Path("/alumnos")
	@Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
	public List<Alumno> alumnos() {
		return service.getAlumnos();
	}
	
	@GET
	@Path("/{id}")
	@Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
	public Alumno getAlumno(@PathParam("id") int id) {
		Alumno alumno = new Alumno(0,"no encontrado","","");
		Alumno a = service.getAlumnoById(id);
		if (a==null) {
			return alumno;
		}
		return a;
	}
	
	@POST
	@Consumes({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
	@Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
	public Alumno crearAlumno(Alumno alumno) {
	
		Alumno alum=service.createAlumno(alumno);
		return alum;
		
	}
	
	@DELETE
	@Path("/{id}")
	@Produces({MediaType.TEXT_PLAIN})
	public String deleteAlumno(@PathParam("id") int id) {
		
		String mensaje=service.deleteAlumno(id);
		return mensaje;
	}
	
	@PUT
	@Consumes({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
	@Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
	public Alumno updateAlumno(Alumno alumno) {
	
		Alumno alum=service.updateAlumno(alumno);
		return alum;
		
	}
	
}
