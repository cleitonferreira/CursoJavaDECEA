package aula54;

/*
 * Interfaces
 * */

public class TesteInterface {

	public static void main(String[] args) {
		
		//vc não consegue criar um objeto com uma interface
		//Imprimivel imprimivel = new Imprimivel();
		
		Imprimivel i = new NotaFiscal(1234);
		i.imprimir();
		
		//não funciona
		//i.adicionarPedido();

		//para funcionar deverá fazer casting
		//NotaFiscal n = (NotaFiscal) i;
		//n.adicionarPedido("");
		
		EnviavelPorEmail e = (EnviavelPorEmail) i;
		e.enviar("cleitonferreiraa@hotmail.com");
		
		NotaFiscal n = (NotaFiscal) e;
		n.adicionarPedido("caixa de leite");
		
	}
	
}
