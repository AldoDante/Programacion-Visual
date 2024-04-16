package ar.edu.unju.fi.ejercicio12.model;

import java.util.Calendar;

public class Persona {
	  	
		private String nombre;
	    private Calendar fechaNacimiento;

	    public Persona(String nombre, Calendar fechaNacimiento) {
	        this.nombre = nombre;
	        this.fechaNacimiento = fechaNacimiento;
	    }
	    
	    
	    
	    public String getNombre() {
			return nombre;
		}



		public void setNombre(String nombre) {
			this.nombre = nombre;
		}



		public int calcularEdad() {
	        Calendar fechaActual = Calendar.getInstance();
	        int edad = fechaActual.get(Calendar.YEAR) - fechaNacimiento.get(Calendar.YEAR);
	        return edad;
	    }

	    public String determinarSignoZodiaco() {
	        int dia = fechaNacimiento.get(Calendar.DAY_OF_MONTH);
	        int mes = fechaNacimiento.get(Calendar.MONTH) + 1;

	        switch (mes) {
	            case 1:
	                return dia < 20 ? "Capricornio" : "Acuario";
	            case 2:
	                return dia < 19 ? "Acuario" : "Piscis";
	            case 3:
	                return dia < 21 ? "Piscis" : "Aries";
	            case 4:
	                return dia < 20 ? "Aries" : "Tauro";
	            case 5:
	                return dia < 21 ? "Tauro" : "Géminis";
	            case 6:
	                return dia < 21 ? "Géminis" : "Cáncer";
	            case 7:
	                return dia < 23 ? "Cáncer" : "Leo";
	            case 8:
	                return dia < 23 ? "Leo" : "Virgo";
	            case 9:
	                return dia < 23 ? "Virgo" : "Libra";
	            case 10:
	                return dia < 23 ? "Libra" : "Escorpio";
	            case 11:
	                return dia < 22 ? "Escorpio" : "Sagitario";
	            default:
	                return dia < 22 ? "Sagitario" : "Capricornio";
	        }
	    }

	    public String determinarEstacion() {
	    	int dia = fechaNacimiento.get(Calendar.DAY_OF_MONTH);
	    	int mes = fechaNacimiento.get(Calendar.MONTH) + 1;

	        switch (mes) {
	            case 1:
	            	return "Verano";
	            case 2:
	            	return "Verano";	            
	            case 3:
	            	return dia > 20 ? "Otoño":"Verano";
	            case 4:
	            	return "Otoño";
	            case 5:
	                return "Otoño";
	            case 6:
	            	return dia > 20 ?"Invierno":"Otoño";
	            case 7:
	            	return "Invierno";
	            case 8:
	                return "Invierno";
	            case 9: 
	            	return dia > 20 ? "Primavera":"Invierno";
	            case 10:
	            	return "Primavera";
	            case 11: 
	            	return "Primavera";
	            case 12:
	            	return dia > 20 ? "Verano" : "Primavera";
	            default:
	                return "Mes fuera de rango [1-12]";
	        }
	    }

}
