package aula29;

/*Composição de objetos*/

public class Principal {

	public static void main(String[] args) {
		
//		Proprietario proprietario = new Proprietario();
//		proprietario.nome = "João da Silva";
//		proprietario.cpf = "000.000.000-00";
//		proprietario.idade = 25;
//		proprietario.logradouro = "Rua Jão Pinheiro";
//		proprietario.bairro = "Centro";
//		proprietario.cidade = "Rio de Janeiro";
//		
//		Carro meuCarro = new Carro();
//		meuCarro.anoDeFabricacao = 2011;
//		meuCarro.cor = "Prata";
//		meuCarro.fabricante = "Fiat";
//		meuCarro.modelo = "Palio";
//		meuCarro.proprietario = proprietario;
		
		
		Carro meuCarro = new Carro();
		meuCarro.anoDeFabricacao = 2011;
		meuCarro.cor = "Prata";
		meuCarro.fabricante = "Fiat";
		meuCarro.modelo = "Palio";
		
		meuCarro.proprietario = new Proprietario();
		meuCarro.proprietario.nome = "Joao da Silva";
		meuCarro.proprietario.bairro = "Centro";
		
	}
	
}
