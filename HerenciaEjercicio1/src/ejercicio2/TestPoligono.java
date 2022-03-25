package ejercicio2;

import java.util.ArrayList;
import java.util.Scanner;



public class TestPoligono {

	
	static Scanner sn = new Scanner(System.in);
	static int MAX_POL;
	static ArrayList<Poligono> pol = new ArrayList<Poligono>();
	
	public static void llenarTriangulo() {
		
		double lado1,lado2,lado3;
		System.out.println("Introduce el lado1 :");
		lado1 = sn.nextDouble();
		
		System.out.println("Introduce el lado2 :");
		lado2 = sn.nextDouble();
		
		System.out.println("Introduce el lado3 :");
		lado3 = sn.nextDouble();
		Triangulo t = new Triangulo(lado1,lado2,lado3);
		pol.add(t);
		
	}
	
	public static void llenarRectangulo() {
		double lado1,lado2;
		System.out.println("Introduce el lado1");
		lado1=sn.nextDouble();
		
		System.out.println("Introduce el lado2");
		lado2=sn.nextDouble();
		
		Rectangulo r=new Rectangulo(lado1, lado2);
		pol.add(r);
	}

	public static void CRUD() {
		int opcion;
		do {

			System.out.println("MENU POLIGONO");
			System.out.println("1. Introducir triángulo.");
			System.out.println("2. Introducir rectángulo.");
			System.out.println("3. Salir");
			System.out.println("Introduce la opcion");
			opcion= sn.nextInt();
			switch (opcion) {
			case 1:
				llenarTriangulo();
				break;

			case 2:
				llenarRectangulo();
				break;
			case 3:
				System.out.println("Adioos!!");
				break;
			}

		} while (opcion!=3);
	}
	
	public static void imprimeDatos() {
		for (Poligono poligono : pol) {
			System.out.println(poligono.toString());
			
		}
	}

	public static void main(String[] args) {
		CRUD();
		imprimeDatos();

	}

}
