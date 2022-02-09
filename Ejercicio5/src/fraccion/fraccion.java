package fraccion;

public class fraccion {
	
	private int num;
	private int den;
	
	public fraccion() {
		super();
	}

	public fraccion(int num, int den) {
		super();
		this.num = num;
		this.den = den;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public int getDen() {
		return den;
	}

	public void setDen(int den) {
		this.den = den;
	}
	
	public fraccion sumar(fraccion f) {
		fraccion suma = new 
				fraccion((((den*f.getDen())/den)*num)+(((den*f.getDen())/f.getDen())*f.getNum()) ,(den*f.getDen()));
		return suma;
	}
	
	public fraccion restar(fraccion f) {
		fraccion resta = new 
				fraccion((((den*f.getDen())/den)*num)-(((den*f.getDen())/f.getDen())*f.getNum()) ,(den*f.getDen()));
		return resta;
	}
	
	public fraccion multiplicar(fraccion f) {
		fraccion multiplica = new
				fraccion(num*f.getNum(),den*f.getDen());
		return multiplica;
	}
	
	public fraccion dividir(fraccion f) {
		fraccion divide = new
				fraccion(num*f.getDen(),den*f.getNum());
		return  divide;
	}
	

	public String toString() {
		return num + "/" + den;
	}
	
	

}
