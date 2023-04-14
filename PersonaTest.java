package valores_limites;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PersonaTest {
		
	@Test
	public void testIsMayorEdad1() {
		Persona per = new Persona(-100);
		assertThrows(AssertionError.class, () -> per.isMayorEdad());
	}
		
	@Test
	public void testIsMayorEdad2() {
		Persona per = new Persona(-1);
		assertThrows(AssertionError.class, () -> per.isMayorEdad());
	}
	
	@Test
	public void testIsMayorEdad3() {
		Persona per = new Persona(0);
		assertFalse(per.isMayorEdad());
	}
	
	@Test
	public void testIsMayorEdad4() {
		Persona per = new Persona(17);
		assertFalse(per.isMayorEdad());
	}
	
	@Test
	public void testIsMayorEdad5() {
		Persona per = new Persona(18);
		assertTrue(per.isMayorEdad());
	}
	
	@Test
	public void testIsMayorEdad6() {
		Persona per = new Persona(100);
		assertTrue(per.isMayorEdad());
	}

}
