package parte4.Futbolista;

import java.util.ArrayList;

import parte2.ejercicio2.Futbolista;

public class ClaseMain {

	public static void main(String[] args) {
		
		ArrayList<Futbolista> lista = new ArrayList<Futbolista>();
		
		Futbolista a = new Futbolista(20, "Puyol", 62, 85);
		Futbolista b = new Futbolista(21, "Cristiano", 53, 462);
		Futbolista c = new Futbolista(22, "Lewasoski", 39, 164);
		Futbolista d = new Futbolista(23, "Yamal", 18, 38);
		Futbolista e = new Futbolista(24, "Abascal", 42, 2);
		
		lista.add(a);
		lista.add(b);
		lista.add(c);
		lista.add(d);
		lista.add(e);
		
		System.out.println(lista);
		
		lista.sort(new CompararEdad());
		
		System.out.println(lista);
		
		lista.sort(new CompararGoles());
		
		System.out.println(lista);
		
	}

}
