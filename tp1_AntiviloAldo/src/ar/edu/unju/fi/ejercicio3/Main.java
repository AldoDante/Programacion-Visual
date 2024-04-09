package ar.edu.unju.fi.ejercicio3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		//Ejercicio 3
		
		//Creo el objeto Scanner para la entrada del nro 
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ingrese un numero entero: ");
		System.out.println("Si es par x 3, Si es impar impar x22: ");
		//leer el nro ingresado
		int num = sc.nextInt();
		
		if ((num%2)==0) {
			System.out.println("El numero es par");
			num=num*3;
			System.out.println("Resultado:"+num);
		}
		else {
			System.out.println("El numero es impar");
			num=num*2;
			System.out.println("Resultado:"+num);
		}
	}

}
