package FechaTest;

import Fecha.Fecha;

public class FechaTest {

	public static void main(String[] args) {
		Fecha f1 = new Fecha(10, 02, 2010);
		
		f1.diaSiguiente();
		System.out.println(f1);
		
		System.out.println(f1.fechaCorrecta());
		
		

	}

}
