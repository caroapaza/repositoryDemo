package ar.edu.unju.fi.projectoejemplo.model;

public class Materia {
	private String nombre;
	private int codigo;
	private String curso;
	
	public Materia() {
		// TODO Auto-generated constructor stub
	}

	public Materia(String nombre, int codigo, String curso) {
		super();
		this.nombre = nombre;
		this.codigo = codigo;
		this.curso = curso;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	@Override
	public String toString() {
		return "Materia [nombre=" + nombre + ", codigo=" + codigo + ", curso=" + curso + "]";
	}
	
	
	
	

}
