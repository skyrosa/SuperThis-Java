package classes;

public class Persona extends SerVivo{

	private String nombre;

	public Persona() {
		super(); 	// Llama al constructor de la superclass (extends)
		System.out.println("Desde el constructor de Persona sin parámetros");
	}
	
	public Persona(String name) {
		this(); 	// Llama al constructor de la propria class
		this.nombre = name;
		System.out.println("Desde el constructor de Persona con parámetro");
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	
}
