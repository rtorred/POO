package fraccionTest;

import fraccion.fraccion;

public class fraccionTest {

	public static void main(String[] args) {
		fraccion f1 = new fraccion(1,2);
		fraccion f2 = new fraccion(1,4);
		
		fraccion suma = f1.sumar(f2);
		System.out.println(suma);
		fraccion resta = f1.restar(f2);
		System.out.println(resta);
		fraccion multiplica = f1.multiplicar(f2);
		System.out.println(multiplica);
		fraccion divide = f1.dividir(f2);
		System.out.println(divide);
		
		System.out.println(suma.simplificar());

	}

}
