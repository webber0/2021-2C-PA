package edu.unlam.diit.pa.PateandoAlArco;

public class Evaluador {
	private int x, y;
	private String resultado;

	public Evaluador(int x, int y) {
		this.x = x;
		this.y = y;
		this.resultado = "";
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public String getResultado() {
		return resultado;
	}

	public void setResultado(String resultado) {
		this.resultado = resultado;
	}

	public String resolver() {
		if ((this.x > 0 && this.x < 732) && (this.y < 232)) {
			this.setResultado("GOL");
		} else if ((this.x >= 0 && this.x <= 732) && (this.y <= 232)) {
			this.setResultado("PALO");
		} else {
			this.setResultado("AFUERA");
		}

		return this.resultado;
	}
}
