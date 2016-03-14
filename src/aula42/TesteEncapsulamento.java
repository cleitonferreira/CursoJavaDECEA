package aula42;

/*Encapsulamento e modificadores de acesso public - private - protected
 * A classe ArCondicionado está expondo muito suas variáveis de acesso
 * */

public class TesteEncapsulamento {

	public static void main(String[] args) {
		ArCondicionado ar = new ArCondicionado(); // 17 - 25
		
		//isso não funciona mais desse jeito
		//ar.temperatura = 21;
		//ar.temperatura = -21;
		//System.out.println("Temperatura do ar: " + ar.temperatura + "º");
		
		ar.trocarTemperatura(21);
		System.out.println("Temperatura do ar: " + ar.obterTemperatura() + "º");
		
		ar.trocarTemperatura(10);//não irá atualizar, mostrará 21
		System.out.println("Temperatura do ar: " + ar.obterTemperatura() + "º");
		
		ar.trocarTemperatura(23);
		System.out.println("Temperatura do ar: " + ar.obterTemperatura() + "º");
		
	}
	
}
