package parte1.ejercicio5;

public class Triangulo extends Poligono{

	double lado1 = 1;
	double lado2 = 1;
	double lado3 = 1;
	
	public Triangulo() {
	}

	

	public Triangulo(double lado1, double lado2, double lado3) {
		this.lado1 = lado1;
		this.lado2 = lado2;
		this.lado3 = lado3;
	}

	public double getLado1() {
		return lado1;
	}



	public void setLado1(double lado1) {
		this.lado1 = lado1;
	}



	public double getLado2() {
		return lado2;
	}



	public void setLado2(double lado2) {
		this.lado2 = lado2;
	}



	public double getLado3() {
		return lado3;
	}



	public void setLado3(double lado3) {
		this.lado3 = lado3;
	}


	public String toString() {
		return "Triangulo, lado 1 :"+lado1+", lado 2 :"+lado2+", lado 3 :"+lado3+", Area:"+area();
	}
	

	public double area() {
		
		double s;
		
		double area;
		
		s=(lado1+lado2+lado3)/2;
		
		area=Math.sqrt(s*(s-lado1)*(s-lado2)*(s-lado3));
		
		return area;
	}
	
	
	
}
