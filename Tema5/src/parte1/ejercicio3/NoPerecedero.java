package parte1.ejercicio3;

public class NoPerecedero extends Productos {

	private String tipo;

	public NoPerecedero(String nombre, int precio, String tipo) {
		super(nombre, precio);
		this.tipo = tipo;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		if (tipo != null && !tipo.isBlank()) {
			this.tipo = tipo;
		}

	}

	public String toString() {
		return super.toString() + ", Tipo: " + tipo;
	}

	public double calcular(int cantidad) {

		return super.calcular(cantidad);

	}

}
