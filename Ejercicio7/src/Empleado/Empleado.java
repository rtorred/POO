package Empleado;

public class Empleado {
	
	private String nif;
	private String nombre;
	private double sueldoBase;
	private static int horasExtras;
	private double irpf;
	private boolean casado;
	private int hijo;
	
	public Empleado(String nif, String nombre, double sueldoBase, double irpf, boolean casado,
			int hijo) {
		super();
		this.nif = nif;
		this.nombre = nombre;
		this.sueldoBase = sueldoBase;
		this.irpf = irpf;
		this.casado = casado;
		this.hijo = hijo;
	}

	public Empleado(String dni) {
		super();
		nif=dni;
	}
	
	public Empleado(Empleado e) {
		nif=e.nif;
		nombre=e.nombre;
		sueldoBase=e.sueldoBase;
		irpf=e.irpf;
		casado=e.casado;
		hijo=e.hijo;
	}

	public String getNif() {
		return nif;
	}

	public void setNif(String nif) {
		this.nif = nif;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getSueldoBase() {
		return sueldoBase;
	}

	public void setSueldoBase(double sueldoBase) {
		this.sueldoBase = sueldoBase;
	}

	public int getHorasExtras() {
		return horasExtras;
	}

	public void setHorasExtras(int horasExtras) {
		this.horasExtras = horasExtras;
	}

	public double getIrpf() {
		return irpf;
	}

	public void setIrpf(double irpf) {
		this.irpf = irpf;
	}

	public boolean isCasado() {
		return casado;
	}

	public void setCasado(boolean casado) {
		this.casado = casado;
	}

	public int getHijo() {
		return hijo;
	}

	public void setHijo(int hijo) {
		this.hijo = hijo;
	}
	
	
	
	
	
	
	

}
