package ejercicio3;

public class Empleado {
	
	private String nombre;
	private int edad;
	private double salario;
	
	private final double PLUS=300;

	public Empleado(String nombre, int edad, double salario) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.salario = salario;
	}

	public Empleado() {
		super();
	}
	
	

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public double getPLUS() {
		return PLUS;
	}

	@Override
	public String toString() {
		return "Empleado:"
				+"\n"+ "nombre: " + nombre 
				+"\n"+ "edad: " + edad 
				+"\n"+ "salario: " + salario;
	}
	
	
	

}
