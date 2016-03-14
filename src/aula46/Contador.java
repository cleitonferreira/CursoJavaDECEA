package aula46;

public class Contador {

	public static int COUNT = 0;
	public static final double PI = 3.14; //definido como constante - final
	//o valor do PI - não muda
	
	public void incrementar() {
		COUNT++;
	}
	
	//static no método
	public static void imprimirContador() {
		System.out.println("O valor do contador agora é: " + Contador.COUNT);
	}
}
