package parte1.ejercicio1;

public class Hora {

	protected int hora;
	protected int minutos;

	public Hora(int hora, int minutos) {
		if (hora >= 0 && hora < 24 && minutos < 60 && minutos >= 0) {
			this.hora = hora;
			this.minutos = minutos;

		}
	}

	public void inc() {

		if (minutos < 59) {
			minutos++;
		} else {
			hora++;
			minutos = 0;
		}

	}

	public boolean setMinutos(int valor) {

		boolean valido;

		if (valor >= 0 && valor <= 59) {
			this.minutos = valor;
			valido = true;
		} else {
			valido = false;
		}
		return valido;
	}

	public boolean setHora(int valor) {

		boolean valido;

		if (valor >= 0 && valor <= 23) {
			this.minutos = valor;
			valido = true;
		} else {
			valido = false;
		}
		return valido;
	}

	public String toString() {
		return hora + ":" + minutos;
	}

}
