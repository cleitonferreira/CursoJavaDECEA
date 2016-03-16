package aula55;

/*
 * Coletor de lixo
 * */

public class Principal {

	public static void main(String[] args) {
		
		Carro meuCarro = new Carro();
		meuCarro.modelo = "Palio";
		meuCarro.anoDeFabricacao = 2010;
		
		//depois de criar o objeto, deverátirar a referência do mesmo
		//para melhorar a performace da aplicação e tb do ambiente		
		meuCarro = null;
		
		//erro
		//carro.bicombustivel = true;
		
		//erro NullPointerException
	}

}
