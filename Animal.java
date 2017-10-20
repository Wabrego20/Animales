package animales;

public abstract class Animal {
	 protected int patas;
	
	public Animal(int piernas) {
		this.patas=piernas;
	}
	
	public abstract void Comer();
	
	public String Caminar() {
		return "Este animal camina en: "+patas+" patas";
	}

}
