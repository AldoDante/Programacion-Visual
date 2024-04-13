package ar.edu.unju.fi.ejercicio8.model;

public class CalculadoraEspecial {
	
	private int n;
	
	public CalculadoraEspecial() {
		// constructor por defecto
	}

	
	
	public int getN() {
		return n;
	}



	public void setN(int n) {
		this.n = n;
	}



	public double calcularSumatoria() {
		double sumatoria = 0;
		double result;
		
		for (int k = 1; k <= n; k++) {
			
			result = ((k*(k+1))/2) * ((k*(k+1))/2);
			sumatoria = sumatoria + result;
			
		}
		
		return sumatoria;
	}
	
	
	public int calcularProductoria() {
		
		int productoria = 1;
		int result;
		
		for (int k = 1; k <= n; k++) {
			
			result = (k*(k+4));
			productoria = productoria * result;
			
		}
		
		return productoria;
		
	}

}