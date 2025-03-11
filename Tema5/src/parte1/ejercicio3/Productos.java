package parte1.ejercicio3;

public class Productos {

	protected String nombre;
	protected int precio;

	public Productos(String nombre, int precio) {

		if (nombre != null && !nombre.isBlank() && precio > 0) {
			this.nombre = nombre;

			this.precio = precio;
		}

	}

	public String getNombre() {
		return nombre;
	}

	public int getPrecio() {
		return precio;
	}

	public void setNombre(String nombre) {
		if (nombre != null && !nombre.isBlank()) {
			this.nombre = nombre;
		}
	}

	public void setPrecio(int precio) {
		if (precio > 0) {
			this.precio = precio;
		}
	}

	public String toString() {
		return "Nombre: " + nombre + ", Precio: " + precio;
	}

	public double calcular(int cantidad) {

		return precio * cantidad;

	}

}
