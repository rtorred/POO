package ejercicio1;

public class Directivo extends Empleado {
	
	public Directivo(String nombre) {
		super(nombre);
	}
	
	public Directivo() {
		
	}
	
	public  String toString() {
		return  super.toString() + "-> DIRECTIVO";
	}
	
	

}
