package ejercicio2;

public abstract class Poligono {
	
	protected int numeroLados;

	public Poligono(int numeroLados) {
		super();
		this.numeroLados = numeroLados;
	}

	public Poligono() {
		super();
	}

	@Override
	public String toString() {
		return "Poligono :"+ numeroLados ;
	}
	
	public abstract double area();
	
	

}
