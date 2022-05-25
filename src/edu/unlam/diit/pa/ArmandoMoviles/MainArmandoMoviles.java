package edu.unlam.diit.pa.ArmandoMoviles;

public class MainArmandoMoviles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Movil movil = new Movil();
		movil.setPesoMap(Archivo.leer("src/in/03.txt"));

		movil.resolver();

		Archivo.escribir("src/out/03.txt", movil);
	}
}
