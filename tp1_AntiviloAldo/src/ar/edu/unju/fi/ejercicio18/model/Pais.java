package ar.edu.unju.fi.ejercicio18.model;

public class Pais {
	
	private String codigo;
	private String Nombre;
	
	public Pais() {
		// TODO Auto-generated constructor stub
	}	

	public Pais(String codigo, String nombre) {
		super();
		this.codigo = codigo;
		Nombre = nombre;
	}
		
	public String getCodigo() {
		return codigo;
	}



	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}



	public String getNombre() {
		return Nombre;
	}



	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	@Override
	public String toString() {
		return "Pais [codigo=" + codigo + ", Nombre=" + Nombre + "]";
	}
	
	
}
