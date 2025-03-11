package parte1.ejercicio1;

public class HoraExacta extends Hora {

	private int segundos;

	public HoraExacta(int hora, int minutos, int segundos) {
		super(hora, minutos);
		if (segundos < 60 && segundos >= 0) {
			this.segundos = segundos;
		}
	}

	public boolean setSegundos(int valor) {

		boolean valido;

		if (valor >= 0 && valor <= 59) {
			this.segundos = valor;
			valido = true;
		} else {
			valido = false;
		}
		return valido;
	}

	public void inc() {

		if (segundos < 59) {
			segundos++;
		} else {
			minutos++;
			segundos = 0;
		}

	}

	public String toString() {

		return super.toString() + ":" + segundos;
	}

}
