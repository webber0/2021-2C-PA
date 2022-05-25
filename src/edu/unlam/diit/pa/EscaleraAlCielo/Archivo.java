package edu.unlam.diit.pa.EscaleraAlCielo;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Archivo {
	private Escalera escaleras;

	public void leer(String path) {
		// throw new RuntimeException("implementame");
		try {
			Scanner entrada = new Scanner(new File(path));
			int cantInstrucciones, cielo, i = 0;
			cantInstrucciones = entrada.nextInt();
			cielo = entrada.nextInt();
			int[] setInstrucciones = new int[cantInstrucciones];
			while (entrada.hasNext()) {
				setInstrucciones[i] = entrada.nextInt();
				i++;
			}
			entrada.close();
			escaleras = new Escalera(setInstrucciones, cielo);
		} catch (FileNotFoundException e) {
			System.out.println("Excepcion capturada: " + e.getMessage());
		}
	}
	
	public void escribir(String path) {
		// throw new RuntimeException("implementame");
		PrintWriter writer;
		try {
			writer = new PrintWriter(path);
			writer.println(escaleras.getPasos());
			writer.close();
		} catch (FileNotFoundException e) {
			System.out.println("Excepcion capturada: " + e.getMessage());
		}
	}
}
