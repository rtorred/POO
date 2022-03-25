package ejercicio3;

public class Repartidor extends Empleado {

	private String zona;

	public Repartidor(String nombre, int edad, double salario, String zona) {
		super(nombre, edad, salario);
		this.zona = zona;
	}

	public Repartidor() {
		super();
	}

	public String getZona() {
		return zona;
	}

	public void setZona(String zona) {
		this.zona = zona;
	}

	@Override
	public String toString() {
		return super.toString() + "\n" + "Repartidor zona=" + zona;
	}

	public void plusSalarioRepartidor() {
		if (getEdad() < 25 && zona.equals("zona 3")) {
			setSalario(getSalario() + getPLUS());
		}

	}
}
