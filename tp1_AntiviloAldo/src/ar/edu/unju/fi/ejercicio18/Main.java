package ar.edu.unju.fi.ejercicio18;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import ar.edu.unju.fi.ejercicio18.model.DestinoTuristico;
import ar.edu.unju.fi.ejercicio18.model.Pais;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		List <Pais> paises = new ArrayList<>();
		List <DestinoTuristico> destinos = new ArrayList<>();
		
		// Precargar paises
		
		paises.add(new Pais("ES","España" ));
		paises.add(new Pais("IT", "Italia"));
		
int op;
		
		do {
            System.out.println("\nMenú de opciones:");
            System.out.println("1 – Alta de destino turístico");
            System.out.println("2 – Mostrar todos los destinos turísticos.");
            System.out.println("3 – Modificar el país de un destino turístico.");
            System.out.println("4 – Limpiar el ArrayList de destino turísticos.");
            System.out.println("5 – Eliminar un destino turístico");
            System.out.println("6 – Mostrar los destinos turísticos ordenados por nombre.");
            System.out.println("7 – Mostrar todos los países.");
            System.out.println("8 – Mostrar los destinos turísticos que pertenecen a un país");
            System.out.println("9 – Salir.");
            try {
            System.out.print("Ingrese la opción deseada: ");
            op = sc.nextInt();
          
            switch (op) {
            	case 1: alta(sc, paises, destinos); break;
                case 2: //mostrarDestinos(destinos); break;               	
                case 3: //modificarPaisDestino(sc, paises, destinos); break;
                case 4: //limpiar(destinos);break;
                case 5: //eliminarDestino(sc, destinos); break;
                case 6: //mostrarDestinoOrdenado(destino);  break;          
                case 7:// paises(paises); break;
                case 8: //mostrarDestinosPorPais(sc, destinos);; break;
                case 9:	System.out.println("¡Chaito!"); break;
                default:System.out.println("Opción no válida, ingrese un numero [1-9].");      
                }
            } catch (InputMismatchException e) {
            	sc.nextLine();
            	System.err.println("\nError en el formato");
            	op=0;
            } finally {
            	//System.out.println("\nVuelva a ingresar una opcion");
            	System.out.println("\n-----------------------"); 
            }
        } while (op != 9);
		 sc.close();	
	}
	
	private static void alta(Scanner sc, List<Pais> paises, List<DestinoTuristico> destinos) {
        try {
            sc.nextLine();
            System.out.println("\nAlta de destino turístico:");
            System.out.print("Ingrese el código del país: ");
            String codigoPais = sc.nextLine();
            Pais pais = buscarPaisPorCodigo(paises, codigoPais);
            
            if (pais == null) {
                throw new Exception("El país con código " + codigoPais + " no existe.");
            }
            System.out.print("Ingrese el código del destino turístico: ");
            String codigo = sc.nextLine();
            System.out.print("Ingrese el nombre del destino turístico: ");
            String nombre = sc.nextLine();
            System.out.print("Ingrese el precio del destino turístico: ");
            double precio = sc.nextDouble();
            System.out.print("Ingrese la cantidad de días del destino turístico: ");
            int cantDias = sc.nextInt();
            DestinoTuristico destino = new DestinoTuristico(codigo, nombre, precio, pais, cantDias);
            destinos.add(destino);
            System.out.println("\nDestino turístico agregado correctamente.");
        } catch (InputMismatchException e) {
            System.err.println("Error: Debe ingresar un valor numérico para el precio o la cantidad de días.");
            sc.nextLine(); // Limpiar el buffer de entrada
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
	
	private static Pais buscarPaisPorCodigo(List<Pais> paises, String codigo) {
        for (Pais pais : paises) {
            if (pais.getCodigo().equals(codigo)) {
                return pais;
            }
        }
        return null;
    }
}
