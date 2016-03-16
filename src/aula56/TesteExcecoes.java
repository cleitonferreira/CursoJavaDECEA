package aula56;

/*
 * Tratando e lançando exceções
 * */

public class TesteExcecoes {

	public static void main(String[] args) {
//		System.out.println("Antes");
//		int numero = 5 / 0; // Lança java.lang.ArithmeticException
//		System.out.println("Depois");
//		System.out.println(numero);
		
/*		String s = null;
		String maiuscula = s.toUpperCase(); // lança java.lang.NullPointerException 
		System.out.println(maiuscula);
		*/
		
		ContaCorrente cc = new ContaCorrente(100);
		//cc.depositar(-10);
		
		try {
			cc.depositar(-10);
			// Várias linhas de código...
		} catch(IllegalArgumentException e) {
			System.out.println("Você executou uma operação ilegal: " + e.getMessage());
		}
			
	}
	
}
