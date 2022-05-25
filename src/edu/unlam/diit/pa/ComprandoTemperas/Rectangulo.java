package edu.unlam.diit.pa.ComprandoTemperas;

public class Rectangulo implements Figura {

	private double base, altura;

	public Rectangulo(double base, double altura) {
		this.base = base;
		this.altura = altura;
	}

	public Rectangulo() {
		this.base = 0;
		this.altura = 0;
	}

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	@Override
	public double calcularArea() {
		return this.base * this.altura;
	}

}
