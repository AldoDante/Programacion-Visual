package ar.edu.unju.fi.ejercicio10;

import java.util.Scanner;

import ar.edu.unju.fi.ejercicio10.model.Pizza;

public class Main {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);

	        Pizza[] pizzas = new Pizza[3];

	        for (int i = 0; i < pizzas.length; i++) {
	            Pizza pizza = new Pizza();
	            System.out.println("Ingrese el diámetro de la pizza, 20(chica) 30 (mediana) 40(grande):");
	            pizza.setDiametro(scanner.nextInt());
	            System.out.println("¿Lleva ingredientes especiales? (true/false):");
	            pizza.setIngredientesEspeciales(scanner.nextBoolean());

	            // Calcular precio y área de la pizza
	            
	            pizza.calcularPrecio();
	            pizza.calcularArea();

	            // Almacenar el objeto Pizza en el array
	            
	            pizzas[i] = pizza;
	        }

	        // Mostrar los datos ingresados y el Precio
	        
	        for (int i = 0; i < pizzas.length; i++) {
	            System.out.println("\nPizza " + (i + 1) + ":");
	            System.out.println("Diámetro: " + pizzas[i].getDiametro());
	            System.out.println("Precio: $" + pizzas[i].getPrecio());
	            System.out.println("Área: " + pizzas[i].getArea());
	        }

	        scanner.close();

	}

}
