package edu.unlam.diit.pa.ArmandoMoviles;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Scanner;

public class Archivo {
	public static HashMap leer(String path) {
		HashMap<Integer, Integer> pesos = new HashMap<Integer, Integer>();
		int cant;
		File file = new File(path);
		Scanner scanner;
		try {
			scanner = new Scanner(file);
			cant = scanner.nextInt();
			while (scanner.hasNextInt()) {
				int valor = scanner.nextInt();
				// Se busca si la letra en el HashMap, como no existe la agregamos con un '1'
				if (!pesos.containsKey(valor)) {
					pesos.put(valor, 1);
				} else {
					// Como la letra ya existe vamos por el contador de esa letra,
					// le sumamos uno y la agregamos 'remplazando' la letra anterior
					pesos.put(valor, pesos.get(valor) + 1);
				}
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return pesos;
	}

	public static void escribir(String path, Movil m) {
		FileWriter file = null;
		PrintWriter printerWriter = null;

		try {
			file = new FileWriter(path);
			printerWriter = new PrintWriter(file);

			if (m.getCantMoviles() == 0)
				printerWriter.println("No se puede");
			else {
				printerWriter.print(m.getPesoTotal());
				printerWriter.print(" ");
				printerWriter.print(m.getCantMoviles());
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (file != null) {
				try {
					file.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
