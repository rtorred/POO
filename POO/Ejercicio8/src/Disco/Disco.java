package Disco;

public class Disco {
	
	private String codigo="LIBRE";
	private String autor;
	private String titulo;
	private	String genero;
	private int duracion;
	
	
	public Disco(String autor, String titulo, String genero, int duracion) {
		super();
		this.autor = autor;
		this.titulo = titulo;
		this.genero = genero;
		this.duracion = duracion;
	}


	public Disco() {
		super();
	}
	
	public Disco(Disco d) {
		d.autor=autor;
		d.titulo=titulo;
		d.genero=genero;
		d.duracion=duracion;
	}


	public String getCodigo() {
		return codigo;
	}


	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}


	public String getAutor() {
		return autor;
	}


	public void setAutor(String autor) {
		this.autor = autor;
	}


	public String getTitulo() {
		return titulo;
	}


	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}


	public String getGenero() {
		return genero;
	}


	public void setGenero(String genero) {
		this.genero = genero;
	}


	public int getDuracion() {
		return duracion;
	}


	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}


	public String toString() {
		return "Disco [Codigo= " + codigo +" ,autor=" + autor + ", titulo=" + titulo + ", genero=" + genero + ", duracion=" + duracion + "]";
	}
	
	
	



	
	
	
	
	

}
