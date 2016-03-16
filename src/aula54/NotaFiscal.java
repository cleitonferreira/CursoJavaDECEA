package aula54;

/*Na interface, uma classe pode implementar múltiplas interfaces
 * 
 * */

public class NotaFiscal implements Imprimivel, EnviavelPorEmail {

	private int numero;
	
	public NotaFiscal(int numero) {
		this.numero = numero;
	}
	
	@Override
	public void imprimir() {
		//Aqui vai nossa implementação com impressora
		System.out.println("Vamos imprimir essa nota fiscal de numero: " + numero);
	}
	
	public void adicionarPedido(String produto) {
		
	}

	@Override
	public void enviar(String email) {
		System.out.println("Enviando a nota de número: " + numero + " para o email: " + email);
		
	}

}
