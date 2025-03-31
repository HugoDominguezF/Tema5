package parte2.ejercicio3;

import java.util.Random;

public class Perro extends AnimalDomestico{
	
	public void sacarDePaseo() {
		System.out.println("El perro fue sacado de paseo, ahora es mas feliz");
	}
	
	public void hacerRuido() {
		
		System.out.println("Labra*");;
	}
	
	public boolean hacerCaso() {
		
		Random rand = new Random();
		
		boolean caso=false;
		
		int aleatorio;
		
		aleatorio = rand.nextInt(1,101);
		
		if(aleatorio<91) {
			caso=true;
		}
		
		return caso;
	}
	
	
}
