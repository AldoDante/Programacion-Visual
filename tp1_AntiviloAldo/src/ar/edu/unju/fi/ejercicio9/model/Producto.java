package ar.edu.unju.fi.ejercicio9.model;

public class Producto {
	private String nombre;
	private int codigo;
	private Double precio;
	private int descuento;
	
	public Producto() {
		
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public Double getPrecio() {
		return precio;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
	}

	public int getDescuento() {
		return descuento;
	}

	public void setDescuento(int descuento) {
		this.descuento = descuento;
	}
	
	// Método para calcular el descuento
	
    public double calcularDescuento() {
    	
        double precioConDescuento = 0 ;
        
        if (descuento > 0 && descuento <= 50) {
        	double valorDescuento = precio*((double)descuento/100);
            precioConDescuento = precio- valorDescuento;
        }
        return precioConDescuento;
    }

}
