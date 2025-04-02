package parte3.ejercicio1;

public class Turismo extends Vehiculo {
	
	enum Tipo{PROFESIONAL, PARTICULAR}
	
	private int numeroPlazas;
	private Tipo tipo;

	public Turismo(String marca, String modelo, String color, String matricula, int plazas, Tipo tipo) {
		super(marca, modelo, color, matricula);
		if(plazas>=2) {
			this.numeroPlazas=plazas;
		}
		
		
	}

}
