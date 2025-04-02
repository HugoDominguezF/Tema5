package parte4.Futbolista;

import java.util.Comparator;

import parte2.ejercicio2.Futbolista;

public class CompararEdad implements Comparator<Futbolista>{

	public int compare(Futbolista o1, Futbolista o2) {
		
		return o1.getEdad()-o2.getEdad();
	}

}
