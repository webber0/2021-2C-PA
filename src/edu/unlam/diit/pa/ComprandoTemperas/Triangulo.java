package edu.unlam.diit.pa.ComprandoTemperas;

public class Triangulo implements Figura {

	private double base, altura;

	public Triangulo(double base, double altura) {
		this.base = base;
		this.altura = altura;
	}

	public Triangulo() {
		this.base = 0;
		this.altura = 0;
	}

	@Override
	public double calcularArea() {
		return (this.base * this.altura) / 2;
	}
}
