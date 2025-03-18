package parte1.ejercicio5;

public abstract class Poligono {
	
	private int numeroDeLados;
	
	public Poligono() {
	}

	public int getNumeroDeLados() {
		return numeroDeLados;
	}
	
	public String toString() {
		return "Numero de lados: "+numeroDeLados;
	}
	
	public abstract double area();
}
