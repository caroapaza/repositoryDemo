package ar.edu.unju.fi.projectoejemplo.model;
/**
 * clase Alumno
 * @author PC
 *
 */
public class Alumno {
	private String nombre;
	private String libreta;
	private int edad;
	
	public Alumno() {
		// valores por defecto
	}

	public Alumno(String nombre, String libreta, int edad) {
		super();
		this.nombre = nombre;
		this.libreta = libreta;
		this.edad = edad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getLibreta() {
		return libreta;
	}

	public void setLibreta(String libreta) {
		this.libreta = libreta;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	
	
	

}
