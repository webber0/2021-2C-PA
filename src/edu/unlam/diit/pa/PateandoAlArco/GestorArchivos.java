package edu.unlam.diit.pa.PateandoAlArco;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class GestorArchivos {
	public Evaluador LeerArchivo(String archivo) {
		Evaluador robot = null;
		try {
			Scanner entrada = new Scanner(new File(archivo));
			int x, y;
			x = entrada.nextInt();
			y = entrada.nextInt();
			entrada.close();
			robot = new Evaluador(x, y);

		} catch (FileNotFoundException e) {
			System.out.println("Excepcion capturada: " + e.getMessage());
		}
		return robot;
	}

	public void escribirArchivo(String resultado, String caso) {
		PrintWriter writer;
		try {
			writer = new PrintWriter(caso);
			writer.println(resultado);
			writer.close();
		} catch (FileNotFoundException e) {
			System.out.println("Excepcion capturada: " + e.getMessage());
		}
	}

	public void generarCasoFatiga() {
		PrintWriter writer;
		try {
			writer = new PrintWriter("casoFatiga.in");
			writer.println(50000 + " " + 1000);
			for (int i = 0; i < 5000; i++) {
				writer.print(1 + " ");
			}
			writer.close();
		} catch (FileNotFoundException e) {
			System.out.println("Excepcion capturada: " + e.getMessage());
		}
	}
}
