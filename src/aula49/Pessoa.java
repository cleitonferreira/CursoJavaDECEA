package aula49;

public class Pessoa {

	
	//para funcionar a herança em Java
	//os modificadores deveram ser protected - public
	
	String nome;
	protected int idade;
	
	public void seApresentar() {
		System.out.println("Olá, eu sou o " + nome + ", e tenho " + idade + " anos.");
	}
	
}
