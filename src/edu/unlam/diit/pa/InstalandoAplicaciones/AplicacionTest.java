package edu.unlam.diit.pa.InstalandoAplicaciones;

import static org.junit.Assert.*;

import org.junit.Test;

public class AplicacionTest {

	@Test
	public void casoBase() {
		Aplicacion app = null;
		GestorArchivos ga = new GestorArchivos();
		ga.generarCasoFatiga();
		app = ga.LeerArchivo("almacenamiento.in");
		app.resolver();
		assertEquals(3, app.getResultado());
	}
	/*
	 * @Test public void casoInsuficiente() { Aplicacion app=null; GestorArchivos ga
	 * = new GestorArchivos(); ga.generarCasoFatiga();
	 * app=ga.LeerArchivo("casoInsuficiente.in"); app.resolver(); assertEquals(0,
	 * app.getResultado()); }
	 */

	@Test
	public void casoTodaLaMemoria() {
		Aplicacion app = null;
		GestorArchivos ga = new GestorArchivos();
		ga.generarCasoFatiga();
		app = ga.LeerArchivo("casoTodaLaMemoria.in");
		app.resolver();
		assertEquals(9, app.getResultado());
	}

	@Test
	public void casoFatiga() {
		Aplicacion app = null;
		GestorArchivos ga = new GestorArchivos();
		ga.generarCasoFatiga();
		app = ga.LeerArchivo("casoFatiga.in");
		app.resolver();
		assertEquals(1000, app.getResultado());
	}
}
