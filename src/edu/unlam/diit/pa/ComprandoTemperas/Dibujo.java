package edu.unlam.diit.pa.ComprandoTemperas;

import java.util.ArrayList;
import java.util.Iterator;

public class Dibujo implements Figura {
	private ArrayList<Figura> figuras;

	public Dibujo() {
		this.figuras = new ArrayList<Figura>();
	}

	public void agregarFigura(Figura forma) {
		figuras.add(forma);
	}

	public void eliminarFigura(Figura forma) {
		figuras.remove(forma);
	}

	public ArrayList<Figura> getFiguras() {
		return figuras;
	}

	@Override
	public double calcularArea() {
		double area_a_cubrir = 0;
		for (Iterator<Figura> it = figuras.iterator(); it.hasNext();) {
			Figura fig = it.next();
			area_a_cubrir += fig.calcularArea();
		}
		return area_a_cubrir;
	}
}
