package Cuenta;

public class Cuenta {

	private String nombreCliente;
	private String numeroCuenta;
	private double tipoInteres;
	private double saldo;

	public Cuenta() {
		super();
	}

	public Cuenta(String nombreCliente, String numeroCuenta, double tipoInteres, double saldo) {
		super();
		this.nombreCliente = nombreCliente;
		this.numeroCuenta = numeroCuenta;
		this.tipoInteres = tipoInteres;
		this.saldo = saldo;
	}

	public String getNombreCliente() {
		return nombreCliente;
	}

	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}

	public String getNumeroCuenta() {
		return numeroCuenta;
	}

	public void setNumeroCuenta(String numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
	}

	public double getTipoInteres() {
		return tipoInteres;
	}

	public void setTipoInteres(double tipoInteres) {
		this.tipoInteres = tipoInteres;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public boolean ingresoSaldo(double cantidad) {

		if (cantidad > 0) {
			this.saldo = cantidad + this.saldo;
			return true;
		} else {
			return false;
		}

	}

	public boolean reintegroSaldo(double cantidad) {

		if (this.saldo > 0) {
			this.saldo = cantidad - this.saldo;
			return true;
		} else {
			return false;
		}
	}

	public boolean transferencia(Cuenta cuenta, double importe) {
		if (this.saldo >= importe) {
			cuenta.setSaldo(saldo + importe);
			return true;
		} else {
			System.out.println("No hay saldo suficiente");
			return false;
		}

	}

}
