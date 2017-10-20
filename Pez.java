package animales;

public class Pez extends Animal{
	public Pez () {
		super(0);
	}
	public void Caminar(String nombre) {
	}
public String Caminar() {
	return"Los peces, por supuesto, no pueden caminar; ellos nadan";
	}
public void Comer() {
	System.out.println("Los peces comen espuma del tanque");
}
public void fijaNombre(String nombre) {
}
public String dameNombre(String nombre) {
	return nombre;
}
public void jugar() {
	System.out.println("Los peces nadan en su tanque todo el dia");
}
}
