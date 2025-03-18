package parte1.ejercicio4;

public class MainClase {

	public static void main(String[] args) {
		
		
		Electrodomestico a = new Electrodomestico(100, 50, "NEGRO", 'B');
		Lavadora b = new Lavadora(100, 50, "fuxia", 'B', 40);
		Television c = new Television(100, 50, "GRIS", 'B', 41, true);
		
		a.precioFinal();
		b.precioFinal();
		c.precioFinal();
		
		System.out.println(a.getPrecioBase());
		System.out.println(b.getPrecioBase());
		System.out.println(c.getPrecioBase());
		
		
		
		System.out.println(a.getPrecioBase()+b.getPrecioBase()+c.getPrecioBase());
	}

}
