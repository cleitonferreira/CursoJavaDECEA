package aula41;

/*Construtores
 * */

public class TesteConstrutor {

	public static void main(String[] args) {
		
		//funciona, mais podemos utilizar o construtor 
//		Pessoa p11 = new Pessoa();
//		System.out.println("Nome: \"" + p11.nome + "\" tem " + p11.idade + " anos.");
		/*Nome: "null" tem 0 anos*/
		//		p11.nome = "João";
//		p11.idade = 25;
//		System.out.println("Nome: \"" + p11.nome + "\" tem " + p11.idade + " anos.");
		/*Nome: "João" tem 25 anos*/
		
		
		Pessoa p1 = new Pessoa("João");
		System.out.println("Nome: \"" + p1.nome + "\" tem " + p1.idade + " anos.");
		
		Pessoa p2 = new Pessoa("Maria", 22);
		System.out.println("Nome: \"" + p2.nome + "\" tem " + p2.idade + " anos.");
	}
	
}
