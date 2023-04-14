package valores_limites;

public class Persona {
	private int edad;
	
	public Persona (int age) {
		this.edad = age;
	}
	
	public boolean isMayorEdad() {
		assert edad >= 0;
		return edad >= 18;
	}
}
