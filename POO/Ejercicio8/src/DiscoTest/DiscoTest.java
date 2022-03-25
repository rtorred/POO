package DiscoTest;

import java.util.Scanner;

import Disco.Disco;

public class DiscoTest {

	public static void main(String[] args) {
		Disco[] discos = new Disco[100];
		Scanner s = new Scanner(System.in);

		for (int i = 0; i < discos.length; i++) {
			discos[i] = new Disco();
		}
		int cont = 0;
		int menu;
		String buscaCodigo;
		String autorModificado;
		String tituloModificado;
		String generoModificado;
		int duracionModificado;
		String borraCodigo;
		String autorNuevo;
		String tituloNuevo;
		String generoNuevo;
		int codigoNuevo;
		int duracionNuevo;

		do {

			System.out.println("\n\nCOLECCIÓN DE DISCOS");
			System.out.println("===================");
			System.out.println("1. Listado");
			System.out.println("2. Nuevo disco");
			System.out.println("3. Modificar");
			System.out.println("4. Borrar");
			System.out.println("5. Salir");
			System.out.print("Introduzca una opción del menu: ");
			menu = s.nextInt();

			switch (menu) {
			case 1:
				System.out.println("El listado de discos es este : ");
				for (int j = 0; j < discos.length; j++) {
					if (discos[j].getCodigo().equals("LIBRE")) {
						System.out.println(discos[j]);
					}
				}
				break;
			case 2:
				boolean encontrado= false;
				for (int j = 0; j < discos.length && !encontrado; j++) {
					if (discos[j].getCodigo().equals("LIBRE")) {
						encontrado =true;
						s.nextLine();
						System.out.println("Introduce el autor: ");
						autorNuevo = s.nextLine();
						System.out.println("Introduce el titulo: ");
						tituloNuevo = s.nextLine();
						System.out.println("Introduce el genero: ");
						generoNuevo = s.nextLine();
						System.out.println("Introduce la duracion : ");
						duracionNuevo = s.nextInt();
						codigoNuevo= cont;
						discos[j].setAutor(autorNuevo);
						discos[j].setTitulo(tituloNuevo);
						discos[j].setGenero(generoNuevo);
						discos[j].setDuracion(duracionNuevo);
						discos[j].setCodigo(Integer.toString(codigoNuevo));
					}

				}
				cont++;
				break;
			case 3:
				System.out.println("Dame el código del disco : ");
				buscaCodigo = s.nextLine();
				for (int i = 0; i < discos.length; i++) {
					if (discos[i].getCodigo().equals(buscaCodigo)) {
						System.out.println("Dame el autor nuevo del disco : ");
						autorModificado = s.nextLine();
						System.out.println("Dame el titulo nuevo del disco : ");
						tituloModificado = s.nextLine();
						System.out.println("Dame el genero nuevo del disco : ");
						generoModificado = s.nextLine();
						System.out.println("Dame la duracion nuevo del disco : ");
						duracionModificado = s.nextInt();

						discos[i].setAutor(autorModificado);
						discos[i].setTitulo(tituloModificado);
						discos[i].setGenero(generoModificado);
						discos[i].setDuracion(duracionModificado);
					}
				}
				break;
			case 4:
				s.nextLine();
				System.out.println("Dame el codigo del disco a borrar : ");
				borraCodigo = s.nextLine();
				for (int i = 0; i < discos.length; i++) {
					if (borraCodigo.equals(discos[i].getCodigo())) {
						discos[i].setCodigo("LIBRE");
					}
				}
				break;

			}

		} while (menu != 5);

	}

}
