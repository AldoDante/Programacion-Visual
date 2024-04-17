package ar.edu.unju.fi.ejercicio16;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
		
		 //Array para almacenar 5 elementos de tipo String
        
		String[] nombres = new String[5];

        // Solicitar al usuario que ingrese los nombres de las personas		
        
        for (int i = 0; i < nombres.length; i++) {
            System.out.print("Ingrese el nombre de la persona en la posicion " + i + ": ");
            nombres[i] = scanner.nextLine();
        }

        // Mostrar el array utilizando un bucle while
        
        System.out.println("\nNombres ingresados:");
        
        int contador = 0;
        
        while (contador < nombres.length) {
            System.out.println(nombres[contador]);
            contador++;
        }

        // Mostrar el tamaño del array
        System.out.println("\nTamaño del array: " + nombres.length);

        //índice del elemento a eliminar
        
        byte indiceEliminar;
        
        do {
            System.out.print("\nIngrese el índice del elemento a eliminar (0 - 4): ");
            indiceEliminar = scanner.nextByte();
            
            if (indiceEliminar < 0 || indiceEliminar >= nombres.length) {
                System.out.println("El índice ingresado está fuera de rango");
            }
        } while (indiceEliminar < 0 || indiceEliminar >= nombres.length);

       // Eliminar el elemento del array y realizar el desplazamiento
        
        for (int j = indiceEliminar; j < nombres.length - 1; j++) {
            nombres[j] = nombres[j + 1];
        }
                        
        nombres[nombres.length - 1] = ""; 

        // Array después de eliminar el elemento
        
        System.out.println("\nArray después de eliminar el elemento:");
        
        for (int k = 0; k<nombres.length; k++) {
            System.out.println(nombres[k]);
        }

        scanner.close();

	}

}
