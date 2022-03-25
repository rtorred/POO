package ejercicio3;

public class Comercial extends Empleado {
	
	private double comision;
	


	public Comercial(String nombre, int edad, double salario, double comision) {
		super(nombre, edad, salario);
		this.comision = comision;
	}




	public Comercial() {
		super();
	}




	public double getComision() {
		return comision;
	}




	public void setComision(double comision) {
		this.comision = comision;
	}




	@Override
	public String toString() {
		return super.toString()
				+"\n"+"Comercial comision=" + comision;
	}
	
	public void plusSalarioComercial() {
		if (getEdad()>30 && comision>300) {
			setSalario(getSalario() + getPLUS());
		}
	}
	
	

}
