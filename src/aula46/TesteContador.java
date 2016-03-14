package aula46;

/*
 * Modificadores static e final
 * */

public class TesteContador {

	public static void main(String[] args) {
		Contador c = new Contador();
		c.incrementar();
//		System.out.println(Contador.COUNT);
//		Contador.COUNT++;
		
		//não é indicado, quando os atributos estão declarados com static 
		//System.out.println(c.COUNT);
		
		Contador.COUNT++;
//		System.out.println(Contador.COUNT);
		
		Contador.imprimirContador();
	}
	
	

}
