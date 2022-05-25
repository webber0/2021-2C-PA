package edu.unlam.diit.pa.ComprandoTemperas;

public class Circulo implements Figura {
	private double radio;

	public Circulo(double radio) {
		this.radio = radio;
	}

	public Circulo() {
		this.radio = 0;
	}

	public double getRadio() {
		return radio;
	}

	public void setRadio(double radio) {
		this.radio = radio;
	}

	@Override
	public double calcularArea() {
		return Math.PI * Math.pow(this.radio, 2);
	}
}
