package parte1.ejercicio3;

public class Perecedero extends Productos {
	
	private int diasACaducar;

	public Perecedero(String nombre, int precio, int diasACaducar) {
		super(nombre, precio);
		this.diasACaducar = diasACaducar;
	}
	
	public int getDiasACaducar() {
		return diasACaducar;
	}
	public void setDiasACaducar(int diasACaducar) {
		this.diasACaducar = diasACaducar;
	}
	public String toString() {
		return super.toString()+", Dias a caducar: "+diasACaducar;
	}
	
	public double calcular(int cantidad) {
		
        double precioFinal = super.calcular(cantidad);
        
        switch (diasACaducar) {
            case 1:
                precioFinal /= 4;
            case 2:
                precioFinal /= 3;
            case 3:
                precioFinal /= 2;
        }
        return precioFinal;
    }
	
}
