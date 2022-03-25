package ejercicio4;

public class Perecedero extends Producto {
	
	private int diaCaduca;
	
	

	public Perecedero(String nombre, double precio) {
		super(nombre, precio);
	}

	public Perecedero(String nombre, double precio, int diaCaduca) {
		super(nombre, precio);
		this.diaCaduca = diaCaduca;
	}

	public Perecedero() {
		// TODO Auto-generated constructor stub
	}

	public int getDiaCaduca() {
		return diaCaduca;
	}

	public void setDiaCaduca(int diaCaduca) {
		this.diaCaduca = diaCaduca;
	}

	@Override
	public String toString() {
		return super.toString()+"\n"
				+ "Perecedero [diaCaduca=" + diaCaduca + "]";
	}
	
	public double calculaPerecedero(int unidades) {
		double res= calculaTotal(unidades);
		switch (diaCaduca) {
		case 1:
			res=calculaTotal(unidades)/4;
			break;

		case 2:
			res=calculaTotal(unidades)/3;
			break;
		case 3:
			res=calculaTotal(unidades)/2;
			break;
		}
		return res;
	}
	
	
	

}
