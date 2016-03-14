package aula32;

public class Carro {

	String fabricante;
	String modelo;
	String cor;
	int anoDeFabricacao;

	Proprietario proprietario;
	
	//como devemos criar os nomes do método
	//funciona
	//void Ligar()
	//_void Ligar()
	
	//não funciona 
	//void 3ligar()
	//void ligar Carro()
	//void Carro()
	
	
	void ligar() {
		System.out.println("Ligando o carro: " + modelo);
	}

	@Override
	public String toString() {
		return "Carro [fabricante=" + fabricante + ", modelo=" + modelo + ", cor=" + cor + ", anoDeFabricacao="
				+ anoDeFabricacao + ", proprietario=" + proprietario + "]";
	}
	
	
}
