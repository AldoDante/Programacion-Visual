package ar.edu.unju.fi.ejercicio10.model;

public class Pizza {
	
	private int diametro;
    private double precio;
    private double area;
    private boolean ingredientesEspeciales;
    public static final double especiales20 = 500.0;
    public static final double especiales30 = 750.0;
    public static final double especiales40 = 1000.0;

    // Constructor por defecto
    
    public Pizza() {
    }

    // Métodos accesores
    
    public int getDiametro() {
        return diametro;
    }

    public void setDiametro(int diametro) {
        this.diametro = diametro;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public boolean isIngredientesEspeciales() {
        return ingredientesEspeciales;
    }

    public void setIngredientesEspeciales(boolean ingredientesEspeciales) {
        this.ingredientesEspeciales = ingredientesEspeciales;
    }

    // Método para calcular el precio de la pizza
    
    public void calcularPrecio() {
        switch (diametro) {
            case 20:
                if (ingredientesEspeciales) {
                    precio = 4500.0 + especiales20;
                } else {
                    precio = 4500.0;
                }
                break;
            case 30:
                if (ingredientesEspeciales) {
                    precio = 4800.0 + especiales30;
                } else {
                    precio = 4800.0;
                }
                break;
            case 40:
                if (ingredientesEspeciales) {
                    precio = 5500.0 + especiales40;
                } else {
                    precio = 5500.0;
                }
                break;
            default:
                System.out.println("Diámetro de pizza no válido.");
        }
    }

    // Método para calcular el área de la pizza
    
    public void calcularArea() {
        area = Math.PI * Math.pow(diametro / 2.0, 2);
    
    }
}
