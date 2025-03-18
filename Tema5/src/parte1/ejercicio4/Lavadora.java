package parte1.ejercicio4;

public class Lavadora extends Electrodomestico{
	
	private int carga = 5;

	public Lavadora(double precioBase, int peso, String color, char consumoElectrico, int carga) {
		super(precioBase, peso, color, consumoElectrico);
		this.carga = carga;
	}

	public Lavadora(double precioBase, int peso) {
		super(precioBase, peso);
	}

	public int getCarga() {
		return carga;
	}

	public void setCarga(int carga) {
		this.carga = carga;
	}
	
	
	public void precioFinal() {
		
		super.precioFinal();
		if(carga > 30) {
			this.precioBase +=50;
		}
		
	}
	
	
}
