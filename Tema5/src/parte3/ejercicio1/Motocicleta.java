package parte3.ejercicio1;

public class Motocicleta extends Vehiculo{

	private double cilindrada;
	
	public Motocicleta(String marca, String modelo, String color, String matricula, double cilindrada) {
		super(marca, modelo, color, matricula);
		this.cilindrada=cilindrada;
		
	}

	public boolean requiereCarnet() {
		
		boolean requiere=false;
		
		if(cilindrada>=125) {
			requiere=true;
		}
		return requiere;
	}
}
