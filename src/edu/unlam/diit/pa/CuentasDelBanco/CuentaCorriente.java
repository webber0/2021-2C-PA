package edu.unlam.diit.pa.CuentasDelBanco;

public class CuentaCorriente extends Cuenta {
	double descubierto;

	public CuentaCorriente(double saldoIncial, double descubierto) {
		super(saldoIncial);
		this.descubierto = descubierto;
	}

	@Override
	public double getSaldo() {
		return super.getSaldo() + descubierto;
	}

	@Override
	public void extraer(double monto) {
		if (this.saldo >= 0) {
			super.saldo -= monto;
		}
	}
}
