package Fecha;

public class Fecha {

	private int dia;
	private int mes;
	private int anyo;

	public Fecha(int dia, int mes, int anyo) {
		super();
		this.dia = dia;
		this.mes = mes;
		this.anyo = anyo;
	}

	public Fecha() {
		super();
	}

	public Fecha(Fecha f) {
		anyo = f.anyo;
		mes = f.mes;
		dia = f.dia;
	}

	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public int getAnyo() {
		return anyo;
	}

	public void setAnyo(int año) {
		this.anyo = anyo;
	}

	public String toString() {
		return  dia + "-" + mes + "-" + anyo;
	}

	private boolean esBisiesto() {
		return (anyo % 4 == 0 && anyo % 100 != 0 || anyo % 400 == 0);
	}

	public boolean fechaCorrecta() {
		boolean diaCorrecto, mesCorrecto, anyoCorrecto;
		mesCorrecto = mes >= 1 && mes <= 12;
		anyoCorrecto = anyo >= 1;
		switch (mes) {
		case 2:
			if (esBisiesto()) {
				diaCorrecto = dia >= 1 && dia <= 29;
			} else {
				diaCorrecto = dia >= 1 && dia <= 28;
			}
			break;

		case 4:
		case 6:
		case 9:
		case 11:
			diaCorrecto = dia >= 1 && dia <= 30;
			break;
		default:
			diaCorrecto = dia >= 1 && dia <= 31;
		}
		
		return diaCorrecto && mesCorrecto && anyoCorrecto;

	}
	
	
	public void diaSiguiente() {
		dia++;
		fechaCorrecta();
	}
	
	
	
	

}
