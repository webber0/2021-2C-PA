package edu.unlam.diit.pa.PateandoAlArco;

import static org.junit.Assert.*;

import org.junit.Test;

public class EvaluadorLocal {

	@Test
	public void esGol() {
		GestorArchivos ga = new GestorArchivos();
		Evaluador guty = ga.LeerArchivo("esGol.in");
		guty.resolver();
		assertEquals("GOL", guty.getResultado());
		ga.escribirArchivo(guty.getResultado(), "esGol.out");
	}

	@Test
	public void esPalo() {
		GestorArchivos ga = new GestorArchivos();
		Evaluador guty = ga.LeerArchivo("esPalo.in");
		guty.resolver();
		assertEquals("PALO", guty.getResultado());
		ga.escribirArchivo(guty.getResultado(), "esPalo.out");
	}

	@Test
	public void esAfuera() {
		GestorArchivos ga = new GestorArchivos();
		Evaluador guty = ga.LeerArchivo("esAfuera.in");
		guty.resolver();
		assertEquals("AFUERA", guty.getResultado());
		ga.escribirArchivo(guty.getResultado(), "esAfuera.out");
	}

}
