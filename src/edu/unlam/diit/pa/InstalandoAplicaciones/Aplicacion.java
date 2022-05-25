package edu.unlam.diit.pa.InstalandoAplicaciones;

public class Aplicacion {
	private int c, a, resultado;
	private int[] apps;

	public Aplicacion(int c, int a, int[] apps) {
		this.c = c;
		this.a = a;
		this.apps = apps;
		this.resultado = 0;
	}

	public int getC() {
		return c;
	}

	public void setC(int c) {
		this.c = c;
	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int[] getApps() {
		return apps;
	}

	public int getResultado() {
		return resultado;
	}

	public void setResultado(int resultado) {
		this.resultado = resultado;
	}

	public void resolver() {
		int appsBorrarAnt = 0;
		GestorArchivos ga = new GestorArchivos();
		for (int i = 0; i < this.c; i++) {
			int suma = 0, appsBorrar = 0;
			for (int j = i; j < this.c; j++) {
				suma += this.apps[j];
				appsBorrar++;
				if (suma >= this.a) {
					break;
				}
			}
			if (appsBorrarAnt == 0 || (appsBorrar < appsBorrarAnt && suma >= this.a)) {
				appsBorrarAnt = appsBorrar;
			}
		}
		this.setResultado(appsBorrarAnt);
		ga.escribirArchivo(appsBorrarAnt);
	}
}
