package parte4.Socio;

import java.util.Comparator;

import parte2.ejercicio1.Socio;

public class CompararNombres implements Comparator<Socio> {

	public int compare(Socio o1, Socio o2) {
		
		return o1.getNombre().compareTo(o2.getNombre());
	}

}
