package parte1.ejercicio5;

public abstract class Poligono {

	private int numeroDeLados;

	public Poligono(int numeroDeLados) {
		this.numeroDeLados = numeroDeLados;
	}

	public int getNumeroDeLados() {
		return numeroDeLados;
	}

	public String toString() {
		return "Numero de lados: " + numeroDeLados;
	}

	public abstract double area();
}
