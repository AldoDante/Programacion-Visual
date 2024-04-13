package ar.edu.unju.fi.ejercicio6;

import ar.edu.unju.fi.ejercicio6.model.Persona;


import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Constructor por defecto
        
        Persona persona1 = new Persona();
        System.out.println("Persona 1 Sin Datos");
       

        // Constructor parametrizado
        
        System.out.println("Ingrese el DNI de Persona 2:");
        String dni2 = scanner.nextLine();
        System.out.println("Ingrese el Nombre de Persona 2:");
        String nombre2 = scanner.nextLine();
        System.out.println("Ingrese la Fecha de Nacimiento de Persona 2 (yyyy-MM-dd):");
        LocalDate fechaNacimiento2 = LocalDate.parse(scanner.nextLine());
        System.out.println("Ingrese la Provincia de Persona 2:");
        String provincia2 = scanner.nextLine();
        
        Persona persona2 = new Persona(dni2, nombre2, fechaNacimiento2, provincia2);
        System.out.println("Datos de Persona 2 (Constructor parametrizado):");
        persona2.mostrarDatos();
        System.out.println();

        // Constructor con dni, nombre y fecha de nacimiento
        
        
        System.out.println("Ingrese el DNI de Persona 3:");
        String dni3 = scanner.nextLine();
        System.out.println("Ingrese el Nombre de Persona 3:");
        String nombre3 = scanner.nextLine();
        System.out.println("Ingrese la Fecha de Nacimiento de Persona 3 (yyyy-MM-dd):");
        LocalDate fechaNacimiento3 = LocalDate.parse(scanner.nextLine());
        Persona persona3 = new Persona(dni3, nombre3, fechaNacimiento3);
        System.out.println("Datos de Persona 3 (Constructor con dni, nombre y fecha de nacimiento):");
        persona3.mostrarDatos();

        scanner.close();
    }
}