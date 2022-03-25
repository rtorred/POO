package ejercicio1;

public class Tecnico extends Operario {
	
	public Tecnico(String nombre) {
		super(nombre);
	}
	
	public Tecnico() {
		
	}
	
	
	public  String toString() {
		return  super.toString() + "-> TECNICO";
	}
}
