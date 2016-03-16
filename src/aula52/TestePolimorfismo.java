package aula52;

/*
 * Polimorfismo, instanciof e casting de objetos
 * */

public class TestePolimorfismo {

	public static void main(String[] args) {
		Conta conta = new Conta();
		conta.setSaldo(4000);
		TestePolimorfismo.imprimirSaldo(conta);
		System.out.println();
		//--------------------------------------------------
		//dessa forma funciona tb
//		ContaCorrente contaCorrente = new ContaCorrente();
//		contaCorrente.setSaldo(3500);
//		imprimirSaldo(contaCorrente);
		Conta contaCorrente = new ContaCorrente();
		contaCorrente.setSaldo(3500);
		imprimirSaldo(contaCorrente);
		System.out.println();
		
		//isso não funciona
		//contaCorrente.getLimite;
		
		//--------------------------------------------------
		Conta contaPoupanca = new ContaPoupanca();
		contaPoupanca.setSaldo(2000);
		imprimirSaldo(contaPoupanca);
	}
	
	//isso não funciona
//	String s = "Uma String qualquer"; // String é um Objeto, mias não é uma Conta
//	imprimirSaldo(s);
	
	//Polimorfismo - significado: muitas formas
	// no nosso caso é passado vaérios objetos como
	// Conta - ContaCorrente - ContaPoupança
	public static void imprimirSaldo(Conta conta) {
		System.out.println("Saldo da conta: R$" + conta.getSaldo());
		
		//quero saber se conta é uma ContaCorrente
		// se for, faço a converção
		if (conta instanceof ContaCorrente) {
			ContaCorrente cc = (ContaCorrente) conta;//casting
			System.out.println("O limite da cc é R$" + cc.getLimite());
		}
		
		if (conta instanceof ContaPoupanca) {
			ContaPoupanca cp = (ContaPoupanca) conta;//casting
			System.out.println("O rendimento da cp é R$" + cp.getRendimentos());
		}
	}
	
	
}
