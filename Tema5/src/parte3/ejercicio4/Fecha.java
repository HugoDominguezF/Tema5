package parte3.ejercicio4;

public class Fecha {

	private int dia = 1;
	private int mes = 1;
	private int anyo = 1991;

	public Fecha(int dia, int mes, int anyo) {
		this.dia = dia;
		this.mes = mes;
		this.anyo = anyo;
	}

	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public int getAnyo() {
		return anyo;
	}

	public void setAnyo(int anyo) {
		if (anyo > 0) {
			this.anyo = anyo;
		}
	}

	public String toString() {
		String cadena = "";
		if (dia < 10) {
			cadena += "0";
		}
		cadena += dia + "-";
		if (mes < 10) {
			cadena += "0";
		}
		cadena += mes + "-" + anyo;
		return cadena;
	}
}