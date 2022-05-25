package edu.unlam.diit.pa.CuentasDelBanco;

import static org.junit.Assert.*;

import org.junit.Test;

public class CuentaCorrienteTest {

	@Test
	public void obtenerSaldo() {
		CuentaCorriente cc = new CuentaCorriente(1000, 100);
		assertEquals(1100, cc.getSaldo(), 0);
	}

}
