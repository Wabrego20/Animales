package animales;

public class PruebaAnimales {
	
	public static void main(String[] args) {
		Pez p = new Pez();
		Gato g = new Gato();
		Animal ap = new Pez();
		Animal aa = new Araña();
		Mascota m = new Gato();

		p.jugar();
		((Pez)ap).Comer();
		System.out.println(((Pez)ap).Caminar());
		
		g.jugar("Silvestre");
		g.Comer();
		System.out.println(g.Caminar()+", El Gato");
		
		((Gato)m).Comer();
		System.out.println(((Araña)aa).Caminar()+", La Araña");	
	}
}
