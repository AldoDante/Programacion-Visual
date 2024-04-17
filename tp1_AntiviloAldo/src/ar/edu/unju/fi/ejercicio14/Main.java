package ar.edu.unju.fi.ejercicio14;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int largo;
		
		//Ingreso de la longitud del array(do-while)
		//si no se encuentra en rango vuelve a pedir el ingreso
		do {			
			System.out.println("Ingrese un nro entero en el rango [3-10]");
			largo=sc.nextInt();
			
			if (largo < 3 || largo > 10 )
				System.out.println("Numero fuera de Rango");
			
		} while(largo < 3 || largo > 10);		
		
		//array para almacenar elementos de tipo entero
		int [] array = new int [largo];
		
		// bucle for para ingresar numeros al array
		
		for (int i=0; i< largo;i++) {
			System.out.print("Ingrese un número entero para la posición " + i + ": ");
			int num = sc.nextInt();
			array[i]= num;
		}
		int sum=0;
		
		System.out.print("\nValores del Array\n");
		
		//bucle for para mostrar los elementos del array
		
		for (int i=0; i<largo;i++) {
			System.out.print("\nEn la posicion "+i+" se encuentra el valor "+array[i]);
			sum= sum+array[i];
		}
		System.out.print("\nLa Suma de los valores del arreglo es: "+sum);
		sc.close();
	}
}
