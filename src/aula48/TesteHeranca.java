package aula48;

/*
 * Herança e modificador protected
 * */

public class TesteHeranca {

	public static void main(String[] args) {
		Jogador j = new Jogador();
		j.nome = "Ronaldo";
		j.idade = 33;
		
		j.seApresentar();
		j.dizerSeAindaJoga();
		
		//Pessoa p = new Pessoa();
		//p.dizerSeAindaJoga();
		
				
	}
	
}
