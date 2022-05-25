package edu.unlam.diit.pa.ComprandoTemperas;

public class MainComprandoTemperas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GrupoDibujo g1 = new GrupoDibujo("VERDE");
		Cuadrado cu1 = new Cuadrado(Math.sqrt(51));
		Cuadrado cu2 = new Cuadrado(Math.sqrt(51));
		Cuadrado cu3 = new Cuadrado(Math.sqrt(51));
		//Circulo ci1 = new Circulo(1.5);
		g1.agregarFigura(cu1);
		g1.agregarFigura(cu2);
		g1.agregarFigura(cu3);
		g1.calcularCantidadTemperas();
		System.out.println(g1.getCantidadTemperas());
	}

}
