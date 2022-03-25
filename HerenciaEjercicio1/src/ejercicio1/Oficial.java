package ejercicio1;

public class Oficial extends Operario {
	
	public Oficial(String nombre) {
		super(nombre);
	}
	
	public Oficial() {
		
	}
	
	
	public String toString() {
		return  super.toString() + "-> OFICIAL";
	}

}
