package JUnit;

import static org.junit.jupiter.api.Assertions.*;

import java.util.*;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
class CalculadoraTestParDiv {
	private int num1;
	private int num2;
	private int esperado;
	
	public CalculadoraTestParDiv(int n1, int n2,int esp) {
		this.num1 = n1;
		this.num2 = n2;
		this.esperado = esp;
	}
	
	@Parameters
	public static Collection<Object[]> numero(){
		return Arrays.asList(new Object [][] {
				{100, 2, 50},
				{12, 3, 4},
				{10, 10, 1}
		});
	}

	@Test
	public void testDivision() {
		Calculadora calc = new Calculadora(num1, num2);
		int resultado = calc.Divide();
		assertEquals(esperado, resultado);
	}

}
