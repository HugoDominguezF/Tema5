package parte3.ejercicio2;

import java.util.TreeSet;

public class CuentaBancaria {

	String numCuenta;
	double saldo;
	TreeSet<Titular> lista = new TreeSet<Titular>();

	public CuentaBancaria(Titular t) {

	}

	public boolean ingresar(double dinero) {

		boolean posible = true;

		if (dinero <= 0) {
			posible = false;
		}

		return posible;
	}

	public boolean retirar(double dinero) {

		boolean posible = true;

		if (dinero <= 0 || dinero > this.saldo) {
			posible = false;
		}

		return posible;
	}

	public boolean addTitular(Titular t) {

		boolean posible = false;

		if (lista.size() < 3) {
			
			lista.add(t);
			
			posible = true;
		}

		return posible;

	}

	public boolean removeTitular(Titular t) {
		boolean posible = false;

		if (lista.remove(t)) {
			
			lista.add(t);
			
			posible = true;
		}

		return posible;

	}

}
