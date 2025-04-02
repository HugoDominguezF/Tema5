package parte3.ejercicio1;

public class Camion extends Vehiculo{

	private final double PESOMAXIMOAUTORIZADO=400;
	
	private boolean mercanciaPeligrosa;
	
	public Camion(String marca, String modelo, String color, String matricula, boolean mercanciaPeligrosa) {
		super(marca, modelo, color, matricula);
		this.mercanciaPeligrosa=mercanciaPeligrosa;
	}

}
