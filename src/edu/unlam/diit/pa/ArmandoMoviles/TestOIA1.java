package edu.unlam.diit.pa.ArmandoMoviles;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestOIA1 {
Movil movil;
	
	@Before
	public void setup() {
		movil = new Movil();
	}
	
	@After
	public void teardown() {
		movil = null;
	}
	
	@Test
	public void Caso00_pesoTotal() {
		movil.setPesoMap(Archivo.leer("src/in/00.txt"));
		movil.resolver();
		assertEquals(8,movil.getPesoTotal());
	}
	@Test
	public void Caso00_varillasTotal() {
		movil.setPesoMap(Archivo.leer("src/in/00.txt"));
		movil.resolver();
		assertEquals(2,movil.getCantMoviles());
	}
	@Test
	public void Caso01_pesoTotal() {
		movil.setPesoMap(Archivo.leer("src/in/01.txt"));
		movil.resolver();
		assertEquals("No se puede",movil.salida());
	}
	@Test
	public void Caso02_pesoTotal() {
		movil.setPesoMap(Archivo.leer("src/in/02.txt"));
		movil.resolver();
		assertEquals(2,movil.getPesoTotal());
	}
	@Test
	public void Caso02_varillasTotal() {
		movil.setPesoMap(Archivo.leer("src/in/02.txt"));
		movil.resolver();
		assertEquals(1,movil.getCantMoviles());
	}
	@Test
	public void Caso03_pesoTotal() {
		movil.setPesoMap(Archivo.leer("src/in/03.txt"));
		movil.resolver();
		assertEquals(6,movil.getPesoTotal());
	}
	@Test
	public void Caso03_varillasTotal() {
		movil.setPesoMap(Archivo.leer("src/in/03.txt"));
		movil.resolver();
		assertEquals(2,movil.getCantMoviles());
	}

}
