package edu.unlam.diit.pa.ComprandoTemperas;
/*
Marilén quiere ayudar a su hijo con una tarea del jardín de infantes. 
Le han pedido que lleve materiales para pintar una serie de formas geométricas con colores. 
Habrá un grupo de formas que pintará de un color, y otro grupo que pintará de otro color, 
y así sucesivamente. Ella dispone por anticipado de las medidas y ubicaciones precisas de cada figura, 
pero necesita saber cuántos pomos de cada témpera debe comprar.
Sabiendo que un pomo de témpera tiene un poder cubritivo de 100cm2, 
y que no puede comprar "fracciones de pomo", 
se te pide que le muestres una forma de calcular las cantidades a comprar utilizando el patrón de diseño Composite.

Nota: Las figuras no se solapan entre sí. Cada figura estará pintada al 100% del color indicado.
 */

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