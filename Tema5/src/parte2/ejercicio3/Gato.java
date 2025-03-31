package parte2.ejercicio3;

import java.util.Random;

public class Gato {
	
	public void toserBolaDePelo() {
		System.out.println("Gwaa.. *Saca una bola de pelo*");
	}
	
	public void hacerRuido() {
		
		System.out.println("Maulla*");;
	}
	
	public boolean hacerCaso() {
		
		Random rand = new Random();
		
		boolean caso=false;
		
		int aleatorio;
		
		aleatorio = rand.nextInt(1,101);
		
		if(aleatorio<6) {
			caso=true;
		}
		
		return caso;
	}
	
	
}
