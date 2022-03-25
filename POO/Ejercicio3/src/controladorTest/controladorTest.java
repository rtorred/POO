package controladorTest;

import controlador.controlador;

public class controladorTest {

	public static void main(String[] args) {
		
		controlador c1= new controlador();
		c1.setCont(6);
		
		c1.incrementar();
		
		System.out.println(c1.getCont());
		
		c1.decrementar();
		
		System.out.println(c1.getCont());
		
		
		controlador c2 = new controlador(10);
		
		c2.incrementar();
		
		System.out.println(c2.getCont());
		
		c2.decrementar();
		
		System.out.println(c2.getCont());
		
		

	}

}
