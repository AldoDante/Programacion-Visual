package ar.edu.unju.fi.ejercicio15;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
				
		Scanner sc = new Scanner(System.in);
		int largo;
		
		do {			
			System.out.println("Ingrese un nro entero en el rango [5-10]");
			largo=sc.nextInt();
			
			if (largo < 5 || largo > 10 )
				System.out.println("Numero fuera de Rango");
			
		} while(largo < 5 || largo > 10);
		
		String [] array = new String [largo];
		
		for (int i=0; i<largo;i++) {
			
			System.out.println("Ingrese nombre para la posicion: "+ i);
			String nombre = sc.next();
			array[i]=nombre;			
		}
		
		System.out.println("\nArreglo en orden normal\n");
		
		for (int j=0; j<largo;j++) {
			System.out.println("En la posicion "+j+" se encuentra el nombre: "+array[j]);
		}
		
		System.out.println("\nArreglo en orden inverso\n");
		
		for (int k =largo-1; k>=0; k--) {
			System.out.println("En la posicion "+k+" se encuentra el nombre "+array[k]);			
		}
		sc.close();
	}

}
