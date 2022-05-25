package edu.unlam.diit.pa.ComprandoTemperas;
/*
Maril�n quiere ayudar a su hijo con una tarea del jard�n de infantes. 
Le han pedido que lleve materiales para pintar una serie de formas geom�tricas con colores. 
Habr� un grupo de formas que pintar� de un color, y otro grupo que pintar� de otro color, 
y as� sucesivamente. Ella dispone por anticipado de las medidas y ubicaciones precisas de cada figura, 
pero necesita saber cu�ntos pomos de cada t�mpera debe comprar.
Sabiendo que un pomo de t�mpera tiene un poder cubritivo de 100cm2, 
y que no puede comprar "fracciones de pomo", 
se te pide que le muestres una forma de calcular las cantidades a comprar utilizando el patr�n de dise�o Composite.

Nota: Las figuras no se solapan entre s�. Cada figura estar� pintada al 100% del color indicado.
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