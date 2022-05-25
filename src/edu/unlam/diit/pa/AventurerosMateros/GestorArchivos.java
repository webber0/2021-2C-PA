package edu.unlam.diit.pa.AventurerosMateros;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class GestorArchivos {
	public Matero LeerArchivo(String archivo) {
		Matero a=new Matero();
		int[] cantCebadas=null;
		int i=0;
		try {
			Scanner entrada = new Scanner(new File(archivo));
			cantCebadas = new int[entrada.nextInt()];
			while (entrada.hasNext()) {
				cantCebadas[i]=entrada.nextInt();
				i++;
			}
			entrada.close();
		} catch (FileNotFoundException e) {
			System.out.println("Excepcion capturada: " + e.getMessage());
		}
		a.setCantCebadas(cantCebadas);
		return a;
	}

	public void escribirArchivo(String archivoSalida) {
		PrintWriter writer;
		try {
			writer = new PrintWriter(archivoSalida);
			//Escritura
			writer.close();
		} catch (FileNotFoundException e) {
			System.out.println("Excepcion capturada: " + e.getMessage());
		}
	}
}
