package JUnit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculadoraTest {

	@Test
	public void testSuma() {
		Calculadora calc = new Calculadora(1, 9);
		int resul = calc.Suma();
		assertEquals(10, resul);
	}

	@Test
	public void testResta() {
		Calculadora calc = new Calculadora(6, 1);
		int resul = calc.Resta();
		assertEquals(5, resul);
	}
	
	@Test
	public void testMultiplicacion() {
		Calculadora calc = new Calculadora(20, 5);
		int resul = calc.Multiplica();
		assertEquals(100, resul);
	}
	
	@Test
	public void testDivision() {
		Calculadora calc = new Calculadora(500, 10);
		int resul = calc.Divide();
		assertEquals(50, resul);
	}
	
	@Test
	public void testResta2P1() {
		Calculadora calc = new Calculadora(100, 1);
		assertTrue(calc.resta2());
	}
	
	@Test
	public void testResta2P2() {
		Calculadora calc = new Calculadora(1, 100);
		assertFalse(calc.resta2());
	}
	
	@Test
	public void testRestaModificado() {
		Calculadora calc = new Calculadora(11, 1);
		int resul = calc.Resta();
		assertEquals(10, resul);
	}
	
	@Test
	public void testDivision2() {
		Calculadora calc = new Calculadora(10, 0);
		assertNull(calc.Divide2());
	}
}
