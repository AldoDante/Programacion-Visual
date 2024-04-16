package ar.edu.unju.fi.ejercicio12;

import java.util.Calendar;
import java.util.Scanner;

import ar.edu.unju.fi.ejercicio12.model.Persona;

public class Main {

	public static void main(String[] args) {
		
		 Scanner scanner = new Scanner(System.in);

	        // Ingreso de datos de la persona
		 
		 
	        System.out.println("Ingrese el nombre de la persona:");
	        String nombre = scanner.nextLine();
	        
	        // Divido fechaStr en tres partes utilizando como delimitador 
	        // "/" y luego convierto las partes en enteros
	        // Se resta 1 porque en Calendar los meses van de 0 a 11
	        
	        System.out.println("Ingrese la fecha de nacimiento (formato dd/mm/yyyy):");
	        String fechaStr = scanner.nextLine();
	        
	        String[] partesFecha = fechaStr.split("/");
	        int dia = Integer.parseInt(partesFecha[0]);
	        int mes = Integer.parseInt(partesFecha[1]) - 1; // resta 
	        int anio = Integer.parseInt(partesFecha[2]);

	        Calendar fechaNacimiento = Calendar.getInstance();
	        fechaNacimiento.set(anio, mes, dia);

	        // Crear objeto de la clase Persona
	       
	        Persona persona = new Persona(nombre, fechaNacimiento);

	        // Mostrar los datos de la persona
	        
	        System.out.println("\nDatos de la persona:");
	        System.out.println("Nombre: " + persona.getNombre());
	        System.out.println("Fecha de nacimiento: " + fechaStr);
	        System.out.println("Edad: " + persona.calcularEdad() + " años");
	        System.out.println("Signo del zodíaco: " + persona.determinarSignoZodiaco());
	        System.out.println("Estación del año: " + persona.determinarEstacion());

	        scanner.close();
	    }

}


