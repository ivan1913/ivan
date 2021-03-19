package test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import calculos.operaciones;

class operacionesTest {

	@Test
	public void testsuma() {
		
		assertEquals(8,operaciones.suma(4,4));
	}
	
	@Test
	public void testrestar() {
			
			assertEquals(0,operaciones.resta(4,4));
	}

	@Test
	public void testmultiplicar() {
		
		assertEquals(16,operaciones.multiplicacion(4,4));
	}
	
	@Test
	public void testdividir() {
		
		assertEquals(1,operaciones.division(4,4));
	}

}
