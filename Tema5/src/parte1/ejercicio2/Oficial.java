package parte1.ejercicio2;

public class Oficial extends Operario{

	public Oficial(String nombre) {
		super(nombre);
	}
	
	public String toString() {
		return super.toString()+" -> Oficial";
	}
	
}
