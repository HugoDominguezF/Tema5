package parte2.ejercicio1;

public class Socio implements Comparable<Socio> {

	private int id;
	private int edad;
	private String nombre;

	public Socio(int id, int edad, String nombre) {

		this.id = id;
		this.edad = edad;
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public String getNombre() {
		return nombre;
	}

	public String toString() {
		return "Id: " + id + ", Nombre: " + nombre + ", Edad: " + edad;
	}

	public int compareTo(Socio a) {

		int res = 0;
		Socio nuevo = (Socio) a;
		if (this.id < nuevo.id) {
			res = -1;
		} else if (this.id > nuevo.id) {
			res = 1;
		}
		return res;
	}
	

}
