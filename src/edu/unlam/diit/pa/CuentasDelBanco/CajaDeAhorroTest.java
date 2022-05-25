package edu.unlam.diit.pa.CuentasDelBanco;

import static org.junit.Assert.*;

import org.junit.Test;

public class CajaDeAhorroTest {

	@Test
	public void obtenerSaldo() {
		CajaDeAhorro ca = new CajaDeAhorro(1000);
		assertEquals(1000, ca.getSaldo(), 0.0);
	}

}
