package ar.edu.unju.fi.ejercicio13;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
				 
		int [] num = new int [8];
		
		for (int i = 0; i < num.length; i++ ) {
			System.out.println("Ingrese un numero entero");
			num[i]= sc.nextInt();
		}
		
		System.out.println("\nValores ingresados:\n");
			 
		for (int j = 0; j < num.length; j++) {
		 System.out.println("Índice " + j + ": " + num[j]);
		        }

		sc.close();
			
		}
	}

