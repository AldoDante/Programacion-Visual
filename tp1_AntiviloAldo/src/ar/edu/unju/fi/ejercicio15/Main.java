package ar.edu.unju.fi.ejercicio15;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
				
		Scanner sc = new Scanner(System.in);
		int largo;
		
		//Ingreso de la longitud del array (do-while)
		//si no se encuentra en rango vuelve a pedir el ingreso
		do {			
			System.out.println("Ingrese un nro entero en el rango [5-10]");
			largo=sc.nextInt();
			
			if (largo < 5 || largo > 10 )
				System.out.println("Numero fuera de Rango");
			
		} while(largo < 5 || largo > 10);
		
		//array para almacenar elementos de tipo String
		String [] array = new String [largo];
		
		// bucle for para ingresar nombres al array
		for (int i=0; i<largo;i++) {
			
			System.out.println("Ingrese nombre para la posicion: "+ i);
			String nombre = sc.next();
			array[i]=nombre;			
		}
		
		System.out.println("\nArreglo en orden normal\n");
		
		//Bucle for para recorrer y mostrar el array
		for (int j=0; j<largo;j++) {
			System.out.println("En la posicion "+j+" se encuentra el nombre: "+array[j]);
		}
		
		System.out.println("\nArreglo en orden inverso\n");
		
		//Bucle for para recorrer y mostrar el array en orden inverso
		for (int k =largo-1; k>=0; k--) {
			System.out.println("En la posicion "+k+" se encuentra el nombre "+array[k]);			
		}
		sc.close();
	}

}
