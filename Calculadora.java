package JUnit;

public class Calculadora {
	private int numero1;
	private int numero2;
	public int resultado;
	
	public Calculadora(int a, int b) {
		numero1 = a;
		numero2 = b;
	}
	
	public int Suma() {
		resultado = numero1 + numero2;
		return resultado;
	}
	
	public boolean resta2() {
		if (numero1 >= numero2)
			return true;
		else
			return false;
	}
	
	public int Resta() {
		if (resta2()) 
			resultado = numero1 - numero2;
		else 
			resultado = numero2 - numero1;
		return resultado;
	}
	
	public int Multiplica() {
		resultado = numero1 * numero2;
		return resultado;
	}
	
	public int Divide() {
		resultado = numero1 / numero2;
		return resultado;
	}
	
	public Integer Divide2() {
		if (numero2 == 0) return null;
		resultado = numero1 / numero2;
		return resultado;
	}
}
