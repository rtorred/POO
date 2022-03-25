package Empleado;

public class Empleado {
	
	private String nif;
	private String nombre;
	private double sueldoBase;
	private static int horasExtras;
	private double irpf;
	private String casado;
	private int hijo;
	private static double importeHora;

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

	public String esCasado() {
		return casado;
	}

	public void setCasado(String casado) {
		this.casado = casado;
	}

	public int getHijo() {
		return hijo;
	}

	public void setHijo(int hijo) {
		this.hijo = hijo;
	}
	
	public static double getimporteHora() {
		return importeHora;
	}

	public void setimporteHora(int importeHora) {
		Empleado.importeHora=importeHora;
	}


	public String toString() {
		return "\n"+"------------------------------"+
				nif+" "+nombre+ 
				"\n"+"Sueldo Base : "+ sueldoBase+
				"\n"+"Horas Extras : " + horasExtras+
				"\n"+"tipo IRPF : "+ irpf+
				"\n"+"Casado : "+
				"\n"+"Numero de Hijos : "+ hijo;
	}
	
	public double calcularImporteHorasExtras(){
        return horasExtras * importeHora;
    }
	
	public double complementoHorasExtras() {
		double complemento=horasExtras*importeHora;
		return complemento;
	}
	
	public double sueldoBruto() {
		double sueldo= sueldoBase+complementoHorasExtras();
		return sueldo;
	}
	
	
	public double retencionesIRPF() {
		if (casado=="S") {
			return sueldoBruto()*((irpf-hijo)/100);
		} else {
			return sueldoBruto()*(irpf/100);
		}
	}
	
	public double calculaSueldo() {
		return sueldoBruto()-retencionesIRPF();
	}
	

	
	
	

}
