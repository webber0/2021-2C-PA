package edu.unlam.diit.pa.JugandoConDivisores;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class EjercicioOIA {
	private Divisor divisor;
	public static void main(String[] args) {
		EjercicioOIA ejercicio = new EjercicioOIA();
		
		ejercicio.leer("src/unlam/progava/oia/in/00.in");
		ejercicio.resolver();
		ejercicio.escribir("src/unlam/progava/oia/out/00.out");
	}

	/**
	 * Este método se encarga de leer la entrada de la
	 * consigna desde el archivo.
	 */
	public void leer(String path) {
		//throw new RuntimeException("implementame");
		try {
			Scanner entrada = new Scanner(new File(path));
			divisor=new Divisor(entrada.nextInt());
			entrada.close();
		} catch (FileNotFoundException e) {
			System.out.println("Excepcion capturada: " + e.getMessage());
		}
	}
	
	/**
	 * Este método se encarga de escribir la salida de la
	 * consigna en el archivo.
	 */
	public void escribir(String path) {
		//throw new RuntimeException("implementame");
		PrintWriter writer;
		try {
			writer = new PrintWriter(path);
			writer.println(divisor.getAgustin() + " "+ divisor.getGaston());
			writer.close();
		} catch (FileNotFoundException e) {
			System.out.println("Excepcion capturada: " + e.getMessage());
		}
	}
	
	/**
	 * Este método debe realizar la resolución del ejercicio.
	 * NO DEBE SITUARSE LA LOGICA AQUI, sino que se pueden
	 * utilizar clases adicionales, y los objetos creados en la
	 * etapa de lectura.
	 * Utilizar este mismo paquete para toda la resolución.
	 */
	public void resolver() {
		//throw new RuntimeException("implementame");
		divisor.resolver();
	}
}
