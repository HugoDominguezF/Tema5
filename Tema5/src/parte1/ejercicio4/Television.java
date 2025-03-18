package parte1.ejercicio4;

public class Television extends Electrodomestico{
	
	int resolucion=20;
	boolean sintonizadorTDT=false;
	
	
	public Television(double precioBase, int peso, String color, char consumoElectrico, int resolucion, boolean sintonizador) {
		
		super(precioBase, peso, color, consumoElectrico);
		
		this.resolucion = resolucion;
		this.sintonizadorTDT = sintonizador;
	}
	
	public Television(double precioBase, int peso) {
		super(precioBase, peso);
	}

	public int getResolucion() {
		return resolucion;
	}

	public void setResolucion(int resolucion) {
		this.resolucion = resolucion;
	}

	public boolean isSintonizadorTDT() {
		return sintonizadorTDT;
	}

	public void setSintonizadorTDT(boolean sintonizadorTDT) {
		this.sintonizadorTDT = sintonizadorTDT;
	}
	
	public void precioFinal() {
		super.precioFinal();
		if(resolucion > 40) {
			precioBase= precioBase + precioBase*0.3;
		}
		if(sintonizadorTDT) {
			precioBase+=50;
		}
	}
	
	
	
}
