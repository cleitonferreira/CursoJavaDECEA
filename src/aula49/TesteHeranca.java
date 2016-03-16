package aula49;

/*
 * Classe java lang object
 * */

/*Toda a classe extends Object
 * por isso que possui vários métodos de acesso
 * 
 * .equals()
 * .toString()
 * 
 * Java não pode ter herança múltipla
 * 
 * public class Jogador extends Pessoa, OutraClasse {
 * 
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
