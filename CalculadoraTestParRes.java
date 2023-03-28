package JUnit;

import static org.junit.jupiter.api.Assertions.*;

import java.util.*;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
class CalculadoraTestParRes {
	private int num1;
	private int num2;
	private int esperado;
	
	public CalculadoraTestParRes(int n1, int n2,int esp) {
		this.num1 = n1;
		this.num2 = n2;
		this.esperado = esp;
	}
	
	@Parameters
	public static Collection<Object[]> numero(){
		return Arrays.asList(new Object [][] {
				{101, 1, 1},
				{5, 15, -10},
				{50, 50, 0}
		});
	}

	@Test
	public void testResta() {
		Calculadora calc = new Calculadora(num1, num2);
		int resultado = calc.Resta();
		assertEquals(esperado, resultado);
	}

}
