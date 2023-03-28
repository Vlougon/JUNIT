package JUnit;

import static org.junit.jupiter.api.Assertions.*;

import java.util.*;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
class CalculadoraTestParSum {
	private int num1;
	private int num2;
	private int esperado;
	
	public CalculadoraTestParSum(int n1, int n2,int esp) {
		this.num1 = n1;
		this.num2 = n2;
		this.esperado = esp;
	}
	
	@Parameters
	public static Collection<Object[]> numero(){
		return Arrays.asList(new Object [][] {
				{10, 10, 20},
				{5, 5, 10},
				{75, 25, 100}
		});
	}

	@Test
	public void testSuma() {
		Calculadora calc = new Calculadora(num1, num2);
		int resultado = calc.Suma();
		assertEquals(esperado, resultado);
	}

}
