package aula20;

public class OperadorIncrementoDecremento {

	public static void main(String[] args) {
		int idade = 10;
		
		//idade = idade + 1;
		//idade += 1;
		//idade++;
		
		int novaIdade2 = ++idade;
		
		int novaIdade = --idade;
		
		System.out.println("Idade: " + idade);
		System.out.println("Nova idade: " + novaIdade);
		System.out.println("Nova idade: " + novaIdade2);
	
	}


}