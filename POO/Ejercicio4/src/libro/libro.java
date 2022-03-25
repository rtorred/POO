package libro;

public class libro {
	
	private String titulo;
	private String autor;
	private int numEjemplares;
	private int numEjemPrestados;
	
	public libro() {
		super();
	}

	public libro(String titulo, String autor, int numEjemplares, int numEjemPrestados) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		this.numEjemplares = numEjemplares;
		this.numEjemPrestados = numEjemPrestados;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getNumEjemplares() {
		return numEjemplares;
	}

	public void setNumEjemplares(int numEjemplares) {
		this.numEjemplares = numEjemplares;
	}

	public int getNumEjemPrestados() {
		return numEjemPrestados;
	}

	public void setNumEjemPrestados(int numEjemPrestados) {
		this.numEjemPrestados = numEjemPrestados;
	}
	
	public boolean prestamo() {
		if (this.numEjemplares>0) {
			this.numEjemPrestados++;
			return true;
		} else {
			return false;
		}
	}
	
	
	public boolean devolucion() {
		if (this.numEjemPrestados>0) {
			this.numEjemPrestados--;
			return true;
		} else {
			return false;

		}
	}

	public String toString() {
		return "libro [titulo=" + titulo + ", autor=" + autor + ", numEjemplares=" + numEjemplares
				+ ", numEjemPrestados=" + numEjemPrestados + "]";
	}
	
	
	
	
	
	
	

}
