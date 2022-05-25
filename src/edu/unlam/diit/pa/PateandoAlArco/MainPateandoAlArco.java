package edu.unlam.diit.pa.PateandoAlArco;

public class MainPateandoAlArco {
	public static void main(String[] args) {
		GestorArchivos ga = new GestorArchivos();
		Evaluador guty = ga.LeerArchivo("evaluador.in");
		guty.resolver();
		ga.escribirArchivo(guty.getResultado(), "evaluador.out");

	}
}
