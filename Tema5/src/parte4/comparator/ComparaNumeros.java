package parte4.comparator;

import java.util.Comparator;

public class ComparaNumeros implements Comparator<Integer>{

	
	public int compare(Integer o1, Integer o2) {
		
		return o2.compareTo(o1);
		
	}

}
