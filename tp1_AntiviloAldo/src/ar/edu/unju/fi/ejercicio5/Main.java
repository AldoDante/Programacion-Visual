package ar.edu.unju.fi.ejercicio5;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		// Ejercicio 5
		
		Scanner sn = new Scanner(System.in);
		
		System.out.println("ingrese un numero entre el rango [0-9]");
		
		int numero=sn.nextInt();
		
		if (numero>9 || numero <0) {
			
			System.out.println("El numero esta fuera de rango");
		} else {
			
			for (int i=0; i<10 ; i++) {
				int num=numero;
				num=num*i;
				System.out.println(numero+" x "+i+" = "+num);
			}
		}		
	}
}