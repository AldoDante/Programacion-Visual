package ar.edu.unju.fi.ejercicio6.model;

import java.time.LocalDate;

public class Persona {
	
	private String dni;
	private String nombre;
	private LocalDate fechaNac;
	private String provincia;
	
	public Persona() {
		// TODO Auto-generated constructor stub
	}
	
	public Persona(String dni, String nombre, LocalDate fechaNac) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.fechaNac = fechaNac;
		this.provincia = jujuy;
	}

	public Persona(String dni, String nombre, LocalDate fechaNac, String provincia) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.fechaNac = fechaNac;
		this.provincia = provincia;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public LocalDate getFechaNac() {
		return fechaNac;
	}

	public void setFechaNac(LocalDate fechaNac) {
		this.fechaNac = fechaNac;
	}

	public String getProvincia() {
		return provincia;
	}

	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}
	
	//Metodo Calcular Edad
	
	public int calcEdad() {
        LocalDate fechaAct = LocalDate.now();
        return fechaAct.getYear() - fechaNac.getYear();
    }
	
	// Método  mayor de edad
	
    public boolean mayorEdad() {
        return calcEdad() >= 18;
    }
}
