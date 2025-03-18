package parte1.ejercicio4;

public class Electrodomestico {

	enum Color {
		BLANCO, NEGRO, ROJO, AZUL, GRIS
	};

	protected double precioBase = 100;
	protected int peso = 5;
	protected Color color = Color.BLANCO;
	protected char consumoElectrico = 'F';

	public Electrodomestico(double precioBase, int peso, String color, char consumoElectrico) {

		if (precioBase > 0) {
			this.precioBase = precioBase;
		}else {
			this.precioBase = 100;
		}
		if (peso > 0) {
			this.peso = peso;
		}else {
			
		}
		if (comprobarColor(color)) {
			this.color = Color.valueOf(color);
		}
		if (comprobarConsumoEnergetico(consumoElectrico)) {
			this.consumoElectrico = consumoElectrico;

		}else {
			this.consumoElectrico = 'F';
		}
	}

	public Electrodomestico(double precioBase, int peso) {

		if (precioBase > 0) {
			this.precioBase = precioBase;
		}
		if (peso > 0) {
			this.peso = peso;
		}
	}
	
	private boolean comprobarConsumoEnergetico(char letra) {
		
		return letra >= 'A' && letra <= 'F';
	}
	
	private boolean comprobarColor(String color) {
		boolean valido=true;
		try {
			Color.valueOf(color);
		}catch(IllegalArgumentException e){
			valido = false;
		}
		return valido;
	}

	public double getPrecioBase() {
		return precioBase;
	}

	public int getPeso() {
		return peso;
	}

	public Color getColor() {
		return color;
	}

	public char getConsumoElectrico() {
		return consumoElectrico;
	}
	
	public void setColor(Color color) {
		this.color = color;
	}
	public void setConsumoElectrico(char consumoElectrico) {
		this.consumoElectrico = consumoElectrico;
	}
	
	public void setPrecioBase(double precioBase) {
		this.precioBase = precioBase;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	public void precioFinal(){
		switch(consumoElectrico) {
		case 'A' ->{precioBase+=100;}
		case 'B' ->{precioBase+=80;}
		case 'C' ->{precioBase+=60;}
		case 'D' ->{precioBase+=50;}
		case 'E' ->{precioBase+=30;}
		case 'F' ->{precioBase+=10;}
		}
		
		if(peso<20) {
			precioBase+=10;
		}else if(peso>=20 && peso<50) {
			precioBase+=50;
		}else if(peso>=50 && peso<80) {
			precioBase+=80;
		}else {
			precioBase+=100;
		}
	}

}
