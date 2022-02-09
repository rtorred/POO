package controlador;

public class controlador {
	private int cont;

	public controlador() {
		super();
	}

	public controlador(int cont) {
		super();
		this.cont = cont;
	}

	public int getCont() {
		return cont;
	}

	public void setCont(int cont) {
		this.cont = cont;
	}
	
	public void incrementar() {
		this.cont++;
	}
	
	public void decrementar() {
		if (cont>0) {
			this.cont--;
		}
	}
	
	

}
