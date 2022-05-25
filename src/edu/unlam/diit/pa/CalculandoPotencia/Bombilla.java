package edu.unlam.diit.pa.CalculandoPotencia;

public class Bombilla implements Comparable<Bombilla>  {
	private double potencia;

	public Bombilla(double potencia) {
		this.potencia = potencia;
	}
	
	public Bombilla() {
		this.potencia = 0;
	}

	public double getPotencia() {
		return potencia;
	}

	public void setPotencia(double potencia) {
		this.potencia = potencia;
	}
	@Override
	public int compareTo(Bombilla o) {
		// TODO Auto-generated method stub
		return Double.compare(this.potencia, o.potencia);
	}
	
	public Bombilla bombillaMayorConsumo(Bombilla o) {
		if(this.potencia > o.potencia){
			return this;
		}
		return o;
	}
}
