package edu.unlam.diit.pa.EscaleraAlCielo;

public class Escalera {
	private int[] setInstrucciones;
	private int cielo, escaleraActual, pasos;

	public Escalera(int[] setInstrucciones, int cielo) {
		this.setInstrucciones = setInstrucciones;
		this.cielo = cielo;
		this.escaleraActual = 0;
		this.pasos = 0;
	}

	public int[] getSetInstrucciones() {
		return setInstrucciones;
	}

	public void setSetInstrucciones(int[] setInstrucciones) {
		this.setInstrucciones = setInstrucciones;
	}

	public int getCielo() {
		return cielo;
	}

	public void setCielo(int cielo) {
		this.cielo = cielo;
	}

	public int getEscaleraActual() {
		return escaleraActual;
	}

	public void setEscaleraActual(int escaleraActual) {
		this.escaleraActual = escaleraActual;
	}

	public int getPasos() {
		return pasos;
	}

	public void setPasos(int pasos) {
		this.pasos = pasos;
	}

	public void resolver() {
		// O(N)
		int i = 0;
		while (true) {
			this.escaleraActual += this.setInstrucciones[i];
			this.cielo -= this.setInstrucciones[i];
			this.pasos++;
			i++;
			if (this.cielo <= 0) {
				break;
			}
			// Para volver a empezar
			if (i >= setInstrucciones.length) {
				i = 0;
			}
		}
	}
}
