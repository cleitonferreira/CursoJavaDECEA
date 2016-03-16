package aula41;

public class Pessoa {

	String nome;
	int idade;
	
	//construtor default
//	Pessoa() {
//		
//	}
	
	
	//como saber se é um contrutor?
	// 1 - não tem retorno e tb não é utilizado void
	// 2 - tem o mesmo nome da classe
	Pessoa(String nome) {
		this.nome = nome;
		// Inicialização bem complicada de fazer...
	}
	
	Pessoa(String nome, int idade) {
		this(nome); // Deve ser a primeira instrução dentro do construtor
		this.idade = idade;
	}
}
