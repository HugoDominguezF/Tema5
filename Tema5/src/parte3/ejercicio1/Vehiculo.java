package parte3.ejercicio1;

public class Vehiculo {

	private String marca;
	private String modelo;
	private String color;
	private String matricula;
	private boolean motorEncendido=false;
	private int marchaActual;
	private double velocidadActual;

	public Vehiculo(String marca, String modelo, String color, String matricula) {
		if (marca != "" && !marca.isBlank()) {
			this.marca = marca;
		}
		if (modelo != "" && !modelo.isBlank()) {
			this.modelo = modelo;
		}
		if (color != "" && !color.isBlank()) {
			this.color = color;
		}
		if (matricula != "" && !matricula.isBlank()) {
			this.matricula = matricula;
		}
		this.motorEncendido = false;

		this.marchaActual = 1;

		this.velocidadActual = 0;
	}

	public void aumentarVelocidad(double velocidad) {

		double velMarcha;

		velMarcha = velocidadDeMarcha(marchaActual);

		while (velocidad > velMarcha && this.marchaActual < 5) {
			this.velocidadActual = velMarcha;
			subirMarcha();
			velMarcha = velocidadDeMarcha(marchaActual);
		}
		this.velocidadActual = velocidad;

	}

	public void bajarVelocidad(double velocidad) {

		double velMarcha;

		velMarcha = velocidadDeMarcha(marchaActual);

		while (this.marchaActual > 1) {
			this.velocidadActual = velMarcha;
			bajarMarcha();
			velMarcha = velocidadDeMarcha(marchaActual);
		}
		this.velocidadActual = 0;

	}

	public double velocidadDeMarcha(int marcha) {

		int maximo = 0;

		switch (marcha) {
		case 1 -> {
			maximo = 30;
		}
		case 2 -> {
			maximo = 50;
		}
		case 3 -> {
			maximo = 70;
		}
		case 4, 5 -> {
			maximo = 100;
		}
		}
		return maximo;
	}

	public void parar() {
		if (velocidadActual == 0) {
			this.motorEncendido = false;

		}
	}

	public void arrancar() {
		if (velocidadActual == 0) {
			this.motorEncendido = true;
		}
	}

	public void subirMarcha() {
		this.marchaActual += 1;

	}

	public void bajarMarcha() {
		this.marchaActual -= 1;

	}
}
