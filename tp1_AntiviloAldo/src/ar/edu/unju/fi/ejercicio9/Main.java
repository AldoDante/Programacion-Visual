package ar.edu.unju.fi.ejercicio9;

import java.util.Scanner;

import ar.edu.unju.fi.ejercicio9.model.Producto;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        // Array para almacenar los Productos
		
        Producto[] productos = new Producto[3];

        // Solicitar al usuario que ingrese valores 
        
        for (int i = 0; i < productos.length; i++) {
            
        	Producto producto = new Producto();
            System.out.println("Ingrese el nombre del producto:");
            producto.setNombre(scanner.nextLine());
            System.out.println("Ingrese el código del producto:");
            producto.setCodigo(scanner.nextInt());
            System.out.println("Ingrese el precio del producto:");
            producto.setPrecio(scanner.nextDouble());
            System.out.println("Ingrese el descuento del producto (valor entero entre 0 y 50):");
            producto.setDescuento(scanner.nextInt());
            scanner.nextLine();
            
            // Almacenar el objeto Producto en el array
            
            productos[i] = producto;
        }

        // Mostrar los datos ingresados para cada producto y el precio con descuento
        
        for (int i = 0; i < productos.length; i++) {
        	
            System.out.println("\nDatos del producto " + (i + 1) + ":");
            System.out.println("Nombre: " + productos[i].getNombre());
            System.out.println("Código: " + productos[i].getCodigo());
            System.out.println("Precio: $" + productos[i].getPrecio());
            System.out.println("Descuento: " + productos[i].getDescuento()+"%");
            System.out.println("Precio con descuento: $" + productos[i].calcularDescuento());
        }

        scanner.close();

	}

}
