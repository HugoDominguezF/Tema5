package parte4.comparator;

import java.util.ArrayList;
import java.util.Random;

public class OrdenarNumeros{

	public static void main(String[] args) {
		
		Random rand = new Random();
		
		ArrayList<Integer> lista = new ArrayList<>();
		
		for(int i=0;i<20;i++) {
			lista.add(rand.nextInt(1,100));
		}
		
		System.out.println(lista);
		
		lista.sort(new ComparaNumeros());
		
		System.out.println(lista);
	}

}
