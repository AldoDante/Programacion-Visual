package ar.edu.unju.fi.ejercicio4;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		// Ejercicio 4
		
		Scanner sn= new Scanner(System.in);
		int num;
		
		do {
	        
			System.out.println("Iingrese un número entre cero y diez:");
	        num = sn.nextInt();
	        
	        // Verificar si el número está dentro del rango
	        
	    if (num < 0 || num > 10) {
	    	System.out.println("El número ingresado está fuera de Rango");
	    }
	    
	    } while (num < 0 || num > 10);
		sn.close();
		
		int fact=1;
		int cont=1;
		
		while(cont<=num) {
			fact = fact*cont;
			cont++;			
		}
		
		System.out.println("El fanctorial de: "+num+" es "+fact);
	}

}
