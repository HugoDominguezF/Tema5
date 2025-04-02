package parte4.Socio;

import java.util.ArrayList;

import parte2.ejercicio1.Socio;

public class ClaseMain {

	public static void main(String[] args) {
		
		ArrayList<Socio> lista = new ArrayList<Socio>();
		
		Socio sc = new Socio(2, 21, "manolo");
		Socio sc2 = new Socio(3, 63, "paco");
		Socio sc3 = new Socio(4, 34, "eustaquio");
		
		lista.add(sc);
		lista.add(sc2);
		lista.add(sc3);
		
		System.out.println(lista);
		
		lista.sort(new CompararNombres());
		
		System.out.println(lista);
		
		lista.sort(new CompararEdad());
		
		System.out.println(lista);
		
		
	}

}
