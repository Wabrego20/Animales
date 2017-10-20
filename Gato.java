package animales;

import animales.Animal;

public class Gato extends Animal implements Mascota{
	public Gato (String nombre) {
		super (4);
	}
	public Gato () {
		this("");
	}
	public void fijaNombre(String nombre) {	
	}
	public String dameNombre(String nombre) {
		return nombre;
	}
	public void jugar(String nombre) {
		System.out.println(nombre+", me gusta jugar con cuerdas, MiAUaumIaAAUU");
	}
	public void Comer() {
		System.out.println("Los gatos les gusta comer arañas y ratones.");
	}
}