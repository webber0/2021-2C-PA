package edu.unlam.diit.pa.CuentasDelBanco;

public class Cuenta {
	double saldo;
	public Cuenta(double saldo) {
		this.saldo = saldo;
	}

	public double getSaldo() {
		return saldo;
	}
	
	public void extraer(double monto) {
		if(monto <= this.getSaldo()) {
			this.saldo-=monto;
		}
	}
}
