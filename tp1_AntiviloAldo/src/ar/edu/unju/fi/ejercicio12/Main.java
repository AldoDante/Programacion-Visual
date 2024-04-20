package ar.edu.unju.fi.ejercicio12;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

import ar.edu.unju.fi.ejercicio12.model.Persona;

public class Main {

	public static void main(String[] args) {
		
		 Scanner scanner = new Scanner(System.in);

	        // Ingreso de datos de la persona
		 
		 
	        System.out.println("Ingrese el nombre de la persona:");
	        String nombre = scanner.nextLine();       
	     
	        System.out.println("Ingrese la fecha de nacimiento (formato dd/mm/yyyy):");
	        String fechaStr = scanner.nextLine();
	        
	        //fecha en formato string dd/mm/aaaa a formato calendar el try catch se implemento
	        //por recomendacion del IDE
	        
	        SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy");
	        Calendar fechaNacimiento = Calendar.getInstance();
	        try {
				fechaNacimiento.setTime(formatoFecha.parse(fechaStr));
			} catch (ParseException e) {				
				e.printStackTrace();
			}
	        
	        // Crear objeto de la clase Persona
	       
	        Persona persona = new Persona(nombre, fechaNacimiento);

	        // Mostrar los datos de la persona
	        
	        System.out.println("\nDatos de la persona:");
	        System.out.println("Nombre: " + persona.getNombre());
	        System.out.println("Fecha de nacimiento: " + formatoFecha.format(persona.getFechaNacimiento().getTime()));
	        System.out.println("Edad: " + persona.calcularEdad() + " años");
	        System.out.println("Signo del zodíaco: " + persona.determinarSignoZodiaco());
	        System.out.println("Estación del año: " + persona.determinarEstacion());

	        scanner.close();
	    }

}

