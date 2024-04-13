package ar.edu.unju.fi.ejercicio7;

import java.util.Scanner;
import ar.edu.unju.fi.ejercicio7.model.Empleado;


public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        // Solicitar datos para un nuevo empleado
        System.out.println("Ingrese el nombre del empleado:");
        String nombre = sc.nextLine();
        System.out.println("Ingrese el legajo:");
        int legajo = sc.nextInt();
        System.out.println("Ingrese el salario:");
        double salario = sc.nextDouble();

        // Crear objeto Empleado utilizando el constructor parametrizado
        
        Empleado empleado = new Empleado(nombre, legajo, salario);

        // Mostrar datos empleado
        
        System.out.println("\nDatos del empleado:");
        empleado.mostrarDatos();

        // Dar un aumento de salario 
        empleado.darAumento();

        // Mostrar datos empleado con aumento
        
        System.out.println("\nDatos del empleado con aumento de sueldo:");
        empleado.mostrarDatos();

        sc.close();

	}

}
