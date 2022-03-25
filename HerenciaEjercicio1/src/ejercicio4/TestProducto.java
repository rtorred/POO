package ejercicio4;

import java.util.Scanner;

public class TestProducto {

	static Producto[] productos = new Producto[10];
	static Scanner sn = new Scanner(System.in);

	public static void creaProductoPerecedero() {

		String nombreP;
		double precioP;
		int diasP;
		for (int i = 0; i < 5; i++) {
			sn.nextLine();
			System.out.println("Introduce el nombre del producto: ");
			nombreP = sn.nextLine();

			System.out.println("Introduce el precio del producto: ");
			precioP = sn.nextDouble();
			sn.nextLine();
			System.out.println("Introduce los dias que le queda al producto\n para caducarse :");
			diasP = sn.nextInt();

			Perecedero p = new Perecedero(nombreP, precioP, diasP);
			productos[i] = p;
		}
	}

	public static void creaProductoNoPerecedero() {

		String nombreNP,tipoNP;
		double precioNP;
		
		for (int i = 0; i < 5; i++) {
			sn.nextLine();
			System.out.println("Introduce el nombre del producto: ");
			nombreNP = sn.nextLine();

			System.out.println("Introduce el precio del producto: ");
			precioNP = sn.nextDouble();
			sn.nextLine();
			System.out.println("Introduce los dias que le queda al producto\n para caducarse :");
			tipoNP = sn.nextLine();

			NoPerecedero np = new NoPerecedero(nombreNP, precioNP, tipoNP);
			productos[i] = np;
		}
	}

	public static void CRUD(int opcion) {

		do {
			System.out.println("Menu de Productos");
			System.out.println("1.Crea producto perecedero");
			System.out.println("2.Crea producto no perecedero");
			System.out.println("3.Salir");
			opcion=sn.nextInt();
			switch (opcion) {
			case 1:
				creaProductoPerecedero();
				break;
			case 2:
				creaProductoNoPerecedero();
				break;
			case 3:

				break;

			}

		} while (opcion != 3);
	}

	public static void mostrarArray() {
		for (int i = 0; i < productos.length; i++) {
			System.out.println(productos[i]);
			System.out.println(productos[i].calculaTotal(5));
		}
	}

	public static void main(String[] args) {
		int opcion = 0 ;

		CRUD(opcion);
		mostrarArray();

	}

}
