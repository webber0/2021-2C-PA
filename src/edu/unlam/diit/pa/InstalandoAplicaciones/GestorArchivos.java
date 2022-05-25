package edu.unlam.diit.pa.InstalandoAplicaciones;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class GestorArchivos {
	public Aplicacion LeerArchivo(String archivo) {
		Aplicacion app = null;
		try {
			Scanner entrada = new Scanner(new File(archivo));
			int c, a;
			c = entrada.nextInt();
			a = entrada.nextInt();
			int[] apps = new int[c];
			int i = 0;
			while (entrada.hasNext()) {
				apps[i] = entrada.nextInt();
				i++;
			}
			entrada.close();
			app = new Aplicacion(c, a, apps);

		} catch (FileNotFoundException e) {
			System.out.println("Excepcion capturada: " + e.getMessage());
		}
		return app;
	}

	public void escribirArchivo(int resultado) {
		PrintWriter writer;
		try {
			writer = new PrintWriter("aplicaciones.out");
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
