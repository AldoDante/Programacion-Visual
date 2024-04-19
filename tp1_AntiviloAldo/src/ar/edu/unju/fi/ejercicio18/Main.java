package ar.edu.unju.fi.ejercicio18;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import ar.edu.unju.fi.ejercicio18.model.DestinoTuristico;
import ar.edu.unju.fi.ejercicio18.model.Pais;


public class Main {

public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		List<Pais> paises = new ArrayList<>();
        List<DestinoTuristico> destinos = new ArrayList<>();
        
        paises.add(new Pais("AR","Argentina"));
        paises.add(new Pais("BR","Brasil"));
        paises.add(new Pais("UR","Uruguay"));
        
		int op;
		
		do {
			 System.out.println("\n---------------------Menú-------------------------");
		     System.out.println("1 - Alta de destino turístico");
		     System.out.println("2 - Mostrar todos los destinos turísticos");
		     System.out.println("3 - Modificar el país de un destino turístico");
		     System.out.println("4 - Limpiar el ArrayList de destino turísticos");
		     System.out.println("5 - Eliminar un destino turístico");
		     System.out.println("6 - Mostrar los destinos turísticos ordenados por nombre");
		     System.out.println("7 - Mostrar todos los países");
		     System.out.println("8 - Mostrar los destinos turísticos por país");
		     System.out.println("9 - Salir");
            
            try {
            System.out.print("Ingrese la opción deseada: ");
            op = sc.nextInt();
          
            switch (op) {
            	case 1: altaDestino(sc, paises, destinos); break;
                case 2: mostrarOrdenado(destinos); break;               	
                case 3: modificarPais(sc, paises, destinos); break;
                case 4: limpiar(destinos);break;
                case 5: eliminarDestino(sc, destinos); break;
                case 6: DestinosOrdenados(destinos);  break;          
                case 7: paises(paises); break;
                case 8: DestinosPorPais (sc, destinos); break;
                case 9:	System.out.println("¡Chaito!"); break;
                default:System.out.println("Opción no válida, ingrese un numero [1-8].");      
                }
            } catch (InputMismatchException e) {
            	sc.nextLine();
            	System.err.println("\nError en el formato");
            	op=0;
            } finally {
            	//System.out.println("\nVuelva a ingresar una opcion");
            	System.out.println("\n---------------------------------"); 
            }
        } while (op != 9);
		 sc.close();
	}

    
    

    private static void altaDestino(Scanner sc, List<Pais> paises, List<DestinoTuristico> destinos) {
        try {
            sc.nextLine();
            System.out.println("\nLista de Paises---");
            System.out.println("\nAR: Argentina\"");
            System.out.println("\nBR: Brasil");
            System.out.println("\nUR: Uruguay");
            System.out.println("--------------------");
            System.out.print("\nIngrese el código del país: ");
            String codigoPais = sc.nextLine();
            Pais pais = buscarPaisPorCodigo(paises, codigoPais);
            
            if (pais == null) {
               System.err.println("\nEl país con código " + codigoPais + " no existe.");
            } else {
            System.out.print("Ingrese el código del destino turístico: ");
            String codigoDestino = sc.nextLine();
            System.out.print("Ingrese el nombre del destino turístico: ");
            String nombreDestino = sc.nextLine();
            System.out.print("Ingrese el precio del destino turístico: ");
            double precioDestino = sc.nextDouble();
            System.out.print("Ingrese la cantidad de días del destino turístico: ");
            int cantidadDias = sc.nextInt();
            DestinoTuristico destino = new DestinoTuristico(codigoDestino, nombreDestino, precioDestino, pais, cantidadDias);
            destinos.add(destino);
            System.out.println("\nDestino turístico agregado correctamente.");
            }
        } catch (InputMismatchException e) {
            System.err.println("\nIngrese un valor numérico para el precio o la cantidad de días.");
            sc.nextLine();// Limpiar el buffer        
          } 
    }

    private static void mostrarOrdenado(List<DestinoTuristico> destinos) {
        if (destinos.isEmpty()) {
            System.out.println("\nNo hay destinos turísticos.");
        } else {
            System.out.println("\n--- Destinos Turísticos ---");
            for (DestinoTuristico destino : destinos) {
                System.out.println(destino);
            }
        }
    }

    private static void modificarPais(Scanner sc, List<Pais> paises, List<DestinoTuristico> destinos) {
    	 if (destinos.isEmpty()) {
    	        System.out.println("\nNo hay destinos para modificar");
    	        return;
    	    }
    	    sc.nextLine();
    	    System.out.print("\nIngrese el código del destino turístico a modificar: ");
    	    String codigoDestino = sc.nextLine();
    	    boolean encontrado = false;

    	    for (DestinoTuristico destino : destinos) {
    	        if (destino.getCodigo().equals(codigoDestino)) {
    	            encontrado = true;
    	            System.out.print("Ingrese el nuevo código del país: ");
    	            String nuevoCodigoPais = sc.nextLine();
    	            Pais nuevoPais = buscarPaisPorCodigo(paises, nuevoCodigoPais);
    	            if (nuevoPais == null) {
    	                System.err.println("Error: El país con código " + nuevoCodigoPais + " no existe");
    	                return;
    	            }
    	            destino.setPais(nuevoPais);
    	            System.out.println("\nPaís del destino turístico modificado correctamente.");
    	            break;
    	        }
    	    }

    	    if (!encontrado) {
    	        System.err.println("Error: No se encontró ningún destino turístico con código " + codigoDestino);
    	    }
    }

    private static void limpiar(List<DestinoTuristico> destinos) {
        destinos.clear();
        System.out.println("\nLista de destinos turísticos limpiada correctamente.");
    }

    private static void eliminarDestino(Scanner sc, List<DestinoTuristico> destinos) {
        if (destinos.isEmpty()) {
            System.out.println("\nNo hay destinos turísticos para eliminar.");
            return;
        }
        sc.nextLine();
        System.out.print("\nIngrese el código del destino turístico a eliminar: ");
        String codigoDestino = sc.nextLine();
        Iterator<DestinoTuristico> iterator = destinos.iterator();
        boolean encontrado = false;
        while (iterator.hasNext()) {
            DestinoTuristico destino = iterator.next();
            if (destino.getCodigo().equals(codigoDestino)) {
                iterator.remove();
                encontrado = true;
                System.out.println("Destino turístico eliminado correctamente.");
                break;
            }
        }
        if (!encontrado) {
            System.err.println("Error: No se encontró ningún destino turístico con código " + codigoDestino);
        }
    }

    private static void DestinosOrdenados(List<DestinoTuristico> destinos) {
        if (destinos.isEmpty()) {
            System.out.println("\nNo hay destinos turísticos para mostrar.");
        } else {
            System.out.println("\n--- Destinos Turísticos Ordenados por Nombre ---");
            List<DestinoTuristico> destinosOrdenados = new ArrayList<>(destinos);
            Collections.sort(destinosOrdenados, Comparator.comparing(DestinoTuristico::getNombre));
            for (DestinoTuristico destino : destinosOrdenados) {
                System.out.println(destino);
            }
        }
    }

    private static void paises(List<Pais> paises) {
        if (paises.isEmpty()) {
            System.out.println("\nNo hay países para mostrar.");
        } else {
            System.out.println("\n--- Países ---");
            for (Pais pais : paises) {
                System.out.println(pais);
            }
        }
    }

    private static void DestinosPorPais(Scanner sc, List<DestinoTuristico> destinos) {
        sc.nextLine();
    	if (destinos.isEmpty()) {
    		System.err.println("\nNo existen destinos para mostrar");
    	} else {
    	System.out.print("\nIngrese el código del país para mostrar destinos: ");
    	String codPais = sc.nextLine();
    	boolean encontrado = false;
    	for (DestinoTuristico destino : destinos) {
    		if (destino.getPais().getCodigo().equalsIgnoreCase(codPais)) {
    			System.out.print("\nLista de Destinos: ");
    			System.out.println(destino);
                encontrado = true;
                
    		}
    	}
    	if (!encontrado) {
            System.err.println("No hay destinos turísticos para el país con código " + codPais);}
    	} 		
    }

    private static Pais buscarPaisPorCodigo(List<Pais> paises, String codigo) {
        for (Pais pais : paises) {
            if (pais.getCodigo().equalsIgnoreCase(codigo)) {
                return pais;
            }
        }
        return null;
    }
}