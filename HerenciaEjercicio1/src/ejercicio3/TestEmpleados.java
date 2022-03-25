package ejercicio3;

public class TestEmpleados {

	public static void main(String[] args) {
		Comercial c1 = new Comercial("Pedro", 31, 1200, 200);
		Comercial c2 = new Comercial("Pedro", 30, 1200, 250);
		Comercial c3 = new Comercial("Pedro", 33, 1200, 400);
		
		Repartidor r1 = new Repartidor("Jose", 25, 1300, "zona 3");
		Repartidor r2 = new Repartidor("Jose", 22, 1300, "zona 2");
		Repartidor r3 = new Repartidor("Jose", 20, 1300, "zona 3");
		System.out.println("Sin PLUS");
		System.out.println("=======================================================");
		System.out.println("Salario sin plus del comercial 1:" + c1.getSalario());
		System.out.println("Salario sin plus del comercial 2:" + c2.getSalario());
		System.out.println("Salario sin plus del comercial 3:" + c3.getSalario());
		System.out.println();
		System.out.println("=======================================================");
		System.out.println("Salario sin plus del repartidor 1:" + r1.getSalario());
		System.out.println("Salario sin plus del repartidor 2:" + r2.getSalario());
		System.out.println("Salario sin plus del repartidor 3:" + r3.getSalario());
		System.out.println();
		System.out.println("=======================================================");
		
		
		c1.plusSalarioComercial();
		c2.plusSalarioComercial();
		c3.plusSalarioComercial();
		
		r1.plusSalarioRepartidor();
		r2.plusSalarioRepartidor();
		r3.plusSalarioRepartidor();
		
		System.out.println("Resultado");
		System.out.println("=======================================================");
		System.out.println("Salario con plus del comercial 1:" + c1.getSalario());
		System.out.println("Salario con plus del comercial 2:" + c2.getSalario());
		System.out.println("Salario con plus del comercial 3:" + c3.getSalario());
		System.out.println();
		System.out.println("=======================================================");
		System.out.println("Salario con plus del repartidor 1:" + r1.getSalario());
		System.out.println("Salario con plus del repartidor 2:" + r2.getSalario());
		System.out.println("Salario con plus del repartidor 3:" + r3.getSalario());
		System.out.println();
		System.out.println("=======================================================");
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
	}

}
