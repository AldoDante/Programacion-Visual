package ar.edu.unju.fi.ejercicio8;

import java.util.Scanner;

import ar.edu.unju.fi.ejercicio8.model.CalculadoraEspecial;

public class Main {

	public static void main(String[] args) {
				
		Scanner sc = new Scanner(System.in);
		
		System.out.println("ingrese un numero entero");
		int nro = sc.nextInt();
		
		CalculadoraEspecial calculadora = new CalculadoraEspecial();
		calculadora.setN(nro);
		
		double sum= calculadora.calcularSumatoria();
		int prod= calculadora.calcularProductoria();

		
		System.out.printf("\nResultado de la sumatoria: %.0f ", +sum);
		System.out.println("\nResultado de la productoria de "+nro +" es: "+prod);
		
		sc.close();
	}

}