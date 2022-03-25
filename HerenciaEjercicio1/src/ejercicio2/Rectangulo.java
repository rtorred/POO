package ejercicio2;

public class Rectangulo extends Poligono {
	
	private double lado1;
	private double lado2;
	
	
	public Rectangulo(double lado1, double lado2) {
		super(2);
		this.lado1 = lado1;
		this.lado2 = lado2;
	}

	

	public Rectangulo() {
		
	}

	@Override
	public String toString() {
		return super.toString() +"lado1" + lado1 + "lado2 " + lado2 +"area "+area();
	}

	
	public double area() {
		return (lado1*lado2)/numeroLados;
	}
	
	

}
