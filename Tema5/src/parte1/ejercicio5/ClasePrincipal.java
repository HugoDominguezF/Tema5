package parte1.ejercicio5;

import java.util.ArrayList;
import java.util.Scanner;

public class ClasePrincipal {

	public static void main(String[] args) {

		ArrayList<Object> lista = new ArrayList<Object>();

		Scanner sc = new Scanner(System.in);

		int comando;

		double lados;

		menu();
		comando = sc.nextInt();

		while (comando != 4) {
			switch (comando) {
			case 1 -> {

				Triangulo nuevo = new Triangulo();

				System.out.println("Cuanto mide el lado 1?");
				lados = sc.nextDouble();
				nuevo.setLado1(lados);

				System.out.println("Cuanto mide el lado 2?");
				lados = sc.nextDouble();
				nuevo.setLado2(lados);

				System.out.println("Cuanto mide el lado 3?");
				lados = sc.nextDouble();
				nuevo.setLado3(lados);

				lista.add(nuevo);
			}
			case 2 -> {
				Rectangulo nuevo = new Rectangulo();

				System.out.println("Cuanto mide el lado 1?");
				lados = sc.nextDouble();
				nuevo.setLado1(lados);

				System.out.println("Cuanto mide el lado 2?");
				lados = sc.nextDouble();
				nuevo.setLado2(lados);

				lista.add(nuevo);
			}
			case 3 -> {
				mostrar(lista);
			}
			default -> {
				System.out.println("Ese numero no es valido");
			}
			}
			menu();
			comando = sc.nextInt();
		}

	}

	public static void menu() {
		System.out.println("1) Introducir Triangulo");
		System.out.println("2) Introducit Rectangulo");
		System.out.println("3) Mostrar poligonos");
		System.out.println("4) Salir");
	}
	public static void mostrar(ArrayList<Object> lista) {
		for (Object object : lista) {
			System.out.println(object);
		}
	}
	
}
