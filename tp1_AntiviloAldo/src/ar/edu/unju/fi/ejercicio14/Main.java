package ar.edu.unju.fi.ejercicio14;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int largo;
		
		do {			
			System.out.println("Ingrese un nro entero en el rango [3-10]");
			largo=sc.nextInt();
			
			if (largo < 3 || largo > 10 )
				System.out.println("Numero fuera de Rango");
			
		} while(largo < 3 || largo > 10);		
		
		int [] array = new int [largo];
		
		for (int i=0; i< largo;i++) {
			System.out.print("Ingrese un número entero para la posición " + i + ": ");
			int num = sc.nextInt();
			array[i]= num;
		}
		int sum=0;
		
		System.out.print("\nValores del Array\n");
		
		for (int i=0; i<largo;i++) {
			System.out.print("\nEn la posicion "+i+" se encuentra el valor "+array[i]);
			sum= sum+array[i];
		}
		System.out.print("\nLa Suma de los valores del arreglo es: "+sum);
		sc.close();
	}
}
