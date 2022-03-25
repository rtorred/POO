package CuentaTest;

import java.util.Scanner;

import Cuenta.Cuenta;

public class CuentaTest {

	public static void main(String[] args) {
		Cuenta cuenta1 = new Cuenta();
		Scanner sc= new Scanner(System.in);
		cuenta1.setNombreCliente(sc.nextLine());
		cuenta1.setNumeroCuenta(sc.nextLine());
		cuenta1.setSaldo(sc.nextDouble());
		cuenta1.setTipoInteres(sc.nextDouble());
		
		System.out.println(cuenta1.getNombreCliente());
		System.out.println(cuenta1.getNumeroCuenta());
		System.out.println(cuenta1.getSaldo());
		System.out.println(cuenta1.getTipoInteres());
		
		
		
	}

}
