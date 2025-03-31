package parte2.ejercicio3;


public abstract class AnimalDomestico implements Animal{

	
	private String nombre;
	private String raza;
	private int peso;
	private String color;
	
	
	public void vacunar() {
		System.out.println("Se ha vacunado exitosamente");
	}
	
	public abstract boolean hacerCaso();
	
	public void comer() {
		this.peso+=1;
	}

	public void dormir() {
		System.out.println("ZZZZZZZZZZZZZZZZZ");
	}

	public abstract void hacerRuido();

}
