package ar.edu.unju.fi.ejercicio7.model;

public class Empleado {
    private String nombre;
    private int legajo;
    private double salario;

    // Constantes
    public static final double SALARIO_MINIMO = 210000.00;
    public static final double AUMENTO_POR_MERITOS = 20000.00;

    
    // Constructor parametrizado
    
    public Empleado(String nombre, int legajo, double salario) {
        this.nombre = nombre;
        this.legajo = legajo;
        
        // Asignación del salario
        
        if (salario >= SALARIO_MINIMO) {
            this.salario = salario;
        } else {
            this.salario = SALARIO_MINIMO;
        }
    }

    // Método para mostrar los datos del empleado
    
    public void mostrarDatos() {
        System.out.println("Nombre del empleado: " + nombre);
        System.out.println("Legajo: " + legajo);
        System.out.printf("Salario $:%.0f%n ", +salario);
    }

    // Método para dar un aumento al salario del empleado
    
    public void darAumento() {
        salario = salario + AUMENTO_POR_MERITOS;
    }
}