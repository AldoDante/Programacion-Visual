package ar.edu.unju.fi.ejercicio17;


import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Comparator;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import ar.edu.unju.fi.ejercicio17.model.Jugador;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		List <Jugador> jugadores = new ArrayList<Jugador>();
		
		int op;
		
		do {
            System.out.println("\nMenú de opciones:");
            System.out.println("1 - Alta de jugador");
            System.out.println("2 - Datos del jugador");
            System.out.println("3 - Jugadores ordenados por apellido");
            System.out.println("4 - Modificar los datos de un jugador");
            System.out.println("5 - Eliminar un jugador");
            System.out.println("6 - Mostrar la cantidad total de jugadores");
            System.out.println("7 - Mostrar la cantidad de jugadores que pertenecen a una nacionalidad");
            System.out.println("8 - Salir");
            
            System.out.print("Ingrese la opción deseada: ");
            op = sc.nextInt();
          
            switch (op) {
            	case 1:
                    alta(sc, jugadores);
                    break;
                case 2:
                	datosJugador(sc, jugadores);
                    break;
                case 3:
                	mostrarOrdenados(jugadores);
                    break;
                case 4:
                    modificarDatos(sc, jugadores);
                    break;
                case 5:
                	eliminarJugador(sc, jugadores);
                    break;
                case 6:
                    CantidadJugadores(jugadores);
                    break;
                case 7:
                   JugadoresNacionalidad(sc, jugadores);
                    break;
                case 8:
                    System.out.println("¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, ingrese una opción válida.");
                }
         
        } while (op != 8);

        sc.close();
        }
        
        // Alta de Jugadores
        
        private static void alta(Scanner sc, List<Jugador> jugadores) {
            try {
            	sc.nextLine();
                System.out.println("\nAlta de jugador:");
                System.out.print("Ingrese el nombre: ");
                String nombre = sc.nextLine();                
                System.out.print("Ingrese el apellido: ");
                String apellido = sc.nextLine();
                System.out.print("Ingrese la fecha de nacimiento (en formato dd/mm/yyyy): ");
                String fechaStr = sc.nextLine();
                Calendar fechaNac = Calendar.getInstance();
                String[] partesFecha = fechaStr.split("/");
                int dia = Integer.parseInt(partesFecha[0]);
                int mes = Integer.parseInt(partesFecha[1]) - 1;
                int anio = Integer.parseInt(partesFecha[2]);
                fechaNac.set(anio, mes, dia);
                System.out.print("Ingrese la nacionalidad: ");
                String nacionalidad = sc.nextLine();
                System.out.print("Ingrese la estatura: ");
                double estatura = sc.nextDouble();
                System.out.print("Ingrese el peso: ");
                double peso = sc.nextDouble();
                sc.nextLine();
                System.out.print("Ingrese la posición (delantero, medio, defensa, arquero): ");
                String posicion = sc.nextLine();

                Jugador jugador = new Jugador(nombre, apellido, fechaNac, nacionalidad, estatura, peso, posicion);
                jugadores.add(jugador);
                System.out.println("\nJugador agregado correctamente.");               
            } catch (NumberFormatException | ArrayIndexOutOfBoundsException | InputMismatchException e) {
                System.err.println("\nError: Formato de fecha incorrecto.");
            }
        }
        
        private static void datosJugador(Scanner sc, List<Jugador> jugadores) {
        		sc.nextLine();
                System.out.println("\nMostrar datos del jugador:");
                System.out.print("Ingrese el nombre: ");                
                String nombre = sc.nextLine();
                System.out.print("Ingrese el apellido: ");
                String apellido = sc.nextLine();

                boolean encontrado = false;
                for (Jugador jugador : jugadores) {
                    if (jugador.getNombre().equalsIgnoreCase(nombre) //ignorar mayusculas o minusculas
                            && jugador.getApellido().equalsIgnoreCase(apellido)) {
                        encontrado = true;
                        System.out.println("Nombre: " + jugador.getNombre());
                        System.out.println("Apellido: " + jugador.getApellido());
                        System.out.println("Fecha de nacimiento: " + jugador.getFechaNac().getTime());
                        System.out.println("Nacionalidad: " + jugador.getNacionalidad());
                        System.out.println("Estatura: " + jugador.getEstatura()+" m");
                        System.out.println("Peso: " + jugador.getPeso()+" kg");
                        System.out.println("Posición: " + jugador.getPosicion());
                        System.out.println("Edad: " + jugador.calcularEdad()+" años");
                        break;
                    }               
                if (!encontrado) {
                    System.out.println("No se encontró ningún jugador con ese nombre y apellido.");
                }
            }                     
        }
        
        private static void mostrarOrdenados(List<Jugador> jugadores) {
           
                System.out.println("\nMostrar todos los jugadores ordenados por apellido:");
                List<Jugador> jugadoresOrdenados = new ArrayList<>(jugadores);
                Collections.sort(jugadoresOrdenados, Comparator.comparing(jugador -> jugador.getApellido().toLowerCase()));
                for (Jugador jugador : jugadoresOrdenados) {
                    System.out.println(jugador.getApellido()+" "+jugador.getNombre());
                }          
        }
        
        private static void modificarDatos(Scanner sc, List<Jugador> jugadores) {
        		sc.nextLine();
            try {
                System.out.println("\nModificar los datos de un jugador:");
                System.out.print("Ingrese el nombre: ");
                String nombre = sc.nextLine();
                sc.nextLine();
                System.out.print("Ingrese el apellido: ");
                String apellido = sc.nextLine();

                boolean encontrado = false;
                for (Jugador jugador : jugadores) {
                    if (jugador.getNombre().equalsIgnoreCase(nombre) && jugador.getApellido().equalsIgnoreCase(apellido)) {
                        encontrado = true;
                        System.out.print("Nuevo nombre: ");
                        jugador.setNombre(sc.nextLine());
                        System.out.print("Nuevo apellido: ");
                        jugador.setApellido(sc.nextLine());
                        System.out.print("Nueva fecha de nacimiento (en formato dd/mm/yyyy): ");
                        String fechaStr = sc.nextLine();
                        String[] partesFecha = fechaStr.split("/");
                        int dia = Integer.parseInt(partesFecha[0]);
                        int mes = Integer.parseInt(partesFecha[1]) - 1;
                        int anio = Integer.parseInt(partesFecha[2]);
                        jugador.getFechaNac().set(anio, mes, dia);
                        System.out.print("Nueva nacionalidad: ");
                        jugador.setNacionalidad(sc.nextLine());
                        System.out.print("Nueva estatura: ");
                        jugador.setEstatura(sc.nextDouble());
                        System.out.print("Nuevo peso: ");
                        jugador.setPeso(sc.nextDouble());
                        sc.nextLine(); // 
                        System.out.print("Nueva posición (delantero, medio, defensa, arquero): ");
                        jugador.setPosicion(sc.nextLine());
                        System.out.println("Datos del jugador modificados correctamente.");
                        break;
                    }
                }
                if (!encontrado) {
                    System.out.println("No se encontró ningún jugador con ese nombre y apellido.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Error: Formato de fecha, estatura o peso incorrecto.");
            }
        }
        
        private static void eliminarJugador(Scanner sc, List<Jugador> jugadores) {
        	sc.nextLine();
        	if(jugadores.isEmpty()) {
        		System.err.println("\nLista Vacia:");
        	} else {
            try {
                System.out.println("\nEliminar un jugador:");
                System.out.print("Ingrese el nombre: ");
                String nombre = sc.nextLine();
                System.out.print("Ingrese el apellido: ");
                String apellido = sc.nextLine();

                boolean encontrado = false;
                for (int i = 0; i < jugadores.size(); i++) {
                    Jugador jugador = jugadores.get(i);
                    if (jugador.getNombre().equalsIgnoreCase(nombre) && jugador.getApellido().equalsIgnoreCase(apellido)) {
                        encontrado = true;
                        jugadores.remove(i);
                        System.out.println("Jugador eliminado.");
                        break;
                    }
                }
                if (!encontrado) {
                    System.out.println("No se encontró ningún jugador con ese nombre y apellido.");
                }
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());}
        	}        
        }
        
        //Cantidad de Jugadores
        
        private static void CantidadJugadores(List<Jugador> jugadores) {
        	if(jugadores.isEmpty()) {
        		System.err.println("\nLista Vacia:");
        	} else {
        		System.out.println("\nCantidad total de jugadores: " + jugadores.size());
        	}
        	
        }
        
        private static void JugadoresNacionalidad(Scanner scanner, List<Jugador> jugadores) {
        	
        	if (jugadores.isEmpty()) {
        		System.err.println("\nLista Vacia");
        	} else {
          
                System.out.println("\nMostrar la cantidad de jugadores que pertenecen a una nacionalidad:");
                System.out.print("Ingrese la nacionalidad: ");
                String nacionalidad = scanner.nextLine();

                int cantidad = 0;
                for (Jugador jugador : jugadores) {
                    if (jugador.getNacionalidad().equalsIgnoreCase(nacionalidad)) {
                        cantidad++;
                    }
                }
                System.out.println("Cantidad de jugadores de la nacionalidad '" + nacionalidad + "': " + cantidad);
            
        	}
        }
}

